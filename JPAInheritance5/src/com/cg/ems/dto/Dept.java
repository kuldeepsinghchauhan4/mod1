package com.cg.ems.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_master")
public class Dept {
	@Id
	@Column(name="dept_code",length=10)
private int deptCode;
	@Column(name="dept_name",length=20)
private String deptName;
	//persist all entities
	@OneToMany(cascade=CascadeType.ALL,mappedBy="empDept")
	private Set<Emp> empset=new HashSet<Emp>();
	
	public Set<Emp> getEmpset() {
		return empset;
	}
	public void setEmpset(Set<Emp> empset) {
		this.empset = empset;
	}
	public int getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Dept [deptCode=" + deptCode + ", deptName=" + deptName + "]";
	}
	public Dept(int deptCode, String deptName) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
	}
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	
}
