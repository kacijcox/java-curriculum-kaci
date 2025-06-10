package inheritance;

// implementing a parent/superclass named Animal
//n it has properties/behaviors (methods other than getters.setters) that all animals share
// abstract means that we don't want to be able to initiaize an object from this class
public abstract class Animal {
	private String name;
	private String diet;
	private int feedingSchedule;

	public Animal(String name, String diet, int feedingSchedule) {
		this.name = name;
		this.diet = diet;
		this.feedingSchedule = feedingSchedule;
	}

	// abstract keyword means that any child of this class that must be intialized
	// must implement this method
	//abstract methods do not have body and end with a semicolon
	public abstract String makeSound();

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public int getFeedingSchedule() {
		return feedingSchedule;
	}

	public void setFeedingSchedule(int feedingSchedule) {
		this.feedingSchedule = feedingSchedule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
