package com.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Airtel airtel=(Airtel) context.getBean("airtel");
		airtel.calling();
		airtel.data();
		Sim sim=context.getBean("voda",Vodaphone.class);
		sim.calling();
		sim.data();
	}

}
