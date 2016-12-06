package com.amex.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		// Load the spring configuration from xml
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		// Obtain the bean from context
		Piano piano = (Piano) context.getBean("piano");
		System.out.println(piano.playMusic());
	}

}
