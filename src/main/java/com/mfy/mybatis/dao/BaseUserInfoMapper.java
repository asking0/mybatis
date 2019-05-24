package com.mfy.mybatis.dao;

import com.mfy.mybatis.pojo.BaseUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaseUserInfoMapper {

    int insert(BaseUserInfo record);

    int insertBaseUserInfo(BaseUserInfo record);

    List<BaseUserInfo> findBaseUserInfoByParam(BaseUserInfo record);

    List<BaseUserInfo> selectAllBaseUserInfo();

    int findBaseUserInfoBySex(@Param("list") int[] list);

    List<BaseUserInfo> selectAllBaseUserInfoAndDempartment();
}