package inheritance;

public class TerraiumAnimal extends TerrestrialAnimal {
	private double temperature;
	private double humidity;

	public TerraiumAnimal(String name, String diet, int feedingSchedule, String habitatType, int enclosureSize, String sound, double temperature, double humidity) {
		super(name, diet, feedingSchedule, habitatType, enclosureSize, sound);
		this.temperature = temperature;
		this.humidity = humidity;
	}

	@Override
	public String makeSound() {
		return getName() + " says: " + getSound() + " ";
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

}
