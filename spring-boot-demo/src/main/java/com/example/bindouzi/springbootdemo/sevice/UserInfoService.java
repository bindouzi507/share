package com.example.bindouzi.springbootdemo.sevice;


import com.example.bindouzi.springbootdemo.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);
}