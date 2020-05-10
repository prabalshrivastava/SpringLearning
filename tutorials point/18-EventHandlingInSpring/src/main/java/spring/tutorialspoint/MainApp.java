package spring.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ConfigurableApplicationContext context = 
         new ClassPathXmlApplicationContext("Beans.xml");

      // Let us raise a start event.
      context.start();
      
	  
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      
      System.out.println("refreshing context");
      context.refresh();

      // Let us raise a stop event.
      context.stop();
      
      System.out.println("closing context");
      context.close();
   }
}