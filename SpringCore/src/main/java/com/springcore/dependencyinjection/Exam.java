package com.springcore.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	static Student student;
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentBean.xml");
		student=context.getBean("student",Student.class);
		student.diaplayStudent();
		student=context.getBean("ashok",Student.class);
		student.diaplayStudent();

	}

}
