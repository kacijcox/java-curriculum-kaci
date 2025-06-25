package testing;

public class Thermostat {
	public enum ThermostatBehavior {
		ON_HEAT	,
		ON_AC,
		OFF,
	}

	public Thermostat(int targetTemperature, int tolerance) {
		this.targetTemperature = targetTemperature;
		this.tolerance = tolerance;
	}

	public Thermostat() {
		this.targetTemperature = 68;
		this.tolerance = 5;
	}

	// we do want to test behaviors that aren't getters/setters
	public ThermostatBehavior readSensorData(int[] temps) {
		if (temps.length == 0) {
			System.out.println("no sensor data");
			return ThermostatBehavior.OFF;

		}
		int sumTemps = 0;
		for (int i = 0; i < temps.length; i++) {
			sumTemps += temps[i];
		}
		int average = sumTemps / temps.length;
		System.out.println("average temp " + average);
		System.out.println(average - targetTemperature);


		if(Math.abs(average - targetTemperature) < tolerance) {
			return ThermostatBehavior.OFF;
		} else if (average > targetTemperature ) {
			return ThermostatBehavior.ON_AC;
		}
		return ThermostatBehavior.ON_HEAT;
	}

	public double toleranceCheck(int[] temps) {
		double difference = 0;

		for (int temperature: temps) {
			difference += temperature;
		}
		difference = difference /temps.length;
		difference -= targetTemperature;

		return difference;
	}


	private int targetTemperature;
	private int tolerance;

	public int getTargetTemperature() {
		return targetTemperature;
	}

	public void setTargetTemperature(int targetTemperature) {
		this.targetTemperature = targetTemperature;
	}

	public int getTolerance() {
		return tolerance;
	}

	public void setTolerance(int tolerance) {
		this.tolerance = tolerance;
	}
}
