package com.ws.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ws.model.vo.CommodityVo;
import com.ws.model.vo.UserVo;
import com.ws.service.CommodityService;
import com.ws.service.UserService;
import com.ws.service.impl.CommodityServiceImpl;
import com.ws.service.impl.UserServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class  CommodityDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        CommodityService service=new CommodityServiceImpl();
        CommodityVo vo=service.detail(Integer.parseInt(id));
        //userInfo 获取数据  
        UserVo userVo= (UserVo) req.getSession().getAttribute("userInfo");
        UserService userService=new UserServiceImpl();
        JSONObject result = new JSONObject();
        vo.setUserVo(userService.detail(userVo.getId()));
            result.put("data", vo);
            result.put("code", 200);
            result.put("msg", "操作成功");
        resp.setContentType("application/json;charset=utf-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(JSON.toJSON(result));
        out.flush();
        out.close();
    }
}
