package inheritance;

public class Student extends Person{
	String studentGradeLevel;

	public Student(String name, int socialSecurityNumber, String location, String studentGradeLevel) {
		super(name, socialSecurityNumber, location);
		this.studentGradeLevel = studentGradeLevel;
	}


	public void setStudentGradeLevel(String studentGradeLevel) {
		this.studentGradeLevel = studentGradeLevel;
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentGradeLevel='" + studentGradeLevel + '\'' +
				", name='" + name + '\'' +
				", socialSecurityNumber=" + socialSecurityNumber +
				", location='" + location + '\'' +
				'}';
	}
}
