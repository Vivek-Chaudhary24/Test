package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!"); 
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collections.config.out.xml");
	       Employee emp1=(Employee) context.getBean("emp1");
	       System.out.println(emp1.getName());
	       System.out.println(emp1.getPhones());
	       System.out.println(emp1.getAddresses());
	       System.out.println(emp1.getCourses());
	       //System.out.println(emp1);
	}

}
