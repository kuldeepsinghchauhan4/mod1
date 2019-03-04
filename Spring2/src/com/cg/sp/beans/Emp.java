package com.cg.sp.beans;

import java.time.LocalDate;
import java.util.ArrayList;

public class Emp {
private int EmpID;
private String name;
private double sal;
private LocalDate joinDate;
private ArrayList<String> skills;


@Override
public String toString() {
	return "Emp [EmpID=" + EmpID + ", name=" + name + ", sal=" + sal + ", joinDate=" + joinDate + ", skills=" + skills
			+ "]";
}
public ArrayList<String> getSkills() {
	return skills;
}
public void setSkills(ArrayList<String> skills) {
	this.skills = skills;
}
public int getEmpID() {
	return EmpID;
}
public LocalDate getJoinDate() {
	return joinDate;
}
public void setJoinDate(LocalDate joinDate) {
	this.joinDate = joinDate;
}
public void setEmpID(int empID) {
	EmpID = empID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}

}
