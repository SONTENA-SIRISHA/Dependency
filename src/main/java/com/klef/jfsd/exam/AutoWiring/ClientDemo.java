package com.klef.jfsd.exam.AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klef.jfsd.exam.AutoWiring.Student;


public class ClientDemo {

	public static void main(String[] args) 
	{
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	  System.out.println("****Dependency Injection Using AutoWiring Method****"); 
	  Student s = context.getBean(Student.class, "studbean"); 
	  System.out.println(s.toString()); 

		  context.close();

	}

}
