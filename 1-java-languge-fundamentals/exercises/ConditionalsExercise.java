import java.util.Scanner;

public class ConditionalsExercise {
    public static void main(String[] args) {

        /* 1. Dog Years V2 */
        // Ask the user to a dog's age (in human years)
        // Print to the console the dog's age in dog years (Hint: one human year is equal to 7 dog years)
        // If the dog's age is under 21, print: "Just a pup!"
        // If the dog's age is above 21 and below 70, print "The IRS is requiring you to pay your dog taxes."
        // if the dog's age is above 70 and below 112, print "Can dogs even retire in this economy?"
        // if the dog's age is above 112, print "Wise ancient dog."
        //

        String userInput = "";
//        Scanner console = new Scanner(System.in);

//        System.out.println("enter your dogs age (in human years): \n");
//        userInput = console.nextLine();
//        int age = Integer.parseInt(userInput);
//        int ageDogYears = age * 7;
//
//        if (ageDogYears <= 21) {
//            System.out.printf(ageDogYears +"," + " just a pup");
//        }
//
//        else if (ageDogYears >= 21 && ageDogYears <= 70) {
//            System.out.printf(ageDogYears + "," + " the irs is requiring you to file your dog taxes");
//        }
//
//        else if (ageDogYears >= 70 && ageDogYears <= 112) {
//            System.out.printf(ageDogYears + "," + " can a dog even retire in this economy");
//        }
//
//        else if (ageDogYears >= 112) {
//            System.out.printf(ageDogYears + "," + " wise ancient dog");
//        }
//
//        else {
//            System.out.println("invalid age");
//        }

        /* 2. Transaction Calculator V2 */
        // Ask number of items to purchase
        // Ask price per item
        // Ask if there is a sales tax required for this purchase (y/n)
        // If there is a sales tax required, ask for sales tax
        // Print the total
        // Hint: If you are comparing Strings/Objects, make sure to use the .equals() method

        // Example Output:
        //  Enter the number of items: 7
        //  Enter the cost per item: 14.95
        //  Is a sales tax required for this purchase? (y/n): y
        //  Enter the sales tax: 8.25
        //  Total Cost: $113.28


//        System.out.println("how many items would you like to purchase?");
//        userInput = console.nextLine();
//        int numOfItems = Integer.parseInt(userInput);
////        System.out.println(numOfItems);
//
//        System.out.println("what is the price per item?");
//        userInput = console.nextLine();
//        double pricePerItem = Double.parseDouble(userInput);
//
//        System.out.println("is there a sales tax? (yes/no)");
//        userInput = console.nextLine();
//        String isSalesTax = (userInput);
//
//        if (isSalesTax.equals("yes")) {
//            System.out.println("how much is the sales tax?");
//            userInput = console.nextLine();
//            double salesTax = Double.parseDouble(userInput);
//            System.out.println("your total cost is: " + (numOfItems * pricePerItem + salesTax));
//        }
//
//
//        if (isSalesTax.equals("no")) {
//            System.out.println("your total cost is: " + numOfItems * pricePerItem);
//        }
//
//        else if (isSalesTax.equals("")){
//            System.out.println("invalid input" );
//        }




        /* 3. Grade Calculator */
        // Write a Java program that will have the user enter scores for
        // Exercises        (worth 50% of grade)
        // Quizzes          (worth 10% of grade)
        // Midterm Project  (worth 20% of grade)
        // Final Project    (worth 20% of grade)
        // Calculate that person's grade for the course accounting for how much the scores are weighted for the course.
        // Assign a letter based score based on the following table:
//            A+ 	97–100
//            A 	93–96
//            A− 	90–92
//            B+ 	87–89
//            B 	83–86
//            B− 	80–82
//            C+ 	77–79
//            C 	73–76
//            C− 	70–72
//            D+ 	67–69
//            D 	63–66
//            D− 	60–62
//            F 	0–59
        // Hint: Think carefully about how many if/else statements you actually need
        // Example Output:
        //  Enter Exercises : 90    45
        //  Enter Quizzes   : 95    9.5
        //  Enter Midterm   : 70.5  14.1
        //  Enter Final     : 92    18.4
        //
        //  Final Grade is: 87 (B+)
        int userInputInt = 0;
        Scanner console = new Scanner(System.in);

        double exercisesGrade = 0;
        double quizzesGrade = 0;
        double midtermGrade = 0;
        double finalProject = 0;
        double finalGrade = 0;
        String letterGrade = "";

        System.out.println("enter your exercise grade");
        exercisesGrade = (int)((Integer.parseInt(console.nextLine()) * .5));
        // worth 50% of grade

        System.out.println("enter your quizzes grade");
        quizzesGrade = (int)((Integer.parseInt(console.nextLine()) *.1));
        // worth 10% of grade

        System.out.println("enter your midterm grade");
        midtermGrade = (int)((Integer.parseInt(console.nextLine()) * .2));
        // worth 20% of grade

        System.out.println("enter your final project grade");
        finalProject = (int) ((Integer.parseInt(console.nextLine()) * .2));
        // worth 20% of grade

        //final grade logic
        finalGrade = exercisesGrade + quizzesGrade + midtermGrade + finalProject;

        // letter grade strings

//        String "A+" = (97,100);
//        String "A" = (93,96);
//        String "A−" = (90,92);
//        String "B+" = (87,89);
//        String "B" = (83,86);
//        String "B−" = (80,82);
//        String "C+" = (77,79);
//        String "C" = (73,76);
//        String "C−" = (70,72);
//        String "D+" = (67,69);
//        String "D" = (63,66);
//        String "D−" = (60,62);
//        String F = (0,59)




        System.out.println("final grade is :" + finalGrade);


    }
}
