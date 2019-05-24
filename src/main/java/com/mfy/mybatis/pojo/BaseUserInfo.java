package com.mfy.mybatis.pojo;


public class BaseUserInfo {

    private String userInfoId;

    private String userName;

    private String userNumber;

    private String rankOrder;

    private String phoneNo;

    private String email;

    private String sex;

    private String imei;

    private String note;

    private Integer enabled;

    private Long updateTime;

    private Integer hiddenPhoneNo;

    private String fileName;

    private String lognoName;

    private String permission;

    private String departmentInfoId;

    private BaseDepartmentInfo dp;

    public BaseDepartmentInfo getDp() {
        return dp;
    }

    public void setDp(BaseDepartmentInfo dp) {
        this.dp = dp;
    }

    public String getDepartmentInfoId() {
        return departmentInfoId;
    }

    public void setDepartmentInfoId(String departmentInfoId) {
        this.departmentInfoId = departmentInfoId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getLognoName() {
        return lognoName;
    }

    public void setLognoName(String lognoName) {
        this.lognoName = lognoName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getRankOrder() {
        return rankOrder;
    }

    public void setRankOrder(String rankOrder) {
        this.rankOrder = rankOrder;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getHiddenPhoneNo() {
        return hiddenPhoneNo;
    }

    public void setHiddenPhoneNo(Integer hiddenPhoneNo) {
        this.hiddenPhoneNo = hiddenPhoneNo;
    }



}
