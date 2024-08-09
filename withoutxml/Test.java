package com.springcore.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!"); 
		ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
	       Employee emp1=(Employee) context.getBean("employee");
	       System.out.println(emp1);
	       	}

}
