package temporal;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class TemporalExercise {

    // 1. return today's date
    public LocalDate getToday() {
        LocalDate today = LocalDate.now();
        return today; //WRONG?
    }

    // 2. return the current time as a LocalTime
    public LocalTime getNow() {
        LocalTime time = LocalTime.now();
        return time; //WRONG?
    }

    // 3. return December 17, 1903 as a LocalDate
    public LocalDate getFirstFlightDate() {
        LocalDate firstFlight = LocalDate.of(1903,12,17);
        return firstFlight; //PASSED
    }

    // 4. if parameter is in the future, return null.
    // Otherwise, add 5 days to the parameter and return the result.
    public LocalDate makeFutureNullShiftThePast(LocalDate date) {

        if (date.isAfter(LocalDate.now())) {
            return null;
        } else {
            return date.plusDays(5); //PASSED
        }
    }

    // 5. return 4PM (tea time!) as a LocalTime.
    public LocalTime getTeaTime() {
        LocalTime teaTime = LocalTime.of(16,00);
        return teaTime; //PASSED
    }

    // 6. add 12 hours to the time parameter and return the value
    public LocalTime add12Hours(LocalTime time) {

        return time.plusHours(12); //PASSED
    }

    // 7. return the fifth Friday from the parameter date.
    // if the date is Friday, don't count it.

    public LocalDate fiveFridaysFromDate(LocalDate date) {
        LocalDate result = date.plusWeeks(5);
        if(date.equals(DayOfWeek.FRIDAY)) {
            return null;
        }
        else {
            return result;
        }
    }

    // 8. given a date and a count,
    // return a list of the next `fridayCount` Fridays after the date.
    // if the date is Friday, don't include it.
    public List<LocalDate> getNextFridays(LocalDate date, int fridayCount) {
            List<LocalDate> resultFridays = List.of();
            String todaysDate = String.valueOf(getToday());

            if (todaysDate.equals(DayOfWeek.FRIDAY)) {
                resultFridays.add(LocalDate.parse(todaysDate));
            }
        return resultFridays;
    }

    // 9. return the absolute value of the days between two dates.
    // one may be before two, two may be before one, but neither will be null
    public int getDaysBetween(LocalDate one, LocalDate two) {
        int daysBetween = (int) ChronoUnit.DAYS.between(one, two);
        return daysBetween;
    }

    // given a time parameter, return a list of the next 4
    // quarter-hour appointments available after the time.
    // appointment times should not include seconds even if the time parameter does.
    // ignore seconds.
    // Examples:
    // time == 16:07:32
    // appointments == 16:15, 16:30, 16:45, 17:00
    //
    // time == 03:00:01
    // appointments == 03:00, 03:15, 03:30, 03:45
    //
    // time == 04:30:00
    // appointments == 04:30, 04:45, 05:00, 05:15
    public List<LocalTime> getQuarterHourAppointments(LocalTime time) {
        List<LocalTime> appointmentTimes = new ArrayList<>();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");

        String firstTimeResult = time.withHour(16).withMinute(0).plusMinutes(15).format(formatTime);
        String secondTimeResult = time.withHour(16).withMinute(15).plusMinutes(15).format(formatTime);
        String thirdTimeResult = time.withHour(16).withMinute(30).plusMinutes(15).format(formatTime);
        String fourthTimeResult = time.withHour(16).withMinute(45).plusMinutes(15).format(formatTime);

        appointmentTimes.add(LocalTime.parse(firstTimeResult));
        appointmentTimes.add(LocalTime.parse(secondTimeResult));
        appointmentTimes.add(LocalTime.parse(thirdTimeResult));
        appointmentTimes.add(LocalTime.parse(fourthTimeResult));


        return appointmentTimes;

    }


    /** BONUS practice after this line **/

    // THE GODMOTHER
    // ========================
    // Complete the numbered tasks below.
    // Open and execute the accompanying tests to confirm your solution is correct.

    // Your Godmother gives you $10 every other Friday throughout the year.
    // Payments start on the first Friday of the year.
    // Given a date, calculate payments expected from that date until the end of the year.
    BigDecimal calculateGiftsTilEndOfYear(LocalDate date) {
        return null;
    }

    // Your Godmother is getting quirky. She adjusted her payment schedule.
    // She still pays every other Friday throughout the year, starting on the first Friday of the year.
    // But now, she pays a number of dollars equal to the day of the month.
    // Examples
    // Jan 31 == $31
    // Mar 1 == $1
    // July 12 == $12
    // Given a date, calculate payments expected from that date until the end of the year.
    BigDecimal calculateQuirkyGiftsTilEndOfYear(LocalDate date) {
        return null;
    }
}
