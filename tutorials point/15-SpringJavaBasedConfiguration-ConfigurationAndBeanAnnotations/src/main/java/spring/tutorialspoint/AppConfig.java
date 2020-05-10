package spring.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
	/* When @Beans have dependencies on one another, 
	 * expressing that the dependency is as simple 
	 * as having one bean method calling another as follows
	 * */ 
   @Bean
   public Foo foo() {
      return new Foo(bar());
   }
   @Bean
   public Bar bar() {
      return new Bar();
   }
}