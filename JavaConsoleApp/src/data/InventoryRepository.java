//file i/o
//CRUD
//serialization
//deserialization

//don't forget about streams and buffer

package data;
import model.Product;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InventoryRepository {



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

	public static void serializeProduct(Path productFile, Product product)
	{
		productFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
		ArrayList<Product> products = new ArrayList<>();

		String csvLine = product.getProductID() + "," +
				product.getProductName() + "," +
				product.getProductPrice() + "," +
				product.getProductQuantity() + "\n";


		try {
			if (Files.exists(productFile)) {

				Files.write(productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
			} else {
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
