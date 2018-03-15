package com.dong.leaf.service.impl;

import com.dong.leaf.model.User;
import com.dong.leaf.repository.UserRepository;
import com.dong.leaf.service.inf.IUserService;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by liudong on 2018/3/15
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByPhone(String phone) {
        User user = userRepository.getUserByPhone(phone);
        if(user!=null){
            return user;
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
