package com.klef.jfsd.SpringCoreProjectDemo;

public class Student 
{
	private int id;
	private String name;
	private String department;
	private String course;
	private String Contact;
	private Faculty faculty;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", course=" + course
				+ ", Contact=" + Contact + ", faculty=" + faculty + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
}
