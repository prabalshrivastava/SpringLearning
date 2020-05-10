package spring.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {

	   ApplicationContext ctx1 = 
    	         new AnnotationConfigApplicationContext(TextEditorConfig.class);

    	      TextEditor te = ctx1.getBean(TextEditor.class);
    	      te.spellCheck();
   }
}