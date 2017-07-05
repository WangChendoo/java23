package com.ksit.entity;

import java.util.List;

public class Dept {
	private int id;
	private String deptName;
	private List<Account> accList;
	
	public List<Account> getAccList() {
		return accList;
	}
	public void setAccList(List<Account> accList) {
		this.accList = accList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	} 
	
	
}
