package data;
import model.Product;
import ui.MainMenu;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import static model.Product.products;


public class InventoryRepository {
	static final Path productFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
	static String csvLine;

	public static void add(Product product) throws IOException {
		if (products.containsKey(String.valueOf(product.getProductID()))) {
			products.put(String.valueOf(product.getProductID()), product);
		}
	}

	public static ArrayList<Product> serializeProduct(Product product) throws IOException {
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(product);

		if (Files.exists(InventoryRepository.productFile)) {
			csvLine =
					product.getProductID() + "," +
							product.getProductName() + "," +
							product.getProductPrice() + "," +
							product.getProductQuantity() + "\n";
			Files.write(InventoryRepository.productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
		}
		return productList;
	}

	public static ArrayList<Product> deserializeProduct(BufferedReader reader) {
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
						Double.parseDouble(csvLine[2]),
						Boolean.parseBoolean(csvLine[4]));

				productList.add(products);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return productList;
	}

	public static void delete(int userSelectionProductID, Product productID) throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		try (BufferedReader reader = Files.newBufferedReader(savedFile)) {
			ArrayList<Product> productList = deserializeProduct(reader);

			for (Product product : productList) {
				if (product.getProductID() == userSelectionProductID) {
					productList.remove(product);
					Path productFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
					Files.write(productFile, "productID,productName,price,quantity\n".getBytes());
					for (Product item : productList) {
						String csvLine = item.getProductID() + "," + item.getProductName() + "," +
								item.getProductPrice() + "," + item.getProductQuantity() + "\n";
						Files.write(productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
					}
					break;
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static Product findByID(int userSelectionProductID) {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		try (BufferedReader reader = Files.newBufferedReader(savedFile)) {
			ArrayList<Product> productList = deserializeProduct(reader);


			for (Product product : productList) {
				if (product.getProductID() == MainMenu.userSelectionProductID) {
					System.out.println(product.getProductName() + " " + product.getProductPrice() + " " + product.getProductQuantity());
					return product;
				}
			}
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static Product save() throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		try {
			Files.write(savedFile, "productID,productName,price,quantity\n".getBytes());
			for (Product product : products.values()) {
				serializeProduct(product);
			}
			System.out.println("Current inventory saved to file");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public static void load() throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		try (BufferedReader reader = Files.newBufferedReader(savedFile)) {
			ArrayList<Product> products = deserializeProduct(reader);

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
}






