package spring.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
   private Integer age;
   private String name;

   
   /*we can either pass or even skip passing age while creating bean if required=false,by default required=true*/
   @Autowired(required=false)
   public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
      return age;
   }
   
   @Autowired
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}
   
   
}