//* Initialize 3 Movies in ObjectsExercise using your Movie class
//  * use the 5 parameter constructor for two movies that are already out and
//  * use the 4 parameter constructor for a movie that hasn't been released
//		* use the toString you created to print out all of the movies

package objects;


public class ObjectsExercise {
	public static void main(String[] args) {
		// instantiate a book object from the book class blueprint
		// memory is allocated for this object using the new keyword
		Movie firstReleasedMovie = new Movie("ferris bueller's day off", "john hughes", "$70.7 million", "john hughes",
				"103 minutes");


		Movie secondReleasedMovie = new Movie("sixteen candles", "john hughes", "$23.7 million", "john hughes",
				"93 minutes");

		Movie notReleasedMovie = new Movie("scream 7", "kevin williamson", "kevin williamson",
				"120 minutes");

		System.out.println(firstReleasedMovie.getTitle() + "," + " united states" + "\ndirected by: " +
				firstReleasedMovie.getDirector() + "\n directed by: " + notReleasedMovie.getDirectedBy() +
				"\nrunning time: " + firstReleasedMovie.getRunTime() +
				"\nbox office: " + firstReleasedMovie.getBoxOfficeReturn() + "\n");

		System.out.println(secondReleasedMovie.getTitle() + "," + " united states" + "\ndirector : " +
				secondReleasedMovie.getDirector() + "\n directed by: " + secondReleasedMovie.getDirectedBy() +
				"\nrunning time: " + secondReleasedMovie.getRunTime() +
				"\nbox office: " + secondReleasedMovie.getBoxOfficeReturn() + "\n");

		System.out.println(notReleasedMovie.getTitle() + "," + " united states" + "\ndirector by: " +
				notReleasedMovie.getDirector() + "\n directed by: " + notReleasedMovie.getDirectedBy() + "\nrunning time: "
				+ notReleasedMovie.getRunTime());

		// * Initialize 3 Lockers in ObjectsExercise, and demonstrate the use of the constructor, storeItem(), retrieveItem(), and toString() methods
		Locker firstLocker = new Locker("1 ", false, " wallet ", 1234);
		Locker secondLocker = new Locker("2 ", false, " book ", 4321);
		Locker thirdLocker = new Locker("3 ", true, " pen ", 5678);

		System.out.println(firstLocker);
		System.out.println(secondLocker);
		System.out.println(thirdLocker);
	}




}
