package inheritance;

public abstract class Faculty extends Person {
	double payRate;
	int employeeID;

	public Faculty(String name, int socialSecurityNumber, String location, double payRate, int employeeID) {
		super(name, socialSecurityNumber, location);
		this.payRate = payRate;
		this.employeeID = employeeID;
	}

	public abstract double getPay();

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
}
