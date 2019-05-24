package com.mfy.mybatis.service.Impl;

import com.mfy.mybatis.dao.BaseUserInfoMapper;
import com.mfy.mybatis.pojo.BaseUserInfo;
import com.mfy.mybatis.service.BaseUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseUserInfoServiceImpl implements BaseUserInfoService {

    @Autowired
    private BaseUserInfoMapper baseUserInfoMapper;

    @Override
    public List<BaseUserInfo> findBaseUserInfoByUserName(BaseUserInfo b) {
        return baseUserInfoMapper.findBaseUserInfoByParam(b);
    }
}
