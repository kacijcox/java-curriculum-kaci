package fileio;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FileIOExerciseTest {

    // test should show that the helloWorldFile() method correctly creates the exercise_file1.txt
    @Test
    public void helloWorldFile() throws IOException {
        Path path = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/exercises/fileio/exercise_file2.txt");
		String result = Files.readString(path);

		try {
			for (String line : Files.readAllLines(path)) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(result.contains("hello world"));

	}

    // validate that the readFile() method correctly reads the fruit listed in exercise_file2.txt
    @Test
    public void readFile() {
		Path path = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/exercises/fileio/exercise_file2.txt");
		try {
			ArrayList<String> readTheFile = (ArrayList<String>) Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

    // validate that the appendToFile() method correctly adds a fruit to the exercise_file2.txt file
    @Test
    public void appendToFile() {

    }

    // validate that the removeFromFile() method removes the fruit from the exercise_file2.txt file
    @Test
    public void removeFromFile() {

    }

    // Create tests to validate that the object you created can be properly serialized and deserialized

}
