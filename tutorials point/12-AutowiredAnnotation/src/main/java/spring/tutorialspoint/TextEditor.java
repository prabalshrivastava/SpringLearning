package spring.tutorialspoint;
import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
   private SpellChecker spellChecker;
   
   @Autowired
   private SpellChecker1 spellChecker1;
   
   @Autowired
   /**
    * @param spellChecker1 the spellChecker1 to set
    */
   public void setSpellChecker1(SpellChecker1 spellChecker1) {
   	this.spellChecker1 = spellChecker1;
   }
   
   

   public TextEditor() {
	super();
	// TODO Auto-generated constructor stub
}



@Autowired
   public void setSpellChecker( SpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public TextEditor(SpellChecker spellChecker, SpellChecker1 spellChecker1) {
	super();
	this.spellChecker = spellChecker;
	this.spellChecker1 = spellChecker1;
}
public SpellChecker getSpellChecker( ) {
      return spellChecker;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
   
   public void spellCheck1() {
	      spellChecker1.checkSpelling();
	   }
   
/**
 * @return the spellChecker1
 */
public SpellChecker1 getSpellChecker1() {
	return spellChecker1;
}

   
   
}