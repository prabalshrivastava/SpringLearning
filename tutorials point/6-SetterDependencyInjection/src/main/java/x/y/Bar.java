package x.y;

public class Bar {

	private String fname;
	private String lname;
	
	public Bar() {
		super();
		System.out.println("Bar");
	}

	public Bar(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
		System.out.println(fname + "-" + lname);
	}
}
