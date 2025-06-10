package inheritance;

public class InheritenceExercise {

	public static void main(String[] args) {
		Teacher firstTeacher = new Teacher("rhonda", 1234567890, "texas",
				50.40, 1111, "english", 15.2);

		Teacher secondTeacher = new Teacher("jeff", 876546787,
				"louisiana", 87.19, 2222, "math", 20.3);

		System.out.println(firstTeacher.getName() +  " " + firstTeacher.location + " " + firstTeacher.subjectTaught
				+ " " + firstTeacher.yearsEmployed);

		System.out.println(secondTeacher.getName() + " " + secondTeacher.location + " " + secondTeacher.subjectTaught
		+ " " + secondTeacher.yearsEmployed);

		Staff firstStaff = new Staff ("bill", 354871234, "alabama", 45.34,
				3333, 37);

		Staff secondStaff = new Staff ("jill", 836453672, "mississippi", 65.12,
				4444, 32);

		System.out.println(firstStaff.getName() + " " + firstStaff.location + " " + firstStaff.employeeID);

		System.out.println(secondStaff.getName() + " " + secondStaff.location + " " + secondStaff.employeeID);

		Student firstStudent = new Student("billy", 787543217, "texas",
				"freshman");

		Student secondStudent = new Student("jason", 932654876, "louisiana",
		"senior");

		System.out.println(firstStudent.getName() + firstStudent.location + firstStudent.studentGradeLevel);
		System.out.println(secondStudent.getName() + secondStudent.location + secondStudent.studentGradeLevel);

		System.out.println("--- all faculty pay info --");
		System.out.println(firstTeacher.getName() + "'s pay: $" + firstTeacher.getPay());
		System.out.println(secondTeacher.getName() + "'s pay: $" + secondTeacher.getPay());
		System.out.println(firstStaff.getName() + "'s pay: $" + firstStaff.getPay());
		System.out.println(secondStaff.getName() + "'s pay: $" + secondStaff.getPay());
	}
}