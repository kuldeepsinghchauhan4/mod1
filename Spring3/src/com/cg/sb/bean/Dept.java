package com.cg.sb.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.*;
@Component
public class Dept {
@Value("10")
private int deptNo;
@Value("IT")
private String deptName;
@Override
public String toString() {
	return "Dept [deptNo=" + deptNo + ", deptName=" + deptName + "]";
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

}
