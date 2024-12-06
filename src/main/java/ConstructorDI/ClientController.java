package ConstructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ConstructorDI.Faculty;
 
 
public class ClientController  
{ 
 public static void main(String args[]) 
 { 
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	  System.out.println("****Dependency Injection Using ConstructorDI Method****"); 
	  
	  Faculty f = (Faculty)context.getBean("facubean");
	  System.out.println(f.toString());
	  context.close();
 
} 


}
