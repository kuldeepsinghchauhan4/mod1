package com.cg.ems.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_master")
public class Emp {
	@Id
	@Column(name="emp_id",length=10)
	private int empID;
	@Column(name="emp_name",length=25)
	private String empName;
	@Column(name="emp_sal",length=10)
	private float empSal;
	@ManyToOne
	@JoinColumn(name="dept_code")
	private Dept empDept;
	
	
	public Emp(int empID, String empName, float empSal, Dept empDept) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Dept getEmpDept() {
		return empDept;
	}
	public void setEmpDept(Dept empDept) {
		this.empDept = empDept;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Emp [empID=" + empID + ", empName=" + empName + ", empSal=" + empSal + ", empDept=" + empDept + "]";
	}

	
}
