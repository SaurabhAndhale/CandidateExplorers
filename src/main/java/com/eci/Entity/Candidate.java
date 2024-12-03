package com.eci.Entity;

public class Candidate {

	private int c_id;
	private String cname;
	private String pname;
	private String assembly;
	private String state;
	private String gender;
	private int age;

	public Candidate() {
		super();
	}

	public Candidate(int c_id, String cname, String pname, String assembly, String state, String gender, int age) {
		super();
		this.c_id = c_id;
		this.cname = cname;
		this.pname = pname;
		this.assembly = assembly;
		this.state = state;
		this.gender = gender;
		this.age = age;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPname() {
		return pname;
	}

	public void setPnmae(String pame) {
		this.pname = pname;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [cname=" + cname + ", pname=" + pname + ", assembly=" + assembly + ", state=" + state + "]";
	}

}
