public class DataTypesExercise {

    public static void main(String[] args) {
        System.out.println("hello ben");

        /* 1. Declare and assign variables related to a soccer player */
        // store the name of a soccer player.
        // store the player's jersey number.
        // store the player’s field position (e.g., "Goalkeeper")
        // store whether the player is a starter (true or false)
        // store the name of the player’s team
        // -- use all of these variables in print out statements to the console
        /* Example output:
            Soccer player: Birgit Prinz
            Jersey number: 9
            Starter: True
            Plays as a Forward for Germany.
        */
        // change the player's jersey number, if they are a starter, and their team's name
        // reprint the previous console output with the new values

        /* 2. Declare and assign variables related to a movie */
        // store the title of a movie.
        // store the year the movie was released.
        // store the total number of reviews for a movie
        // store the average of all reviews (scores 1 out of 10)
        // store the name of the director of a film
        // -- use all of these variables in print out statements to the console
        /* Example output:
            The movie Seven Samurai directed by Akira Kurosawa was released in 1954.
            It has an IMDB score of 8.6/10 with 384819 reviews.
        */
        // update the number of reviews and average review score with new values
        // reprint the previous console output with requested updates


        /* 3. Declare and assign the following variables for a weather forecast: */
        // store the name of a city.
        // store the temperature in Fahrenheit.
        // store the humidity percentage.
        // store a short description of the weather (e.g., "Cloudy").

        String nameOfCity = "lake charles";
        int cityTemperature = 90;
        int humidityPercentage = 100;
        String weatherDescription = "muggy";

        // -- use all of these variables in print out statements to the console
        /* Example output:
            Weather Report: Philadelphia
            It is currently raining with a temperature of 63°F and a humidity of 44%
        */
        System.out.println("weather report: " + nameOfCity);
        System.out.println("it is currenty " + weatherDescription + " with a temperature of " + cityTemperature + "°F"
                + " and humdity of " + humidityPercentage + "%"
        );

        // change the temperature, humidity, and description of the weather
        // reprint the previous console output with requested updates

        cityTemperature = 75;
        humidityPercentage = 80;
        weatherDescription = "sunny";

        System.out.println("weather report: " + nameOfCity);
        System.out.println("it is currenty " + weatherDescription + " with a temperature of " + cityTemperature + "°F"
                + " and humdity of " + humidityPercentage + "%"
        );

        /* 4.  Declare and assign the following variables for a flight at an airport: */
        // store the flight number (e.g., "AA256").
        // store the departure city (e.g., "New York").
        // store the arrival city (e.g., "Los Angeles").
        // store the seat number for the flight.
        // store the terminal number at the airport.
        // store whether the flight is delayed (true or false)

        String flightNumber = "aa758";
        String departureCity = "austin";
        String arrivalCity = "miami";
        String seatNumber = "1a";
        int terminalNumber = 45;
        boolean flightDelayed = false;

        System.out.println("flight: " + flightNumber + " " + departureCity + " to " + arrivalCity);
        System.out.println("gate: " + terminalNumber);
        System.out.println("delayed: " + flightDelayed);

        // -- use all of these variables in print out statements to the console
        /* Example output:
            Flight: AF21084 London to New York (NYC)
            Gate: C
            Seat: 8F
            Delayed: False
        */



        /* 5. Declare and assign three boolean variables related to school or work. */
        // whether you have homework (true or false).
        // whether today is the weekend (true or false).
        // whether you attended class today (true or false)
        // -- these variables in print out statements to the console

        boolean isHomework = true;
        boolean isWeekend = false;
        boolean attendClass = true;
        /* Example output:
            Do I have homework? False
            Is it the weekend? False
            Did I attend class today? True
         */

        System.out.println("do i have homework? " + isHomework);
        System.out.println("is it the weekend? " + isWeekend);
        System.out.println("did i attend class today?" + attendClass);


        /* 6. primitive data types */
        // for each of the 8 primitive data types declare and
        // initialize a variable that would store a real world value fitting for each data type
        // byte, short, int, long, float, double, boolean, char

        byte isByte = 90;
        short isShort = 5;
        int isInt = 5;
        long isSLong = 17464374742L;
        double isDouble = 15.78;
        boolean isBoolean = true;
        char isChar = 'f';



    }
}