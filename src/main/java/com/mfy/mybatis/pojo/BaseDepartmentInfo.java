package com.mfy.mybatis.pojo;


import java.util.List;

public class BaseDepartmentInfo {
	
	private	String	departmentInfoId;
	
	private	String	departmentName;
	
	private	String	departmentOrder;
	
	private	String	departmentFullName;
	
	private	String	parentDepartmentId;
	
	private	String	parentDepartmentName;
	
	private	String	note;

	private	Integer	enabled;
	
	private	Long	updateTime;

	private List<BaseUserInfo> bu;

	public List<BaseUserInfo> getBu() {
		return bu;
	}

	public void setBu(List<BaseUserInfo> bu) {
		this.bu = bu;
	}

	public String getDepartmentInfoId() {
		return departmentInfoId;
	}

	public void setDepartmentInfoId(String departmentInfoId) {
		this.departmentInfoId = departmentInfoId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentOrder() {
		return departmentOrder;
	}

	public void setDepartmentOrder(String departmentOrder) {
		this.departmentOrder = departmentOrder;
	}

	public String getDepartmentFullName() {
		return departmentFullName;
	}

	public void setDepartmentFullName(String departmentFullName) {
		this.departmentFullName = departmentFullName;
	}

	public String getParentDepartmentId() {
		return parentDepartmentId;
	}

	public void setParentDepartmentId(String parentDepartmentId) {
		this.parentDepartmentId = parentDepartmentId;
	}

	public String getParentDepartmentName() {
		return parentDepartmentName;
	}

	public void setParentDepartmentName(String parentDepartmentName) {
		this.parentDepartmentName = parentDepartmentName;
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
	
	
}
