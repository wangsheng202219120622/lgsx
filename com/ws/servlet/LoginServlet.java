package com.ws.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ws.model.bo.LoginBo;
import com.ws.model.vo.UserVo;
import com.ws.service.UserService;
import com.ws.service.impl.UserServiceImpl;
import com.ws.util.RequestJSONData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      JSONObject result = new JSONObject();
        String paramsStr = RequestJSONData.ReadAsChars(req);
        LoginBo loginBo = JSONObject.parseObject(paramsStr, LoginBo.class);
        UserService userService = new UserServiceImpl();
        UserVo userVo = userService.login(loginBo);
        if(null==userVo){
            result.put("code",3001);
            result.put("msg","账号或密码错误");
        }else {
            req.getSession().setAttribute("userInfo",userVo);
            result.put("code",200);
            result.put("msg","操作成功");
        }
        resp.setContentType("application/json;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        out.println(JSON.toJSON(result));
        out.flush();
        out.close();
    }

}
