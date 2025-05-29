import java.util.Scanner;


public class ConsoleIOExercise {
    public static void main(String[] args) {

        /* 1. initialize a Scanner object that you will be using throughout this exercise */
        // Hint: Make sure you add an import statement at the top of this exercise to use the Scanner
        String userInput = "";
        Scanner console = new Scanner(System.in);

//        /* 2. Dog Years */
        // Ask the user to enter their age
        // Print to the console the user's age in dog years (user's age * 7)
        //
        // Example Output:
        //  What is your age: 28
        //  You would be 196 in dog years.


        System.out.println("enter your age");
        userInput = console.nextLine();
        int age = Integer.parseInt(userInput);
        int ageinDogYears = age * 7;
        System.out.println("you would be " + ageinDogYears + " in dog years");


        /* 3. Character Replace */
        // Ask the user to enter some text
        // Prompt the user to enter a String they want to replace
        // Prompt the user to enter a String to use instead
        // Print to the console the initial text they entered along with the requested replacements
        //
        // Example Output:
        //  Enter some text: here is some text
        //  What do you want to replace? e
        //  What do you want to replace "e" with? o
        //  Your old text: here is some text
        //  Your new text: horo is somo toxt

        System.out.println("enter some text");
        userInput = console.nextLine();
        String originalText = userInput;
        String unchangedText = originalText;

        System.out.println("what do you want to replace?");
        userInput = console.nextLine();
        String replaceText = userInput;

        System.out.println("what do you want to replace " + replaceText + " with?");
        userInput = console.nextLine();
        String newText = originalText.replace(replaceText, userInput);
        System.out.println("your old text: " + originalText);
        System.out.println("your new text: " + newText);



        /* 4. Transaction Calculator */
        // Ask number of items to purchase
        // Ask price per item
        // Ask for sales tax
        // Print the total
        // Hint: You can use the String.format() or System.out.printf() methods to do basic rounding for this problem
        //
        // Example Output:
        //  Enter the number of items: 7
        //  Enter the cost per item: 14.95
        //  Enter the sales tax: 8.25
        //  Total Cost: $113.28

//        String userInput;
//
        System.out.println("how many items would you like to purchase?");
        userInput = console.nextLine();
        int numOfItems = Integer.parseInt(userInput);
//        System.out.println(numOfItems);

        System.out.println("what is the price per item?");
        userInput = console.nextLine();
        double pricePerItem = Double.parseDouble(userInput);

        System.out.println("what is the sales tax?");
        userInput = console.nextLine();
        double salesTax = Double.parseDouble(userInput);

        System.out.println("your total cost is:");
        double totalCost = (numOfItems * pricePerItem + salesTax);
        System.out.println(totalCost);



        /* 5. String Extraction */
        // Ask the user to enter some text
        // Prompt the user to enter a number
        // Print to console the text the user entered truncated to the number of digits they specified
        //
        // Example Output:
        //  Enter some text: Is this text fine?
        //  Enter a number: 9
        //  The start of your text is: Is this t
//
        System.out.println("enter some text");
        userInput = console.nextLine();
        String someText = userInput;

        System.out.println("enter a number");
        userInput = console.nextLine();
        int someNumber = Integer.parseInt(userInput);

        String numberWord = someText.substring(0, someNumber);
        System.out.println(numberWord);


        /* 6. String Methods */
        // Prompt the user for a line of text
        // Demonstrate the use of various String methods:
        // - length of the string
        // - convert to uppercase
        // - convert to lowercase
        // - trim whitespace


        System.out.println("enter some text: ");
        userInput = console.nextLine();
        String userText = userInput;

        System.out.println("the length of your text is:\s " + userText.length());
        System.out.println("your text is uppercase is:\s " + userText.toUpperCase());
        System.out.println("your text lowercase is:\s " + userText.toLowerCase());
        System.out.println("your text without whitespace is: \s " + userText.trim());






        //
        // Example Output:
        //  Enter some text:    Example Text
        //  Your text           :    Example Text
        //  Length of your text : 15
        //  In uppercase        :    EXAMPLE TEXT
        //  In lowercase        :    example text
        //  Your text trimmed   : Example Text

    }
}

