package spring.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	   ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
	   
	   // now both beans A and B will be available...
	   A a = ctx.getBean(A.class);
	   B b = ctx.getBean(B.class);
	   System.out.println(a);
	   System.out.println(b);
	   
	   
	   /*Lifecycle Callbacks*/
	   AbstractApplicationContext app  = new AnnotationConfigApplicationContext(AppConfig.class);
	   //Foo f = (Foo) app.getBean("foo");
	   Foo f1 = (Foo) app.getBean(Foo.class);
	   Foo f2 = (Foo) app.getBean(Foo.class);
	   Foo f3 = (Foo) app.getBean(Foo.class);
	   System.out.println(f1);
	   System.out.println(f2);
	   System.out.println(f3);
	   app.close();
	}
}

