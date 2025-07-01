package lambdas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;

import static jdk.internal.loader.URLClassPath.check;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class LambdasLesson {

	static final String name = "jojo";
	static private final int WEEKDAYS_COUNT =5; //final constant variable

	// lambda is a short way of creating a portable method
	// lambdas are built from functional interfaces (interfaces with one abstract method)
	// -> arrow operator is describing parameters on the left and a method body on the right
	// :: method reference notation

	public static void main(String[] args)
	{	// functional interface is an interface with only one abstract method
		// predicate is a functional interface built into java
		// that we can give a concrete implementation of it's test method

		// for the parameter i, return true if it is negative
		Predicate<Integer> predicate = i -> i < 0;

		System.out.println("predicate: " + predicate.test(-3));
		System.out.println("predicate :" + predicate.test(7));

		Predicate<String> startsWith = str -> str.startsWith("B");
		System.out.println("bobbert starsWith: " + startsWith.test("bobbert"));
		System.out.println("robbert starts with " + startsWith.test("robbert"));

		System.out.println(check(-17, predicate));
		System.out.println(check("benny", startsWith));

		BiPredicate<String, Integer> checkLength = (str, len) -> str.length() > len;
		System.out.println((checkLength.test("las vegas", 6)));
		System.out.println(checkLength.test("las vegas", 12));

		// supplier<T> is a functional interface that has the .get() method
		Supplier<LocalDate> tomorrow = () -> LocalDate.now().plusDays(1);
		System.out.println(tomorrow.get());
		Supplier<Integer> randomPin = () -> (int) (Math.random()*10);
		System.out.println(randomPin.get() + " " + randomPin.get() + " " + randomPin.get() + " " + randomPin.get());

		//function<T, R> is a functional interface that has the apply() method
		// T the first generic type specified is the datatype of the parameter
		// R the second generic type specified is the return type of the method apply()

		Function<String, Integer> wordCount = str -> str.split("").length;
		System.out.println(wordCount.apply(("this is a test to count the number of words")));

		// regex for validating an email in a string
		int x = 12;
		Predicate<String> finalTest = str -> {
			System.out.println(str);
			return str.length() == x;
		}; //lamdas require a semicolon after the body definition if you have mutliple statements in curly brackets

		System.out.println(finalTest.test("123456778901"));

//		x = 6;

		// consumer <T> is a functional interface with the abstract method accept (T t)
		// accept doesn't return a value
		Consumer<String> printGreeting = str -> System.out.println("hello " + str + "!");
		printGreeting.accept("jonathan");

		List<String> names = new ArrayList<>();
		names.add("terry");
		names.add("fred");
		names.add("barry");

		names.forEach(str -> System.out.println("hello " + str + "!"));
		names.removeIf((str -> str.startsWith("j")));
		names.forEach(str -> System.out.println(str + " didn't start with j"));

		HashMap<Integer, String> cities = new HashMap<>();
		cities.put(0, "detriot");
		cities.put(1, "portland");
		cities.put(2, "los angelas");

		cities.forEach((key, value) ->System.out.println(key + ":" + value));
		cities.compute(0, (key, value) -> value + " city of robocop");

		System.out.println(cities.get(0));


	}
	public static <T> boolean check(T t, Predicate<T> lambda) {
		return lambda.test(t);
	}
}
