package com.mph.model;

public class Employee {

	private int eid;
	private String ename;

	public Employee() {
		System.out.println("From Emp constr...");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public String toString() {
		return "EiD : " + eid + "   " + "Emp name : " + ename;
	}

}