
package com.ws.util;

import com.alibaba.fastjson.JSON;
import com.ws.model.bean.Commodity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {

    private final String url = "jdbc:mysql://localhost:3306/lgsx";

    private final String userName = "root";

    private final String password= "123456";

    private Connection con;

    /**
     * 初始化数据库连接
     */
    public JDBC() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //JDBC4.0后,Java 6开始，JDBC提供了自动驱动发现机制
            con = DriverManager.getConnection(url,userName,password);
        }catch (SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }
    }

    public Connection getConnection(){
        return con;
    }
    /**
     * 关闭数据库连接
     */
    public void close(){
        try{
            con.close();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }

    }
    public static void main(String[] args) throws SQLException {
        JDBC jdbc = new JDBC();
        PreparedStatement ps = jdbc.getConnection().prepareStatement("select * from lg_commodity;");
        ResultSet rs = ps.executeQuery();
        List<Commodity> data = new ArrayList<>();
        while (rs.next()){
            Commodity commodity = new Commodity();
            commodity.setId(rs.getInt("id"));
            commodity.setCode(rs.getString("code"));
            commodity.setName(rs.getString("name"));
            commodity.setPrice(rs.getLong("price"));
            commodity.setQuantity(rs.getInt("quantity"));
            data.add(commodity);
        }
        data.forEach(o->{
            System.out.println(JSON.toJSON(o));
        });

    }

}



