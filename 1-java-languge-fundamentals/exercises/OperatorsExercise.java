public class OperatorsExercise {

    public static void main(String[] args) {

        /* 1. Arithmetic Operations  */
        // declare and initialize variables for each of the following
        // number of hours in a day
        // number of minutes in an hour
        // number of seconds in a minute
        // number of inches in a foot
        // number of feet in a mile (5280)
        // length of the movie Titanic in minutes (195 minutes)

        int hoursDay = 24;
        int minutesHour = 60;
        int secondsMinute = 60;
        int inchesFoot = 12;
        int feetMile = 5280;
        int titanicMovie = 195;

        // using the above variables and arithmetic operators (+ - / * %)
        // print to the console solutions to the following prompts:
        // number of hours in a week
        // number of minutes in a week
        // if a car is moving 77 miles per hour, how many feet per second is it traveling? (~112.933 seconds)
        // how many hours and minutes long is the movie Titanic?
        // a mile and 900 feet is how many inches?

        int hoursInWeek = (minutesHour * hoursDay);
        System.out.println(hoursInWeek);

        int minutesInWeek = (minutesHour * hoursDay) * 7;
        System.out.println(minutesInWeek);

        int titanicHours = titanicMovie / 60;
        int titanicMinutes = titanicMovie % 60;
        System.out.println("the titanic movie is " + titanicHours + " hours long and " + titanicMinutes + " minutes.");

        int totalInches = (feetMile * 12) + 900 * 12;
        System.out.println(totalInches);



        ;    /* 2. Compound assignment operators */
        // demonstrate the use of all 5 compound assignment numbers with the variable x to print out the correct value
        int x = 10;
        // Same as x = x + 7; // print "x is 17"
        // Same as x = x - 5; // print "x is 12"
        // Same as x = x * 7; // print "x is 84"
        // Same as x = x / 3; // print "x is 28"
        // Same as x = x % 9; // print "x is 2"

        int compoundOne = x + 7;
        System.out.println("x is " + compoundOne);

        int compoundTwo = compoundOne - 5;
        System.out.println("x is " + compoundTwo);

        int compoundThree = compoundTwo * 7;
        System.out.println("x is " + compoundThree);

        int compoundFour = compoundThree / 3;
        System.out.println("x is " + compoundFour);

        int compoundFive = compoundFour % 9;
        System.out.println("x is " + compoundFive);


        /* 3. Complete the Conversion formulas  */
        // complete the following formulas using temperature_conversion.jpg as a guide

        double celsius = 32.0;
        double kelvin = 350;
        double fahrenheit = 212;

        double celsiusToKelvin = 32.0 + 273.15; // ~305.15°K
        System.out.println(celsius + "° Celsius = " + celsiusToKelvin + "° Kelvin");

        double kelvinToCelsius = 350 - 273.15; // ~76.85°C
        System.out.println(kelvin + "° Kelvin = " + kelvinToCelsius + "° Celsius");

        double fahrenheitToCelsius = (fahrenheit - 32) * 5/9; // ~100°C
        System.out.println(fahrenheit + "° Fahrenheit = " + fahrenheitToCelsius + "° Celsius");

        double celsiusToFahrenheit = celsius * 9/5 + 32; // ~ 89.6°K
        System.out.println(celsius + "° Celsius = " + celsiusToFahrenheit + "° Kelvin");

        double fahrenheitToKelvin = (fahrenheit - 32) * 5/9 + 273.15; // ~373.15°K
        System.out.println(fahrenheit + "° Fahrenheit = " + fahrenheitToKelvin + "° Kelvin");

        double kelvinToFahrenheit = (kelvin - 273.15) * 9/5 + 32; // ~170.33°F
        System.out.println(kelvin + "° Kelvin = " + kelvinToFahrenheit + "° Fahrenheit");




    }







}