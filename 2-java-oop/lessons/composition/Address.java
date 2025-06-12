package composition;

public class Address {
	private String line1;
	private String line2;
	private String city;
	private String state;
	private int zipCode;
	private String country;

	public Address(String line1, String line2, String city, int zipCode, String country, String state) {
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
		this.state = state;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		String address = line1 + "\n";
		if(null == line2 && !line2.isEmpty()) {
			address += line2 + "\n";
		}
		address += city + ", " + state + " " + zipCode + "\n";
		return address;
	}
}
