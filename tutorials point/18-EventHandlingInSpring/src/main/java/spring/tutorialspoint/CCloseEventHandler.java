package spring.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CCloseEventHandler 
   implements ApplicationListener<ContextClosedEvent>{

	
	
	/*This event is published when the ApplicationContext is closed using the close() method on the ConfigurableApplicationContext interface. 
	 * A closed context reaches its end of life; it cannot be refreshed or restarted.*/
	
	
   public void onApplicationEvent(ContextClosedEvent event) {
      System.out.println("ContextClosedEvent Received");
   }
}