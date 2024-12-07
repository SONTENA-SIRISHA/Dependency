package com.klef.jfsd.ConstructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klef.jfsd.ConstructorDI.Employee;
 
 
public class ClientDemo1  
{ 
 public static void main(String args[]) 
 { 
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	  System.out.println("Dependency Injection Using ConstructorDI Method"); 
	  
	  Employee e = (Employee)context.getBean("employeebean");
	  System.out.println(e.toString());
	  context.close();
 
} 


}
