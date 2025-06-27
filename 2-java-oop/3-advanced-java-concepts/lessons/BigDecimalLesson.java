package lessons;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BigDecimalLesson {
    public static void main(String[] args) {
        // Know why we don't use primitive floating point datatypes when we require precise calculations
        // Know how to use BigDecimal methods to add/subtract/multiply/divide
        // Be aware of issues related to decimal numbers
        // Know the different forms of rounding for BigDecimals
        // Know how to handle scaling

        System.out.println(.1+.1+.1);

        // Instantiate a BigDecimal
        BigDecimal expense = new BigDecimal("199.90");
        // unscaled value of: 19990
        // scale: 2
        System.out.println("expense is: $" + expense + "  scale: " + expense.scale() +
                "  unscaled value: " +expense.unscaledValue());

        BigDecimal statistic = new BigDecimal("10.00999999000909090909");
        System.out.println(statistic);

        BigDecimal scaledStatistic = statistic.setScale(2, RoundingMode.HALF_UP);
        System.out.println(scaledStatistic);

        // for this class if you want to represent a US currency, you can have a scale of 2 and use the RoundingMode.HALF_UP

        // * Arithmetic with BigDecimal *

        // multiplication
        BigDecimal multiply = new BigDecimal("9.99");
        multiply = multiply.multiply(new BigDecimal("3"));
        System.out.println(multiply);

        // with BigDecimal division you must specify the expected scale and rounding
        // because the division result might have an infinite number of digits after the floating point that can't be represented
        // for example: 1/3 = ~.33333333...
        BigDecimal division = new BigDecimal("1");
        division = division.divide(new BigDecimal("3"),10, RoundingMode.HALF_UP);
        System.out.println(division);

        // When adding/subtracting BigDecimals, the result will always take the largest scale of the two values
        // You will have to manually adjust the scale if you want to keep a specific scale consistent
        BigDecimal addition = new BigDecimal("101.55");
        System.out.println("add 50.50  " + addition.add(new BigDecimal("50.50")));
        System.out.println("add 50.50000  " + addition.add(new BigDecimal("50.50000").setScale(2, RoundingMode.HALF_UP)));

        BigDecimal subtraction = new BigDecimal("77.77");
        subtraction  = subtraction.subtract(new BigDecimal("50.770"));
        System.out.println(subtraction.setScale(2, RoundingMode.HALF_UP));

        // Built in helper utilities of the BigDecimal class
        // use valueOf() to create a BigDecimal from a unscaled value and scale
        BigDecimal test = BigDecimal.valueOf(100098, 2);
        System.out.println(test);
        System.out.println(BigDecimal.ZERO);
        System.out.println(BigDecimal.ONE);
        System.out.println(BigDecimal.TEN);

        // BigDecimal Constructors

        // ints work fine
        System.out.println(new BigDecimal(7));

        // we get an unpredictable behavior when converting floats/doubles to BigDecimal
        System.out.println(new BigDecimal(.1));

        // we can use String.valueOf() if we need to parse a float/double
        System.out.println(new BigDecimal(String.valueOf(.1)));

        // a NumberFormatException is thrown if a string can't be converted to a BigDecimal
        try {
            System.out.println(new BigDecimal("$2.99"));
        } catch(NumberFormatException e) {
            System.out.println("Invalid number for BigDecimal conversion.");
        }

        // I want to make a method to calculate change from a big decimal.
        // our map is going represent the change received from a vending machine
        // key String:  Quarters, Dimes, Nickles, Pennies
        // value Integer: how many of each coin type are we getting back
        Map<String, Integer> change = getChange(new BigDecimal(".82"));
        // Quarters: 3
        // Dimes: 0
        // Nickles: 1
        // Pennies 2

    }

    public static Map<String, Integer> getChange(BigDecimal amount) {
        Map<String, Integer> change = new HashMap<>();
        // get the number of quarters
        BigDecimal quarters = amount.divide(new BigDecimal(".25"), 0, RoundingMode.FLOOR);
        if(quarters.intValue() > 0) {
            change.put("Quarters", quarters.intValue());
            amount = amount.subtract(new BigDecimal(".25").multiply(new BigDecimal(quarters.intValue())));
        }

        // get the number of dimes
        BigDecimal dimes = amount.divide(new BigDecimal(".10"), 0, RoundingMode.FLOOR);
        if(dimes.intValue() > 0) {
            change.put("Dimes", dimes.intValue());
            amount = amount.subtract(new BigDecimal(".10").multiply(new BigDecimal(dimes.intValue())));
        }

        // get the number of Nickles
        BigDecimal nickles = amount.divide(new BigDecimal(".05"), 0, RoundingMode.FLOOR);
        if(nickles.intValue() > 0) {
            change.put("Nickles", nickles.intValue());
            amount = amount.subtract(new BigDecimal(".05").multiply(new BigDecimal(nickles.intValue())));
        }

        // get the number of Pennies
        BigDecimal pennies = amount.divide(new BigDecimal(".01"), 0, RoundingMode.FLOOR);
        if(pennies.intValue() > 0) {
            change.put("pennies", pennies.intValue());
        }

        return change;
    }


    // Refactored getChangeMethod()

    public static Map<String, Integer> getChange2(BigDecimal amount) {
        Map<String, Integer> change = new HashMap<>();
        Map<String, BigDecimal> coins = new LinkedHashMap<>();
        coins.put("Quarters", new BigDecimal(".25"));
        coins.put("Dimes", new BigDecimal(".10"));
        coins.put("Nickles", new BigDecimal(".05"));
        coins.put("Pennies", new BigDecimal(".01"));

        for(Map.Entry<String, BigDecimal> coin: coins.entrySet()) {
            int coinCount = amount.divide(coin.getValue(), 0, RoundingMode.FLOOR).intValue();
            if (coinCount > 0) {
                change.put(coin.getKey(), coinCount);
                amount = amount.subtract(coin.getValue().multiply(new BigDecimal(coinCount)));
            }
        }
        return change;
    }

    public static Map<String, Integer> getChange3(BigDecimal amount) {
        Map<String, Integer> change = new HashMap<>();

        change.put("Quarters",  getCoinCount(amount, new BigDecimal(".25")));
        amount = amount.subtract(new BigDecimal(change.get("Quarters")).multiply(new BigDecimal(".25")));
        change.put("Dimes", getCoinCount(amount, new BigDecimal(".10")));
        amount = amount.subtract(new BigDecimal(change.get("Dimes")).multiply(new BigDecimal(".10")));
        change.put("Nickles", getCoinCount(amount, new BigDecimal(".05")));
        amount = amount.subtract(new BigDecimal(change.get("Nickles")).multiply(new BigDecimal(".05")));
        change.put("Pennies", getCoinCount(amount, new BigDecimal(".01")));

        return change;
    }

    public static Integer getCoinCount(BigDecimal amount, BigDecimal coin) {
        return amount.divide(coin, 0, RoundingMode.FLOOR).intValue();
    }


}
