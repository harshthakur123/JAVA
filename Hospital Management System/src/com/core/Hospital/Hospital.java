package com.core.Hospital;
//Doctor class contains :(DocID int, Dname string, email string, 
//Degree string, joining_date sdf, salary double, experience int, 

import java.io.Serializable;
import java.time.LocalDate;

import Enum.Department;

public class Hospital implements Serializable{

	private int docID,experience;
	private String email,degree;
	private LocalDate joining_date;
	private double salary;
	private Department dept; 
	private String dname;
	
	public Hospital(int docID,String dname, int experience, Department dept, String email, String degree, LocalDate joining_date,
			double salary) {
		super();
		this.docID = docID;
		this.experience = experience;
		this.dname = dname;
		this.email = email;
		this.degree = degree;
		this.joining_date = joining_date;
		this.salary = salary;
		this.dept=dept;
	}
	
	public Hospital(String email) {
		super();
		this.email = email;
	}
	
	
	
	public Hospital(Integer key, Hospital value) {
		// TODO Auto-generated constructor stub
	}

	

	public int getDocID() {
		return docID;
	}

	public void setDocID(int docID) {
		this.docID = docID;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public LocalDate getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(LocalDate joining_date) {
		this.joining_date = joining_date;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "docID=" + docID + ", experience=" + experience + ", dname=" + dname +",dept="+dept+ ", email=" + email
				+ ", degree=" + degree + ", joining_date=" + joining_date + ", salary=" + salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Hospital)
			return this.email.equals(((Hospital) obj).email);
		return false;
	}
	
	
}
