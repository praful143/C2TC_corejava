package com.cg.statickeyword;
public class Student {
	
	//Instance Variable
	private int id;
	private String name;
	private static String collegename="XYZ";
	
	static {
		collegename="MGM";
	}
	
	//user defined parameterized constructor
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//static method can access static data
	public void change() {
		collegename="ABC";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	//to string method
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collegename=" + collegename + "]";
	}
	
	
	
}