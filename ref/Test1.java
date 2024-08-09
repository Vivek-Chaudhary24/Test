package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!"); 
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/collections.config.ref.xml");
	       B temp=(B) context.getBean("bref");
	          System.out.println(temp);

	}

}
