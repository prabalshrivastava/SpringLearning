package spring.tutorialspoint;
public class TextEditor {
   private SpellChecker spellChecker;
   private String name;
   
   public void setSpellChecker( SpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public SpellChecker getSpellChecker() {
      return spellChecker;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
public TextEditor(SpellChecker spellChecker, String name) {
	super();
	this.spellChecker = spellChecker;
	this.name = name;
}
public TextEditor() {
	super();
	// TODO Auto-generated constructor stub
}



public TextEditor(SpellChecker spellChecker) {
	super();
	this.spellChecker = spellChecker;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "TextEditor [spellChecker=" + spellChecker + ", name=" + name + "]";
}
   
   
}