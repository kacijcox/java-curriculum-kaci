package fileio;
// 5. Create a new class in this directory that you can practice serializing and deserializing
// It should have at least one of each of the following datatypes as properties:
// String
// LocalDate or LocalTime
// BigDecimal

// 6. Create a method to serialize your new object into a csv line in the text file exercise_file3.txt
// public static void serializeObject([YOUR OBJECT] objectName) {
// }

// 7. Create a method to deserialize your new object from the exercise_file3.txt into an ArrayList of Objects
// public static ArrayList<[YOUR OBJECT]> deserializeObject() {
//    return null;
//


import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Movie {
	private String movieName;
	private String directedBy;
	private LocalDate releaseDate;

	public Movie(String movieName, String directedBy, LocalDate releaseDate) {
		this.movieName = movieName;
		this.directedBy = directedBy;
		this.releaseDate = releaseDate;
	}

	public static void serializeMovie() {
		Path source = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/exercises/fileio/exercise_file3.txt");
		Movie movie = new Movie("what dreams may come", "vincent ward", LocalDate.of(1998, 10, 2));
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectedBy() {
		return directedBy;
	}

	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
}
