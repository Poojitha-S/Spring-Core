package com.springcore.dependencyinjection;

public class Student {
	private String studentName;
	private String id;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void diaplayStudent()
	{
		System.out.println("Student name : "+studentName);
		System.out.println("Student id : "+id);
	}
}
