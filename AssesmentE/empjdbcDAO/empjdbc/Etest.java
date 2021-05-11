package com.springcore.empjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.empjdbc.DAO.EmployeeDAO;
import com.springcore.empjdbc.Entities.Employee;

public class Etest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Spring JDBC.......Employee ");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/empjdbc/Econfig.xml");
		/*JdbcTemplate spring = (JdbcTemplate)context.getBean("jdbctemplate");
		String query = "insert into Employee(Emp_ID,Emp_Name, Emp_City) values (?,?,?)";
		int result = spring.update(query,124,"Sam","Chennai");
		System.out.println("Records are Inserted Successfully"+result);*/
		
		EmployeeDAO spring = (EmployeeDAO) context.getBean("EmpDAO");
		Employee employee = new Employee();
		employee.setEmp_ID(125);
		employee.setEmp_Name("steve");
		employee.setEmp_City("Bangalore");
		int result = spring.insert(employee);
		System.out.println("Record Inserted....."+result);
	}
}