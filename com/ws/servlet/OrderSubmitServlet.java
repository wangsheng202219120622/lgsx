package com.ws.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ws.model.bo.OrderBo;
import com.ws.model.vo.UserVo;
import com.ws.service.OrderService;
import com.ws.service.impl.OrderServiceImpl;
import com.ws.util.RequestJSONData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//提交订单信息
public class OrderSubmitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strData = RequestJSONData.ReadAsChars(req);
        OrderBo orderBo = JSONObject.parseObject(strData, OrderBo.class);

        UserVo userinfo = (UserVo) req.getSession().getAttribute("userInfo");
        JSONObject result = new JSONObject();
        if(null==userinfo){
            result.put("code",3000);
            result.put("msg","登录失败，请重新登录");
        }
        else//
        {
            orderBo.setUserId(userinfo.getId());
            OrderService orderService = new OrderServiceImpl();
            int userAmountValid=orderService.validRemainingAmount(orderBo);
            if(userAmountValid==0){
                //提交订单
                orderService.submitOrder(orderBo);
                result.put("code",200);
                result.put("msg","操作成功");
            }else if(userAmountValid==1){
                result.put("code",3004);
                result.put("msg","商品数量不足，请重新选择商品下单");
            }else if(userAmountValid==2){
                result.put("code",3005);
                result.put("msg","余额不足，请充值");
            }
        }
        resp.setContentType("application/json;charset=utf-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(JSON.toJSON(result));
        out.flush();
        out.close();
    }
}
