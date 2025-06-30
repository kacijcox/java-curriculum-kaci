package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileIOExercise {
    public static void main(String[] args) throws IOException {
        FileIOExercise exercise = new FileIOExercise();
        exercise.helloWorldFile();
        exercise.readFile();
        exercise.appendToFile("fruit");

        Path movieFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/exercises/fileio/exercise_file3.txt");
        Movie movie = new Movie("what dreams may come", "vincent ward", LocalDate.of(1998, 10, 2));
        serializeMovie(movieFile, movie);
    }

    // File IO Exercise
    // ========================
    // Complete the numbered tasks below

    // 1. Write the line "Hello, World!" to a text file named exercise_file1.txt
    // the file should be stored in the same directory as this exercise file.
    // if the file already exists, it should be overwritten, not appended
    public void helloWorldFile() {
        Path path = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/exercises/fileio/exercise_file2.txt");
        System.out.println(path);

        List helloworld = new ArrayList();
        helloworld.add("hello world");

        try {
            Files.write(path, helloworld, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 2. Read all the lines from the text file named exercise_file2.txt
    // return the lines as an ArrayList of Strings
    public static ArrayList<String> readFile() throws IOException {
        Path path = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/exercises/fileio/exercise_file2.txt");
        String result = Files.readString(path);

        try {
            for (String line : Files.readAllLines(path)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    // 3. Create a method that takes in a String named fruit
    // and append it to the end of the text file named exercise_file2.txt
    public ArrayList<String> appendToFile(String fruit) {
        Path path = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/exercises/fileio/exercise_file2.txt");

        try {
            Files.write(path, fruit.getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    // 4. Create a method that removes the String fruit passed as a parameter
    // from the exercise_file2.txt file
    public void removeFromFile(String fruit) throws IOException {
        Path path = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/exercises/fileio/exercise_file2.txt");
        String delete = "fruit";

        for (String line : Files.readAllLines(path)) {
            line.replace(delete, "");
        }
    }

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
    // }


	public static Movie serializeMovie(Path movieFile, Movie movie) {
        ArrayList<Movie> moviesOne = new ArrayList<>();
        moviesOne.add(movie);
        try {
            if (Files.exists(movieFile)) {
                Files.write(movieFile, (movie.toString().getBytes()), StandardOpenOption.APPEND);
            } else {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return movie;
    }
    public static ArrayList<Movie> deserializeMovie (Path movieFile) {
        ArrayList<Movie> moviesOne = new ArrayList<>();

        try {
            for (String line : Files.readAllLines(movieFile)) {
                String[] csvLine = line.split(",");
                String[] releaseDate = csvLine[2].split("-");
                Movie movie = new Movie(csvLine[0], csvLine[1], LocalDate.of(Integer.parseInt(releaseDate[0]), Integer.parseInt(releaseDate[1]), Integer.parseInt(releaseDate[2])));
                moviesOne.add(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return moviesOne;
    }
}


