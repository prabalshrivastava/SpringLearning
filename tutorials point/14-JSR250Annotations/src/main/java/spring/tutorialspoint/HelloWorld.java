package spring.tutorialspoint;
import javax.annotation.*;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public String getMessage(){
      System.out.println("Your Message : " + message);
      return message;
   }
   
   @PostConstruct
   public void init(){
      System.out.println("Bean is going through init.");
   }
   
   @PreDestroy
   public void destroy(){
      System.out.println("Bean will destroy now.");
   }
   
   public void initBean(){
      System.out.println("Init Bean is going through init.");
   }
   
   public void destroyBean(){
      System.out.println("destroy Bean will destroy now.");
   }
}