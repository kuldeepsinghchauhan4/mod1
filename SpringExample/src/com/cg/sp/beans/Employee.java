package com.cg.sp.beans;

import java.util.ArrayList;

public class Employee {
private String firstName;
private String lasttName;
private int  age;
Dept dept;
/*ArrayList<String> skills;

public ArrayList<String> getSkills() {
	return skills;
}
public void setSkills(ArrayList<String> skills) {
	this.skills = skills;
}*/
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLasttName() {
	return lasttName;
}
public void setLasttName(String lasttName) {
	this.lasttName = lasttName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Dept getDept() {
	return dept;
}
public void setDept(Dept dept) {
	this.dept = dept;
}
public void m1() {
	System.out.println("do some init work here");
}
public void m2() {
	System.out.println("do clean up work");
}
public Employee(String firstName, String lasttName, int age, Dept dept) {
	super();
	this.firstName = firstName;
	this.lasttName = lasttName;
	this.age = age;
	this.dept = dept;
}
public Employee(Dept d2) {
	this.dept=d2;
}
public Employee() {
	super();
	
}
@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lasttName=" + lasttName + ", age=" + age + ", dept=" + dept + "]";
}



}
