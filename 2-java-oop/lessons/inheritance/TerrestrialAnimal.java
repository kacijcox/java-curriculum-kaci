package inheritance;

public class TerrestrialAnimal extends Animal {


	// habitat type
	// enclosure size
	private String habitatType;
	private int enclosureSize;
	private String sound;

	public TerrestrialAnimal(String name, String diet, int feedingSchedule, String habitatType, int enclosureSize, String sound) {
		super(name, diet, feedingSchedule);
		this.habitatType = habitatType;
		this.enclosureSize = enclosureSize;
		this.sound = sound;
	}

	public String makeSound() {
		return getName() + " says: " + getSound() + "";
	}


	public String getHabitatType() {
		return habitatType;
	}

	public void setHabitatType(String habitatType) {
		this.habitatType = habitatType;
	}

	public int getEnclosureSize() {
		return enclosureSize;
	}

	public void setEnclosureSize(int enclosureSize) {
		this.enclosureSize = enclosureSize;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
}
