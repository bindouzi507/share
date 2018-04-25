package com.example.bindouzi.springbootdemo.sevice.impl;

import com.example.bindouzi.springbootdemo.dao.UserInfoDao;
import com.example.bindouzi.springbootdemo.entity.UserInfo;
import com.example.bindouzi.springbootdemo.sevice.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}