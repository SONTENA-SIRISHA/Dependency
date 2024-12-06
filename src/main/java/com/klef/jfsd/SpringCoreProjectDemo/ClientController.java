package com.klef.jfsd.SpringCoreProjectDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController {

	public static void main(String[] args) 
	{
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		  System.out.println("****Dependency Injection Using SetterDI Methods****"); 
	      Student s = context.getBean(Student.class, "studentbean");  
	      System.out.println(s.toString());
		  
//		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
//		  System.out.println("****Dependency Injection Using ConstuctorDI Methods****"); 
//		  Faculty f = context.getBean(Faculty.class, "facultybean");  
//		  System.out.println(f.toString());
 
		  
		  context.close();

		

	}

}
