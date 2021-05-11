package com.springcore.empjdbc;

public class Employee {

		private int Emp_ID;
		private String Emp_Name;
		private String Emp_City;
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Employee(int emp_ID, String emp_Name, String emp_City) {
			super();
			Emp_ID = emp_ID;
			Emp_Name = emp_Name;
			Emp_City = emp_City;
		}

		public int getEmp_ID() {
			return Emp_ID;
		}

		public void setEmp_ID(int emp_ID) {
			Emp_ID = emp_ID;
		}

		public String getEmp_Name() {
			return Emp_Name;
		}


		public void setEmp_Name(String emp_Name) {
			Emp_Name = emp_Name;
		}

		public String getEmp_City() {
			return Emp_City;
		}

		public void setEmp_City(String emp_City) {
			Emp_City = emp_City;
		}
		
		@Override
		public String toString() {
			return "Employee [Emp_ID=" + Emp_ID + ", Emp_Name=" + Emp_Name + ", Emp_City=" + Emp_City + "]";
		}
}
