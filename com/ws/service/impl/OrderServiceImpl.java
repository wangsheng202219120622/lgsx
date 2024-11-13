package com.ws.service.impl;

import com.ws.model.bo.OrderBo;
import com.ws.model.vo.CommodityVo;
import com.ws.model.vo.UserVo;
import com.ws.service.CommodityService;
import com.ws.service.OrderService;
import com.ws.service.UserService;
import com.ws.util.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class OrderServiceImpl implements OrderService {

    @Override
    //检验信息
    public int validRemainingAmount(OrderBo orderBo) {
        //0成功
        int result = 0;
        UserService userService = new UserServiceImpl();
        CommodityService commodityService = new CommodityServiceImpl();
        //获取用户+商品最新信息
        UserVo userVo = userService.detail(orderBo.getUserId());
        CommodityVo commodityVo = commodityService.detail(orderBo.getCommodityCode());
        //获取余额
        Long userAmount = userVo.getAmountOfMoney();
        //判断是否抵扣积分（分）
        if (orderBo.getUseIntegral()) {
            userAmount = userAmount + userVo.getIntegral();
        }
        //量不够
        if (commodityVo.getQuantity() <= 0) {
            return 1;
        }
        //钱不够
        if (userAmount < commodityVo.getPrice()) {
            return 2;
        }
        return result;
    }
    @Override

    //提交订单   扣钱***************
    public synchronized void submitOrder(OrderBo orderBo) {
        //JDBC连接数据库
        JDBC jdbc = new JDBC();
        Connection connection = null;
        try {
            connection = jdbc.getConnection();
            //默认不提交订单
            connection.setAutoCommit(false);
            UserService userService = new UserServiceImpl();
            //三张表修改
            CommodityService commodityService = new CommodityServiceImpl();
            //获取用户 商品信息
            UserVo userVo = userService.detail(orderBo.getUserId());
            CommodityVo commodityVo = commodityService.detail(orderBo.getCommodityCode());
            //扣钱
            PreparedStatement userStatement = userAmountDeduction(connection, orderBo.getUserId(), commodityVo.getPrice(), orderBo.getUseIntegral(), userVo.getIntegral());
            PreparedStatement commodityStatement = connection.prepareStatement("UPDATE lg_commodity SET quantity=quantity-1 WHERE id=" + commodityVo.getId());
            PreparedStatement orderStatement = addOrder(connection, userVo, commodityVo, orderBo);
            // execute修改
            userStatement.execute();
            commodityStatement.execute();
            orderStatement.execute();
            //修改结束
            connection.commit();//提交事务  对应false
        } catch (Exception e) {
            try {
                //回滚：数据恢复
                connection.rollback();
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
            //
            e.printStackTrace();
        }finally {
            try{
                if(connection != null){
                    connection.close();
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    //  三个补充函数
    //  总数
    private PreparedStatement userAmountDeduction(Connection connection,Integer userId,Long commodityPrice,Boolean isUseIntegral,Long integral)throws SQLException{
    //保存钱
    Long price = commodityPrice;
    PreparedStatement userStatement = connection.prepareStatement("update lg_user set amout_of_money=amount_of_money-"+price+"where id="+userId);
    if(isUseIntegral)
    {
        price = commodityPrice - integral;
        userStatement = connection.prepareStatement("update lg_user set amount_of_money=amount_of_money-"+price+",integral=0 where id="+userId);
    }else{
        userStatement = connection.prepareStatement("update lg_user set amount_of_money=amount_of_money-" + price + " where id=" + userId);
    }
    return userStatement;
}
    // 创建order订单
    private PreparedStatement addOrder(Connection connection, UserVo userVo, CommodityVo commodityVo, OrderBo orderBo)throws SQLException {
        PreparedStatement orderStatement = connection.prepareStatement("insert into lg_order(order_no,user_id,user_nick_name,commodity_code,commodity_name,purchase_price,consume_integral,address,consignee,phone)values(?,?,?,?,?,?,?,?,?,?)");

        orderStatement.setString(1,randomNumber());
        orderStatement.setInt(2,userVo.getId());
        orderStatement.setString(3,userVo.getNickName());
        orderStatement.setString(4, commodityVo.getCode());
        orderStatement.setString(5, commodityVo.getName());
        orderStatement.setLong(6, commodityVo.getPrice());
        orderStatement.setLong(7,0);
        if(orderBo.getUseIntegral()){
            orderStatement.setLong(7,userVo.getIntegral());
        }
        orderStatement.setString(8,orderBo.getAddress());
        orderStatement.setString(9,orderBo.getConsignee());
        orderStatement.setString(10,orderBo.getPhone());
        return orderStatement;
    }
    //  随机
    public String randomNumber() {
        String value="";
        Random rnd = new Random();
        final  int[] sd={0,1,2,3,4,5,6,7,8,9};
        StringBuffer buffer=new StringBuffer("DW");
        for(int i=0;i<4;i++){
            value=buffer.append(sd[rnd.nextInt(sd.length)]).toString();
        }
        return value;
    }
}
