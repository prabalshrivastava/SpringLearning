package spring.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	/*The @Bean annotation supports specifying arbitrary initialization and destruction callback methods, 
	 * much like Spring XML's init-method and destroy-method attributes on the bean element −*/   
	/*@Bean(initMethod = "init", destroyMethod = "cleanup" )
	public Foo foo() {
		return new Foo();
	}*/
	
	@Bean
   //@Scope("prototype")
	@Scope("singleton")
   public Foo foo1() {
      return new Foo();
   }
}