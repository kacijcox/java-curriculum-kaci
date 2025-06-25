package testing;

public class TestingExercise {

    /*
        The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday, or we're on vacation. Return true if we sleep in.
    */


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /*
        Return the number of even ints in the given array.
    */

    public static int countEvens(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num % 2 == 0)
                count++;
        }
        return count;
    }

    /*
        When squirrels get together for a party, they like to have cigars. A
        squirrel party is successful when the number of cigars is between 40 and
        60, inclusive. Unless it is the weekend, in which case there is no upper
        bound on the number of cigars. Return true if the party with the given
        values is successful, or false otherwise.
    */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend) {
            return 40 <= cigars;
        }
        return 40 <= cigars && cigars <= 60;
    }

    /*
        Given two strings, word and a separator sep,
        return a big string made of count occurrences of the word, separated by the separator string.
    */
    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";

        for(int i = 0; i < count - 1; i++) {
            result += word;
            result += sep;
        }
        if (count == 0) {
            return result;
        }

        return result + word;
    }
}

