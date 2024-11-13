package com.ws.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ws.model.bo.CommodityQueryBo;
import com.ws.model.vo.CommodityVo;
import com.ws.service.CommodityService;
import com.ws.service.impl.CommodityServiceImpl;
import com.ws.util.RequestJSONData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import com.ws.util.Page;

public class CommodityPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("start");
        String strData = RequestJSONData.ReadAsChars(req);
        CommodityQueryBo queryBo = JSONObject.parseObject(strData, CommodityQueryBo.class);
        if(queryBo==null){ queryBo=new CommodityQueryBo();}
        CommodityService service=new CommodityServiceImpl();
        Page<CommodityVo> data =service.pageQuery(queryBo);
        JSONObject result = new JSONObject();
        result.put("data",data);    
        if(data==null)
        {
            System.out.println("数据空");

        }
        else {
            result.put("data", data);
            result.put("code", 200);
            result.put("msg", "操作成功");
        }
        resp.setContentType("application/json;charset=utf-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(JSON.toJSON(result));
        out.flush();
        out.close();
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("start");
        String strData = RequestJSONData.ReadAsChars(req);
        CommodityQueryBo queryBo = JSONObject.parseObject(strData, CommodityQueryBo.class);
        if(queryBo==null){ queryBo=new CommodityQueryBo();}
        CommodityService service=new CommodityServiceImpl();
        Page<CommodityVo> data =service.pageQuery(queryBo);
        JSONObject result = new JSONObject();
        result.put("data",data);
        if(data==null)
        {
            System.out.println("数据空");

        }
        else {
            result.put("data", data);
            result.put("code", 200);
            result.put("msg", "操作成功");
        }
        resp.setContentType("application/json;charset=utf-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(JSON.toJSON(result));
        out.flush();
        out.close();
    }
}

