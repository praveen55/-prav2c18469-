package com.project.Student;

public class Student {
	
	private int id;
	private String Name;
	private String City;
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		Name = name;
		City = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", City=" + City + "]";
	}
}
