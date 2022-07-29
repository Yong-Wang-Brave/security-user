package com.example.security20220728afternoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo getUserInfo(String username){
        return userInfoMapper.getUserInfoByUsername(username);
    }
}