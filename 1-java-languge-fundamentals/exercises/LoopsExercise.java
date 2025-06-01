import java.util.Scanner;

public class LoopsExercise {
    public static void main(String[] args) {
        /* 1-FIZZBUZZ (Java Edition) */
        // Write a Python script that generates output according to these rules:
        //
        // Print numbers from 1 to 100.
        // If a number is divisible by 3, print "Fizz" instead of the number.
        // If a number is divisible by 5, print "Buzz" instead of the number.
        // If a number is divisible by both 3 and 5, print "Fizzbuzz" instead of the number.
        //
        // Sample Output: (first 15 rows)
        //  1
        //  2
        //  Fizz
        //  4
        //  Buzz
        //  Fizz
        //  7
        //  8
        //  Fizz
        //  Buzz
        //  11
        //  Fizz
        //  13
        //  14
        //  Fizzbuzz


        /* 2. Running Total  */
        // We want to create a script that calculates a user's running total of whole numbers. The flow of the script should behave like this:
        // Initialize a variable to store the running total with a value of zero.
        // Start a while loop with the condition that the input is not equal to "Q".
        // Prompt the user for a number or Q to quit.
        // If the user enters "Q" or "q", let the loop end.
        // If the user does not enter "Q", assume it is a whole number, convert it to an integer value, and add it to the running total variable.
        // Display the final total when the loop ends.
        //
        // Sample Output:
        //  Enter a number (Q to quit): 10
        //  Enter a number (Q to quit): 5
        //  Enter a number (Q to quit): 1
        //  Enter a number (Q to quit): -6
        //  Enter a number (Q to quit): Q
        //  The total is: 10


        /* 3. Number Guessing Game (Hot or Cold Edition) */
        // Create a game where the user must correctly guess a secret number.
        // Initialize a variable and set it to a random integer  (example: secret_number = 7)
        // Create a header similar to "--Number Guessing Game--" that displays only at the start of the game
        // Have a loop that continually prompts the user to guess the secret number.
        // If their latest guess is closer to the secret number than their last guess, print "Getting Warmer..."
        // If their latest guess is further away from the secret number, print "Getting Colder..."
        // if it has the same distance, print "About the same temperature..."
        // When the user enters the correct number, congratulate them and end the game.
        // Hint: when calculating distances, a negative number multiplied by -1 is that number's absolute value
        //
        // Example Output:
        //  --Number Guessing Game--
        //  Please guess a number: 10
        //  Guess Again: 15
        //  Getting Colder... Guess Again: 5
        //  Getting Warmer... Guess Again: 4
        //  Getting Colder... Guess Again: 6
        //  Getting Warmer... Guess Again: 8
        //  About the same temperature...Guess Again: 7
        //  Congratulations!

    }
}
