package inheritance;

public class Person {
	String name;
	int socialSecurityNumber;
	String location;

	public Person(String name, int socialSecurityNumber, String location) {
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
