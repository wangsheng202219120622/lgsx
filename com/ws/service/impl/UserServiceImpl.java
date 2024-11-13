package com.ws.service.impl;

import com.ws.model.bo.LoginBo;
import com.ws.model.vo.UserVo;
import com.ws.service.UserService;

import com.ws.util.JDBC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserServiceImpl implements UserService {
    @Override
    public UserVo detail(Integer userId) {
        JDBC dbUtil=new JDBC();
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet rs=null;
        UserVo vo=new UserVo();
        try{
            connection=dbUtil.getConnection();
            preparedStatement=connection.prepareStatement("select * from lg_user where id="+userId);
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {
                vo.setId(rs.getInt("id"));
                vo.setAccount(rs.getString("account"));
                vo.setPassword(rs.getString("password"));
                vo.setNickName(rs.getString("nick_name"));
                vo.setAmountOfMoney(rs.getLong("amount_of_money"));
                vo.setIntegral(rs.getLong("integral"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(connection!=null)connection.close();
                if(preparedStatement!=null)preparedStatement.close();
                if(rs!=null)rs.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return vo;
    }

    @Override
    public UserVo login(LoginBo loginBo) {
        JDBC dbUtil=new JDBC();
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet rs=null;
        UserVo vo=null;
        try{
            connection=dbUtil.getConnection();
            preparedStatement=connection.prepareStatement("select * from lg_user where account='"+loginBo.getAccount()+"'and password='"+loginBo.getPassword()+"'");
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {
                vo=new UserVo();
                vo.setId(rs.getInt("id"));
                vo.setAccount(rs.getString("account"));
                vo.setPassword(rs.getString("password"));
                vo.setNickName(rs.getString("nick_name"));
                vo.setAmountOfMoney(rs.getLong("amount_of_money"));
                vo.setIntegral(rs.getLong("integral"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(connection!=null)connection.close();
                if(preparedStatement!=null)preparedStatement.close();
                if(rs!=null)rs.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return vo;
    }
    //注册

}
