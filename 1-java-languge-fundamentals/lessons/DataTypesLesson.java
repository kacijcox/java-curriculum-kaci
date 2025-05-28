public class DataTypesLesson {

    public static void main(String[] args) { //psvm as shortcut for creating a main method

        // single line comment, two forward slashes
        /*
            we can have multiline comments as well
            using this syntax
        */
        /**
         *  Javadocs comments start with /**
         *  and have a lot of handy formatting features for displaying documentation
         */
        System.out.println("Hello, World!");

        // there are 8 primitive data types
        // int - valid for numbers ~-2.1 billion to 2.1 billion
        // short - valid -32,000 to 32,000
        // long - storage for very large whole number integers

        // storing decimals in java
        // float - up to 6 decimal places in accuracy
        // double - up to 15 decimal places in accuracy

        // boolean data type
        // boolean either true or false

        // char - storage for a single character, you can specify a char with single quotes

        // byte - CYMK 0111 = 7


        int favoriteNumber = 7;
        System.out.println(favoriteNumber);

        short currentTemperature = 48;
        System.out.println("The current temperature is: " + currentTemperature);

        long numberOfStars = 400000000000L; // make sure to add L at the end of a long
        System.out.println(numberOfStars);

        float tinyPi = 3.14f; // make sure to add the F/f at the end of a float
        double bigPi = 3.1415926535;
        System.out.println("A small approximation of pi: " + tinyPi + " and a large approximation of pi: " + bigPi);

        // make sure to use single quotes if you are wanting to use the char primitive data type
        char myFirstInital = 'C';

        System.out.println(myFirstInital);

        boolean isCanceled = true;
        System.out.println(isCanceled);

        byte machineInstruction = 24;


        // Strings are not a primitive data type, They are capitalized
        // and have methods that can be accessed with the dot operator (.)
        String myFirstString = "Wow";
        System.out.println(myFirstString.toUpperCase());



    }

}
