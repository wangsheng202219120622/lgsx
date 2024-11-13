package com.ws.service.impl;

import com.ws.model.bo.CommodityQueryBo;
import com.ws.model.vo.CommodityVo;
import com.ws.service.CommodityService;
import com.ws.util.JDBC;
import com.ws.util.Page;
import com.ws.util.Pageable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommodityServiceImpl implements CommodityService {
    @Override
    public Page<CommodityVo> pageQuery(CommodityQueryBo queryBo) {
        JDBC jdbc = new JDBC();
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatementCount=null;
        ResultSet rs = null;
        ResultSet rsCount=null;
        List<CommodityVo> list = new ArrayList<>();
        Pageable pageable=new Pageable(queryBo.getCurrent(),queryBo.getSize());
        Integer total=0;
        Page<CommodityVo> page=null;
        try {
            StringBuffer sb = new StringBuffer("select * from lg_commodity");
            StringBuffer countSql = new StringBuffer("select count(id) totalNumber from lg_commodity");
            StringBuffer condition = new StringBuffer(" where 1=1 ");
            if (queryBo.getCode() != null && !"".equals(queryBo.getCode())) {
                condition.append(" and code='").append(queryBo.getCode()).append("'");
            }
            if (queryBo.getName() != null && !"".equals(queryBo.getName())) {
                condition.append(" and name like '%").append(queryBo.getName()).append("%'");
            }
            sb.append(condition);
            countSql.append(condition);
            sb.append("limit ").append(pageable.getStarRow()).append(",").append(pageable.getPageQuantity());
            preparedStatement = jdbc.getConnection().prepareStatement(sb.toString());
            preparedStatementCount = jdbc.getConnection().prepareStatement(countSql.toString());
            rs = preparedStatement.executeQuery();
            rsCount = preparedStatementCount.executeQuery();
            while (rs.next()) {
                CommodityVo vo = new CommodityVo();
                vo.setId(rs.getInt("id"));
                vo.setCode(rs.getString("code"));
                vo.setName(rs.getString("name"));
                vo.setPrice(rs.getLong("price"));
                vo.setQuantity(rs.getInt("quantity"));
                list.add(vo);
            }
            while (rsCount.next()) {
                total=rsCount.getInt("totalNumber");
            }
            page=new Page(queryBo.getCurrent(), queryBo.getSize(), total,list);
        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return page;
    }
    @Override
    public CommodityVo detail(Integer id)
    {
        JDBC jdbc = new JDBC();
        PreparedStatement preparedStatement = null;
        ResultSet rs=null;
        CommodityVo vo =null;
        try{
            preparedStatement =jdbc.getConnection().prepareStatement("Select  * from lg_commodity where id="+id);
            rs = preparedStatement.executeQuery();
            vo = new CommodityVo();
            while (rs.next()) {
                vo.setId(rs.getInt("id"));
                vo.setCode(rs.getString("code"));
                vo.setName(rs.getString("name"));
                vo.setPrice(rs.getLong("price"));
                vo.setQuantity(rs.getInt("quantity"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            try{
                jdbc.close();
                preparedStatement.close();
                rs.close();
            }catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return vo;
    }
//11-8-3

    public CommodityVo detail(String code) {
        JDBC jdbc = new JDBC();
        PreparedStatement preparedStatement = null;
        ResultSet rs=null;
        CommodityVo vo =null;
        try{
            preparedStatement =jdbc.getConnection().prepareStatement("Select  * from lg_commodity where code="+code);
            rs = preparedStatement.executeQuery();
            vo = new CommodityVo();
            while (rs.next()) {
                vo.setId(rs.getInt("id"));
                vo.setCode(rs.getString("code"));
                vo.setName(rs.getString("name"));
                vo.setPrice(rs.getLong("price"));
                vo.setQuantity(rs.getInt("quantity"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            try{
                jdbc.close();
                preparedStatement.close();
                rs.close();
            }catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return vo;
    }
}