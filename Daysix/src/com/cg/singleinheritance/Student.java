package com.cg.singleinheritance;
public class Student extends Citizen {

	private int rollno;
	private String CollegeName;
	public Student() {
		super();
	}
	
	public Student(int rollno, String collegeName) {
		super();
		this.rollno = rollno;
		CollegeName = collegeName;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", CollegeName=" + CollegeName + ", getRollno()=" + getRollno()
				+ ", getCollegeName()=" + getCollegeName() + ", getName()=" + getName() + ", getAadharno()="
				+ getAadharno() + ", getAddress()=" + getAddress() + ", getPhoneno()=" + getPhoneno() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}