package com.syh.service;

import com.syh.common.ServerResponse;
import com.syh.pojo.User;

/**
 * Created by syh on 2018/2/5.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
