package com.sk.springintro.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 */
public class TestMy {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "config.xml" });
		
		// Creating beans with constructor arguments (by index)
		Student student = context.getBean("student", Student.class);
		student.display();
		
		// creating beans with constructor argument (by name)
		Student student2= context.getBean("student2", Student.class);
		student2.display();
	}
}
