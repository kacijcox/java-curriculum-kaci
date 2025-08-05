//package testing;
//import org.junit.Assert;
//import org.junit.Test;
//
//public class TestingLessonTest {
//	public static void main(String[] args) {
//		Thermostat thermostat = new Thermostat();
//		int[] tempTest = {68};
//		System.out.println(thermostat.readSensorData(tempTest));
//	}
//
//	@Test
//	public void TestingLesson_sumNumbers_addingNumbersTest() {
//		// arrange - setting up values you will be using for testing
//		int number1 = 1;
//		int number2 = 1;
//
//		// Act - call the method that we want to test using the values we set up inb the arrangement step
//
//		int result = TestingLesson.sumNumbers(number1, number2);
//
//		// Assert
//		Assert.assertEquals(2, result);
//	}
//
//	@Test
//	public void TestingLesson_sumNumbers_addingDecimalTest() {
//		// Arrange
//		double number1 = .1;
//		double number2 = .1;
//		double number3 = .1;
//
//		// act
//		double result = TestingLesson.sumNumbers(number1, number2, number3);
//		System.out.println(result);
//
//		//assert
//		Assert.assertEquals(.3, result, .000001);
//	}
//
//	// for the thermostat we need at least 3 tests, one for ON_HEAT, ON_AC, and OFF
//	@Test
//	public void Thermostat_readSensorData_heatingTest() {
//		//arange
//		int[] testTemps = {68, 70, 66, 64, 72};
//		Thermostat thermostat = new Thermostat(70, 2);
//
//		// act
//		Thermostat.ThermostatBehavior result = thermostat.readSensorData(testTemps);
//
//		// assert
//
//		Assert.assertEquals(Thermostat.ThermostatBehavior.ON_HEAT, result);
//
//	}
//	@Test
//	public void Thermostat_readSensorData_coolingTest() {
//		//arrange
//		int[] testTemps = {72,74,70, 68, 71};
//		Thermostat thermostat = new Thermostat(70, 2);
//
//		// ACt
//		Thermostat.ThermostatBehavior result = thermostat.readSensorData(testTemps);
//
//		// assert
//		Assert.assertEquals(Thermostat.ThermostatBehavior.ON_AC, result);
//	}
//
//	// challenge finish this test
//
//	@Test
//	public void Thermostat_readSensorData_offTest() {
//		// arrange
//		int[] testTemps = {72,74,70,68};
//		Thermostat thermostat = new Thermostat(70, 2);
//
//		//act
//		Thermostat.ThermostatBehavior result = thermostat.readSensorData(testTemps);
//
//		//assert
//		Assert.assertEquals(Thermostat.ThermostatBehavior.OFF, result);
//
//	}
//	@Test
//	public void Thermostat_readSensorData_emptyTempList() {
//		// arrange
//		int[] testTemps = {};
//		Thermostat thermostat = new Thermostat(70, 2);
//
//		//act
//		Thermostat.ThermostatBehavior result = thermostat.readSensorData(testTemps);
//
//		//assert
//		Assert.assertEquals(Thermostat.ThermostatBehavior.OFF, result);
//
//	}
//
//	@Test
//	public void Thermostat_readSensorData_negativeTempList() {
//		// arrange
//		int[] testTemps = {-6, -7, -8};
//		Thermostat thermostat = new Thermostat(0, 5);
//
//		//act
//		Thermostat.ThermostatBehavior result = thermostat.readSensorData(testTemps);
//
//		//assert
//		Assert.assertEquals(Thermostat.ThermostatBehavior.ON_HEAT, result);
//
//	}
//
//	// tdd test driven development
//	// red - write a test that fails due to a behavior not being implemented
//	//GReen - write code to make the test pass
//	// Refactor - fix any code issues
//
//	// a test to return a double equal to tempList average - target temperature
//	// for fine tuning tolerances
//
//	@Test
//	public void Thermostat_tolerenceCheck_returnDifference() {
//		//arrange
//		int[] testTemps = {70,71,70};
//		Thermostat thermostat = new Thermostat(70, 2);
//		//act
//		double result = thermostat.toleranceCheck(testTemps);
//
//		// assert
//		Assert.assertEquals(.33333333, result, .000001);
//		Assert.assertSame("test", "test");
//	}
//
//
//
//
//}
