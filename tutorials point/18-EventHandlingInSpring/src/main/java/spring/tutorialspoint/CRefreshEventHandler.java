package spring.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class CRefreshEventHandler 
   implements ApplicationListener<ContextRefreshedEvent>{

	/*This event is published when the ApplicationContext is either initialized or refreshed. 
	 * This can also be raised using the refresh() method on the ConfigurableApplicationContext interface.*/
	
	
   public void onApplicationEvent(ContextRefreshedEvent event) {
      System.out.println("ContextRefreshedEvent Received");
   }
}