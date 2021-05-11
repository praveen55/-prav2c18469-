package com.springcore.empjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Etest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Spring JDBC.......Employee ");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/empjdbc/Econfig.xml");
		JdbcTemplate spring = (JdbcTemplate)context.getBean("jdbctemplate");
		String query = "insert into Employee(Emp_ID,Emp_Name, Emp_City) values (?,?,?)";
		int result = spring.update(query,123,"Praveen","Salem");
		System.out.println("Records are Inserted Successfully"+result);
	}
}
