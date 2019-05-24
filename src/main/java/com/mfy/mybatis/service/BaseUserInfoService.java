package com.mfy.mybatis.service;


import com.mfy.mybatis.pojo.BaseUserInfo;

import java.util.List;

public interface BaseUserInfoService {

    public List<BaseUserInfo> findBaseUserInfoByUserName(BaseUserInfo b);
}
