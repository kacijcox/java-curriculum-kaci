public class OperatorsLessons {
    public static void main(String[] args) {
        /* Arithmetic operations */
        // addition +
        // subtraction -
        // multiplication *
        //division /
        // modulus/remainder %
        // parenthesis ()

        float sum = 5 + 10.5f;
        int multiplication = 5 * 10;
        System.out.println(sum + "" + multiplication);

//        int division = 10 / 3;
//        double decimalDivision = 10 % 4;
//        System.out.println("Division: " + division);
//        System.out.println("Decimal Division: " + decimalDivision);

        /* Casting  */
        int division = 10 / 3;
        double decimalDivision = (int) 11.9 / 3.0;
        System.out.println("Division: " + division);
        System.out.println("Decimal Division: " + decimalDivision);

        // challenge
        // create 2 variables to store the base and height of a triangle
        // print the area of a triangle b * h / 2
        // create third variable and calculate the area of the trapizoid

//        int base1 = 10;
//        int base2 = 12;
//        int height = 5;
//        int area = (base1 + base2) * height / 2;
//        System.out.println(area);
//
        double base = 1;
        double base2 = 2;
        double height = 4;
        double areaOfTriangle = (base * height)  / 2;
        System.out.println("Area of triangle" + areaOfTriangle);

        double areaofTrap = (base + base2) * height / 2;
        System.out.println(areaofTrap);

        System.out.println((char) (65 + 32));
        System.out.println('A' + 'B'); // this char 'A' is being treated like a short with the + operator
        System.out.println('A' + "" + 'B'); // string concatenation is implied is one of the values is a string


        /* Compound assignment operators */
//
//        int number = 30;
//        System.out.println(number);
//        number = number + 7;
//        System.out.println(number);
//        number -= 5;
//        System.out.println(number);
//        number *= 6;
//        System.out.println(number);
//        number %= 5;
//        System.out.println(number);
//        number /= 5;
//        System.out.println(number);

        /* Incrementation */

        int i = 0;
        //decrement before reading
        System.out.println(i);
        System.out.println(--i);

        //increment before reading
        System.out.println(i);
        System.out.println(++i);

        //decrement before reading
        System.out.println(--i);
        System.out.println(i);

        //increment before reading
        System.out.println(++i);
        System.out.println(i);



        /* Order of operations */
        // ()
        // * / %
        // + -
        // =
    }
}
