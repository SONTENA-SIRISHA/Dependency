package com.klef.jfsd.exam.SetterDI; 
 
import org.springframework.context.support.ClassPathXmlApplicationContext;

  
public class ClientDemo  
{ 
 public static void main(String args[]) 
 { 
  ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml"); 
  System.out.println("****Dependency Injection Using Setter Method****"); 
  Person p = context1.getBean(Person.class, "personbean"); 
  System.out.println(p.toString()); 
  
  
  context1.close();
} 
}