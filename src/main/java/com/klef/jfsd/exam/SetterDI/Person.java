package com.klef.jfsd.exam.SetterDI;

import java.util.List;

public class Person 
{
	private int id;
	private String name;
	private double age;
	private boolean status;
	private List<String>courses;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", status=" + status + ", courses=" + courses
				+ "]";
	}
	
	public Person(int id, String name, double age, boolean status, List<String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.status = status;
		this.courses = courses;
	}
}
	
	