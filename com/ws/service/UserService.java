package com.ws.service;

import  com.ws.model.bo.LoginBo;
import com.ws.model.vo.UserVo;


public interface UserService {

    UserVo detail(Integer userId);

    UserVo login(LoginBo loginBo);


}
