package spring.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
      //context.close();
      
/*    close() -- Close this application context, destroying all beans in its bean factory.
      registerShutdownHook() -- Register a shutdown hook with the JVM runtime, closing this context on JVM shutdown unless it has already been closed at that time.
      Basically, AbstractApplicationContext#close() will close, or shutdown, the ApplicationContext at the time it is invoked, while AbstractApplicationContext#registerShutdownHook() will close, or shutdown, the ApplicationContext at a later time when the JVM is shutting down for whatever reason. This will be achieved by utilizing the JVM shutdown hook functionality.

      In either case, the actual closing is done by the doClose() method.

      If you are curious about why your outputs look so similar, it is because they are effectively doing the same thing, whether you call #close() or #registerShutdownHook() at line 3 of you example. #close will shutdown right away, and #registerShutdownHook will shutdown just before the JVM will exit, which is pretty much as soon as the method is done being invoked, because it is the last line of code!*/
      
      
      
      
      
      AbstractApplicationContext defaultInitDestroyContext = new ClassPathXmlApplicationContext("default-init-destroy.xml");

      HelloWorld obj1 = (HelloWorld) defaultInitDestroyContext.getBean("helloWorld");
      obj1.getMessage();
      defaultInitDestroyContext.registerShutdownHook();
   }
}