package com.klef.jfsd.AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.klef.jfsd.AutoWiring.Course;


public class ClientDemo2 {

	public static void main(String[] args) 
	{
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	  System.out.println("AutoWiring Demo Using Setter DI"); 
	  Course c = context.getBean(Course.class, "coursebean"); 
	  System.out.println(c.toString());
	  
	  
	  context.close();
	 

	}

}
