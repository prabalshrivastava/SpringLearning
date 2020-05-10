package spring.tutorialspoint;

public class SpellChecker {

	private String spelling;

	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor." );
	}
	public void checkSpelling() {
		System.out.println("Inside checkSpelling." + spelling);
	}
	/**
	 * @return the spelling
	 */
	public String getSpelling() {
		return spelling;
	}
	/**
	 * @param spelling the spelling to set
	 */
	public void setSpelling(String spelling) {
		this.spelling = spelling;
	}
	public SpellChecker(String spelling) {
		super();
		this.spelling = spelling;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpellChecker [spelling=" + spelling + "]";
	}


}