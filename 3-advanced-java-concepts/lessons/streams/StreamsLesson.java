package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsLesson {
	public static void main(String[] args) {


		List<String> names = Arrays.asList("andy", "bernette", "charlie", "david", "eva", "fergie");
		// think of a stream as a short way of describing a loop
		names.stream().forEach(str -> System.out.println(str));

		//:: method of reference
//		names.stream().forEach(System.out::println);

		//we want ot filter out all of the names that are short
		names.stream().filter(str -> str.length() < 5);

		List<String> filteredNames = names.stream().filter(str -> str.length() < 5).toList();
		filteredNames.forEach(System.out::println);
		System.out.println("-----------");

		//checking all names getting all names less than 5 characters
		String firstShortName = names.stream().filter(str -> str.length() < 5).limit(1).toList().getFirst();
		System.out.println(firstShortName);



	}
}
