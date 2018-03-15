package com.dong.leaf.service.inf;

import com.dong.leaf.model.User;

/**
 * Create by liudong on 2018/3/15
 */
public interface IUserService {

    User findUserByPhone(String phone);

    void addUser(User user);
}
