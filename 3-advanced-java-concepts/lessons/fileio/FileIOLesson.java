package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;

public class FileIOLesson {

	// file io
	//know how to work with files and directories
	// be able to use data storage for saving a programs state
	// be able to write and read files via java scripts

	public static void main(String[] args) throws IOException {
		//  there are two versions of file handling built into the java jdk
		//java io is the older version
		//java nio is the newer version
		//they are both fine but for this class i'm going to be using the nio version

		//path
		Path path = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/lessons/fileio/test.txt");
		System.out.println(path);
		// readAttributes has a checked exception io exception that we must either throw or handle with a try catch

		System.out.println("is directory: " + Files.isDirectory(path));
		System.out.println("is reg file: " + Files.isRegularFile(path));
		System.out.println("is readable: " + Files.isReadable(path));
		System.out.println("is writeable: " + Files.isWritable(path));
		System.out.println("is executable: " + Files.isExecutable(path));
		System.out.println("is symbolic link: " + Files.isSymbolicLink(path));

		try {
			System.out.println("size: " + Files.size(path));
			System.out.println("get last modified: " + Files.getLastModifiedTime(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// create a file and write to it
		path = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/lessons/fileio/elements.txt");
		ArrayList<String> elements = new ArrayList<>();
		elements.add("hydrogen");
		elements.add("helium");
		elements.add("lithium");
		elements.add("boron");

		try {
			Files.write(path, elements, StandardOpenOption.CREATE);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		elements.clear();
		elements.add("beryllium");
		elements.add("carbon");

		try {
			Files.write(path, elements, StandardOpenOption.APPEND);
			Files.write(path, "gold\n".getBytes(), StandardOpenOption.APPEND);

		} catch (IOException e) {
		}

		// read from a file
		try {
			for (String line : Files.readAllLines(path)) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		//delete a file
		try {
			if (Files.deleteIfExists(path)) {
				System.out.println("file was deleted");
			} else {
				System.out.println("file was not deleted");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// using files to create/copy/move files

		Path source = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/lessons/fileio/test.txt");
		Path target = Paths.get("test2.txt");

		// copy a file from a sourcer to a target
		if (Files.exists(source)) {
//			Files.copy(source, target);
		}
		if (Files.exists(target)) {
			Files.move(target, Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/lessons/fileio/test2.txt"));
		}

		Path songFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/3-advanced-java-concepts/lessons/fileio/songs.txt");
		Song song = new Song("candle in the wind", "elton john", LocalDate.of(1974, 2, 22));
		serializeSong(songFile, song);
	}

	public static ArrayList<Song> serializeSong(Path path, Song song) {
		// does a song.txt file exist?
		// if it does not, create it and then add the song
		ArrayList<Song> songs = new ArrayList<>();
		songs.add(song);

		try {
			if (Files.exists(path)) {
				Files.write(path, (song.toString().getBytes()), StandardOpenOption.APPEND);
				// if songs.txt does exist, we want to append to the end of the list
			} else {
				//we want to create the file and add the song
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return songs;
	}

	public static ArrayList<Song> deserializeSong(Path path) {
		ArrayList<Song> songs = new ArrayList<>();

		try {
			for (String line : Files.readAllLines(path)) {
				String[] csvLine = line.split(",");
				String[] releaseDate = csvLine[2].split("-");
				Song song = new Song(csvLine[0], csvLine[1], LocalDate.of(Integer.parseInt(releaseDate[0]), Integer.parseInt(releaseDate[1]), Integer.parseInt(releaseDate[2])));
				songs.add(song);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return songs;
	}
}