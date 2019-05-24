package com.mfy.mybatis.dao;

import com.mfy.mybatis.pojo.BaseDepartmentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseDepartmentInfoMapper {

    List<BaseDepartmentInfo> selectAllBaseDeparmentInfoAndUser();
}
