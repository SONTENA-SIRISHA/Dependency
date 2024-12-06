package com.klef.jfsd.exam.AutoWiring;

public class Student 
{
	private int id; 
	private String name; 
	private String gender;
	private String department;
	private int year;
	private String semester;
	private Marks marks;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department + ", year="
				+ year + ", semester=" + semester + ", marks=" + marks + "]";
	}

	public Student(int id, String name, String gender, String department, int year, String semester, Marks marks) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.year = year;
		this.semester = semester;
		this.marks = marks;
	}
	

}
