package data;
import model.Product;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class InventoryRepository {
	static final Path productFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
	static String csvLine;
	private static String line;

	public static void main(String[] args) throws IOException {
		List<String> products = new ArrayList<>();
		String header = "productID, productName, price, quantity";
		products.add(header);

		try {
			Files.write(productFile, products, StandardOpenOption.CREATE);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	public static void serializeProduct(Path productFile, String csvLine) throws IOException {
		if (Files.exists(InventoryRepository.productFile)) {
			Files.write(InventoryRepository.productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
		}
	}

	public static ArrayList<Product> deserializeProduct() {
		ArrayList<Product> productList = new ArrayList<>();

		try {
			List<String> lines = Files.readAllLines(productFile);
			lines.remove(0);

			for (String line : lines) {
				String[] csvLine = line.split(",");
				Product products = new Product(
						Integer.parseInt(csvLine[0]),
						Integer.parseInt(csvLine[3]),
						csvLine[1],
						Double.parseDouble(csvLine[2]));
				productList.add(products);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return productList;
	}

	public static void add(Product product) throws IOException {
		csvLine =
						product.getProductID() + ", " +
						product.getProductName() + "," +
						product.getProductPrice() + "," +
						product.getProductQuantity() + "\n";
		try {
			serializeProduct(productFile, csvLine);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void displayAll() throws IOException {
		ArrayList<Product> products = deserializeProduct();

		if (products.isEmpty()) {
			System.out.println("No products to display");
			return;
		}

		System.out.println("===== Inventory List =====");
		System.out.println("ID | Name | Quantity | Price");
		System.out.println("-----------------------------------------");

		for (Product product : products) {
			System.out.printf("%d | %s | %d | $%.2f%n",
					product.getProductID(),
					product.getProductName(),
					product.getProductQuantity(),
					product.getProductPrice());
		}
	}
}
