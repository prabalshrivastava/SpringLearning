package spring.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("NormalBeans.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
      
      ApplicationContext context1 = new ClassPathXmlApplicationContext("AutowiredBeansByName.xml");
      TextEditor te1 = (TextEditor) context1.getBean("textEditor");
      te1.spellCheck();
      
      ApplicationContext context2 = new ClassPathXmlApplicationContext("AutowiredBeansByType.xml");
      TextEditor te2 = (TextEditor) context2.getBean("textEditor");
      te2.spellCheck();
      
      
      ApplicationContext context3 = new ClassPathXmlApplicationContext("AutowiredBeansByConstuctor.xml");
      TextEditor te3 = (TextEditor) context3.getBean("textEditor");
      te3.spellCheck();
      
      ApplicationContext context4 = new ClassPathXmlApplicationContext("AutowiredBeansByAutodetect.xml");
      TextEditor te4 = (TextEditor) context4.getBean("textEditor");
      te4.spellCheck();
   }
   
}