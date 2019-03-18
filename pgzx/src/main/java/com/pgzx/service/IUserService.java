package com.pgzx.service;

import com.pgzx.common.ServerResponse;
import com.pgzx.pojo.User;

public interface IUserService {
    ServerResponse <User> login(String username,String password);
}
