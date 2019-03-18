package com.pgzx.service.impl;

import com.pgzx.common.ServerResponse;
import com.pgzx.dao.UserMapper;
import com.pgzx.pojo.User;
import com.pgzx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
   private UserMapper userMapper;
    @Override
    public ServerResponse<User> login(String username, String password) {
            int resultCount=   userMapper.checkUsername(username);
            if(resultCount==0){
                return ServerResponse.createByErrorMessage("用户名不存在");
            }
            User user=userMapper.login(username,password);
            if (user ==null){
                return ServerResponse.createByErrorMessage("密码错误");
            }
        return ServerResponse.createBySuccess("登录成功",user);
    }
}
