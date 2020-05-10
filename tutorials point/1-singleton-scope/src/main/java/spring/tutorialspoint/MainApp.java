package spring.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   printScope("singletonScope");
	   printScope("prototypeScope");
	   
	   compareObjects("singletonScope");
	   compareObjects("prototypeScope");
   }
   
   
   public static void printScope(String scope){
	  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	  HelloWorld objA = (HelloWorld) context.getBean(scope);
	
	  objA.setMessage("I'm object A");
	  objA.getMessage();
	
	  HelloWorld objB = (HelloWorld) context.getBean(scope);
      objB.getMessage();
   }

   public static void compareObjects(String scope){
	  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	  HelloWorld objA = (HelloWorld) context.getBean(scope);
	  System.out.println("objA : " + objA);
	  HelloWorld objB = (HelloWorld) context.getBean(scope);
	  System.out.println("objB : " + objB);
	  System.out.println("objA == objB : " + (objA == objB));
   }
}