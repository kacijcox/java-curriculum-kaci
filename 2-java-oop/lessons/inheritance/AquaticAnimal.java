package inheritance;

// we have a more specific class of animal that will extend the Animal class
// aquatic animal is the subclass/child of animal
// it will have everything from animal, with extra properties and behaviors specific to this class
//extends - keyword for creating a child class from parent
public class AquaticAnimal extends Animal {

	private boolean isFreshWater;
	private int aquariumSize;

	public AquaticAnimal(String name, String diet, int feedingSchedule, boolean isFreshWater, int aquariumSize) {
		super(name, diet, feedingSchedule);
		this.isFreshWater = isFreshWater;
		this.aquariumSize = aquariumSize;
	}

	public String makeSound() {
		return getName() + " says: blub blub";
	}

	public boolean isFreshWater() {
		return isFreshWater;
	}

	public void setFreshWater(boolean freshWater) {
		isFreshWater = freshWater;
	}

	public int getAquariumSize() {
		return aquariumSize;
	}

	public void setAquariumSize(int aquariumSize) {
		this.aquariumSize = aquariumSize;
	}

}




