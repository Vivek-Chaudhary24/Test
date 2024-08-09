package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.collections.Employee;
import com.springcore.withoutxml.Javaconfig;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Javaconfig.class);
		Employee emp1= (Employee) context.getBean("employee");
		
		System.out.println(emp1);
			}

}
