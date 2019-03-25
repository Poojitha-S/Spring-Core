package com.springcore.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class springDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Sample al= context.getBean(Sample.class);
		al.show();
	}

}
