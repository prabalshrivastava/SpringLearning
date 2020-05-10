package spring.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}


//The above code will be equivalent to the following XML configuration −
//<beans>
//   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" />
//</beans>