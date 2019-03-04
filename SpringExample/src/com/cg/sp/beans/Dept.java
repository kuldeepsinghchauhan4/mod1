package com.cg.sp.beans;

public class Dept {
	private int deptNo; 
private String  deptName;
public Dept() {
	
}
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public Dept(int deptNo, String deptName) {
	super();
	this.deptNo = deptNo;
	this.deptName = deptName;
}
@Override
public String toString() {
	return "Dept [deptNo=" + deptNo + ", deptName=" + deptName + "]";
}

}
