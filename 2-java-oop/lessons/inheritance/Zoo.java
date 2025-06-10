package inheritance;

public class Zoo {

	public static void main(String[] args) {


		Animal[] zooAnimals = new Animal[3];

		zooAnimals[0] = new AquaticAnimal("whale shark", "plankton", 7, false, 10000);
		zooAnimals[1] = new TerrestrialAnimal("wolf", "meat", 3, "forest", 500, "howl" );
		zooAnimals[2] = new TerraiumAnimal("snake", "meat", 5, "dirt",500, "hiss", 20.0, 50.0 );

		System.out.println("currently the zoo sounds like");
		for(int i =0; i < zooAnimals.length; i++) {
			System.out.println(zooAnimals[i].makeSound());
		}
	}
}