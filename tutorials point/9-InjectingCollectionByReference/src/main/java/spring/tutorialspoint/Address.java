package spring.tutorialspoint;

public class Address {
	
	private String address;
	private String city;
	private Country country;

	
	
	public Address(Country country) {
		super();
		this.country = country;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String address, String city) {
		super();
		this.address = address;
		this.city = city;
	}
	public Address() {
		super();
		this.address = "hno1";
		this.city = "jabalpur";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", country=" + country + "]";
	}
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
	
}
