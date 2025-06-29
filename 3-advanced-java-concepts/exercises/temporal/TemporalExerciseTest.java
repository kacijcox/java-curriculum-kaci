package temporal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TemporalExerciseTest {
    TemporalExercise temporalExercise = new TemporalExercise();
    
    @Test
    public void getTeaTime() {
        LocalTime expected = LocalTime.of(16, 0);
        Assert.assertEquals(expected, temporalExercise.getTeaTime());
    }

    @Test
    public void add12Hours() {
        LocalTime time = LocalTime.now();
        Assert.assertEquals(time.plusHours(12), temporalExercise.add12Hours(time));

    }

    @Test
    public void getQuarterHourAppointments() {
        List<LocalTime> expected = new ArrayList<>();
        expected.add(LocalTime.of(16,15));
        expected.add(LocalTime.of(16,30));
        expected.add(LocalTime.of(16,45));
        expected.add(LocalTime.of(17,0));
        LocalTime time = LocalTime.of(16, 6, 32);

        List<LocalTime> actual = temporalExercise.getQuarterHourAppointments(time);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getFirstFlightDate() {
        Assert.assertEquals(LocalDate.of(1903, Month.DECEMBER, 17), temporalExercise.getFirstFlightDate());
    }

    @Test
    public void makeFutureNullShiftThePast() {

        // future
        Assert.assertNull(temporalExercise.makeFutureNullShiftThePast(LocalDate.now().plusDays(14)));
        Assert.assertNull(temporalExercise.makeFutureNullShiftThePast(LocalDate.now().plusYears(11)));

        // today
        Assert.assertEquals(LocalDate.now().plusDays(5), temporalExercise.makeFutureNullShiftThePast(LocalDate.now()));

        // past
        LocalDate date = LocalDate.now().minusDays(200);
        Assert.assertEquals(date.plusDays(5), temporalExercise.makeFutureNullShiftThePast(date));

        date = LocalDate.now().minusWeeks(200);
        Assert.assertEquals(date.plusDays(5), temporalExercise.makeFutureNullShiftThePast(date));

        date = LocalDate.now().minusMonths(200);
        Assert.assertEquals(date.plusDays(5), temporalExercise.makeFutureNullShiftThePast(date));
    }

    @Test
    public void getDaysBetween() {
        LocalDate one = LocalDate.of(1985, 3, 15);
        LocalDate two = LocalDate.of(2025, 12, 15);
        Assert.assertEquals(14885, temporalExercise.getDaysBetween(one, two));

    }
    
    @Test
    public void calculateGiftsTilEndOfYear() {
        BigDecimal actual = temporalExercise.calculateGiftsTilEndOfYear(LocalDate.of(2020, 8, 29));
        Assert.assertEquals(new BigDecimal("80"), actual);
    }

    @Test
    public void calculateQuirkyGiftsTilEndOfYear() {
        BigDecimal actual = temporalExercise.calculateQuirkyGiftsTilEndOfYear(LocalDate.of(2020, 8, 29));
        Assert.assertEquals(new BigDecimal("116"), actual);
    }
}
