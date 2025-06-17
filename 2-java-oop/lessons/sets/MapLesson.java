package sets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapLesson {

	public static void main(String[] args) {
		// intialize a map
		Map<Integer, String> studentMap = new HashMap<>();

		// using .put to add a key/value pair to our map
		studentMap.put(null, "default");
		studentMap.put(700, "jojo");
		studentMap.put(701, "carol");
		studentMap.put(702, "pat");
		studentMap.put(700, "jack"); // using out with an existing key replaces the value

		System.out.println(studentMap);

		for(Map.Entry <Integer, String> entry : studentMap.entrySet()) {
			System.out.println(entry.getKey() + "|" + entry.getValue());
		}
		// key is a string and the value is an array list of doubles
		Map <String, ArrayList<Double>> studentGrades = new HashMap<>();
		studentGrades.put("StudentName1", new ArrayList<>());
		studentGrades.put("StudentName2", new ArrayList<>());
		studentGrades.put("StudentName3", new ArrayList<>());
		studentGrades.put("StudentName4", new ArrayList<>());

		studentGrades.get("Student3").add(59.5);
		studentGrades.get("Student2").add(79.5);
		studentGrades.get("Student1").add(69.5);
		studentGrades.get("Student4").add(90.5);

		studentGrades.get("StudentName3").add(76.32);

		System.out.println(studentGrades);



	}
}
