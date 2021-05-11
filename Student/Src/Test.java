package com.project.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/project/Student/Config.xml");
		Student Std = (Student) context.getBean("stud");
		System.out.println(Std);
	}
}
