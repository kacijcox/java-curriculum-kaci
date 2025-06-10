package inheritance;

public class Teacher extends Faculty {
	String subjectTaught;
	double yearsEmployed;

	public Teacher(String name, int socialSecurityNumber, String location, double payRate, int employeeID, String subjectTaught, double yearsEmployed) {
		super(name, socialSecurityNumber, location, payRate, employeeID);
		this.subjectTaught = subjectTaught;
		this.yearsEmployed = yearsEmployed;
	}

	public double getPay() {
		return getPayRate() + (getYearsEmployed() * 100);
	}

	public String getSubjectTaught() {
		return subjectTaught;
	}

	public void setSubjectTaught(String subjectTaught) {
		this.subjectTaught = subjectTaught;
	}

	public double getYearsEmployed() {
		return yearsEmployed;
	}

	public void setYearsEmployed(double yearsEmployed) {
		this.yearsEmployed = yearsEmployed;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + getName() + '\'' +
				", socialSecurityNumber=" + getSocialSecurityNumber() +
				", location='" + getLocation() + '\'' +
				", employeeID=" + getEmployeeID() +
				", payRate=" + getPayRate() +
				", subjectTaught='" + subjectTaught + '\'' +
				", yearsEmployed=" + yearsEmployed +
				'}';
	}

}






