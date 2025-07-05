//file i/o
//CRUD
//serialization
//deserialization

//don't forget about streams and buffer

package data;
import model.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class InventoryRepository {
	static final Path productFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
	static String csvLine;


	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
		List<String> products = new ArrayList<>();
		String header = Arrays.toString(new Object[]{"productID", "productName", "price", "quantity"});
		products.add(header);

		try {
			Files.write(path, products, StandardOpenOption.CREATE);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	public static void serializeProduct(Path productFile) throws IOException {
		if (Files.exists(productFile)) {
			Files.write(productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
		} else {

		}
	}

	public static ArrayList<Product> deserializeProduct() {
		System.out.println("File contents:");
		try (FileReader fileReader = new FileReader("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
			 BufferedReader reader = new BufferedReader(fileReader)) {
			for (String line = reader.readLine(); line != null; line =
					reader.readLine()) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void add(Product product) throws IOException {
		csvLine =
				product.getProductID() + "," +
				product.getProductName() + "," +
				product.getProductPrice() + "," +
				product.getProductQuantity() + "\n";

		try {
			serializeProduct(productFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void displayAll() {
			InventoryRepository.deserializeProduct();
		}
	}

