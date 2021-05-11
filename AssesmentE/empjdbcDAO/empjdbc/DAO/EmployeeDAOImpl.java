package com.springcore.empjdbc.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.empjdbc.Entities.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public EmployeeDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "EmployeeDAOImpl [jdbctemplate=" + jdbctemplate + "]";
	}

	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		String query = "insert into Employee(Emp_ID,Emp_Name,Emp_City) values (?,?,?)";
		int result = this.jdbctemplate.update(query,employee.getEmp_ID(),employee.getEmp_Name(),employee.getEmp_City());
		return result;
	}
}