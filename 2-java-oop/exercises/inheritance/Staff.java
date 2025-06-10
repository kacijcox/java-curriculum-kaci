package inheritance;

public class Staff extends Faculty {
	double hoursWorked;

	public Staff(String name, int socialSecurityNumber, String location, double payRate, int employeeID, double hoursWorked) {
		super(name, socialSecurityNumber, location, payRate, employeeID);
		this.hoursWorked = hoursWorked;
	}

	public double getPay() {
		return getPayRate() * getHoursWorked();
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		return "Staff{" +
				"hoursWorked=" + hoursWorked +
				", payRate=" + payRate +
				", employeeID=" + employeeID +
				'}';
	}
}
