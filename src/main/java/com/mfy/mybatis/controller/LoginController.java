package com.mfy.mybatis.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mfy.mybatis.dao.BaseDepartmentInfoMapper;
import com.mfy.mybatis.dao.BaseUserInfoMapper;
import com.mfy.mybatis.pojo.BaseDepartmentInfo;
import com.mfy.mybatis.pojo.BaseUserInfo;
import com.mfy.mybatis.service.BaseUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class LoginController {
    
    @Autowired
    private BaseUserInfoService baseUserInfoService;

    @Autowired
    private BaseUserInfoMapper baseUserInfoMapper;

    @Autowired
    private BaseDepartmentInfoMapper baseDepartmentInfoMapper;

    @RequestMapping("/login")
    @ResponseBody
    public List<BaseUserInfo> login(BaseUserInfo b){
        List<BaseUserInfo> list = baseUserInfoService.findBaseUserInfoByUserName(b);
        return list;
    }

    @RequestMapping("/allUser")
    @ResponseBody
    public PageInfo<BaseUserInfo> login(){
        PageHelper.startPage(2, 10);
        List<BaseUserInfo> baseUserInfos = baseUserInfoMapper.selectAllBaseUserInfo();
        PageInfo<BaseUserInfo> pageInfo = new PageInfo<BaseUserInfo>(baseUserInfos);
        System.out.println("当前页妈:"+pageInfo.getPageNum());
        System.out.println("总记录属:"+pageInfo.getTotal());
        System.out.println("每页记录数:"+pageInfo.getPageSize());
        System.out.println("总页码:"+pageInfo.getPages());
        return pageInfo;
    }

    @RequestMapping("/allUserAndDp")
    @ResponseBody
    public List<BaseUserInfo> allUser(){
        List<BaseUserInfo> baseUserInfos = baseUserInfoMapper.selectAllBaseUserInfoAndDempartment();
        return baseUserInfos;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(BaseUserInfo b){
        int insert = baseUserInfoMapper.insertBaseUserInfo(b);
        return insert;
    }

    @RequestMapping("/sex")
    @ResponseBody
    public int insert(){
        int [] sex = {0};
        int count = baseUserInfoMapper.findBaseUserInfoBySex(sex);
        return count;
    }

    @RequestMapping("/AllDb")
    @ResponseBody
    public List<BaseDepartmentInfo> allDb(){
        List<BaseDepartmentInfo> list = baseDepartmentInfoMapper.selectAllBaseDeparmentInfoAndUser();
        return list;
    }

}
