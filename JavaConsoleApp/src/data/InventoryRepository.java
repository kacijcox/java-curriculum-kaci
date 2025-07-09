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
import static service.InventoryService.deserializeProduct;
import static service.InventoryService.findByID;


public class InventoryRepository {
	static final Path productFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
	static String csvLine;

	public static void add(Product product) throws IOException {
		products.put(String.valueOf(product.getProductID()), product);
	}

	public static ArrayList<Product> serializeProduct(Product product) throws IOException {
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(product);

		if (Files.exists(InventoryRepository.productFile)) {
			csvLine =
					product.getProductID() + "," +
							product.getProductName() + "," +
							product.getProductPrice() + "," +
							product.getProductQuantity() + "," +
							product.isPerishable() + "\n";

			Files.write(InventoryRepository.productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
		}
		return productList;
	}

	public static ArrayList<Product> deserialize(BufferedReader reader) throws IOException {
		ArrayList<Product> productList = new ArrayList<>();
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
		return productList;
	}

	public static void delete(Product productID, int userSelectionProductID) throws IOException {
		ArrayList<Product> productList = deserializeProduct(null);

		for (Product product : productList) {
			if (product.getProductID() == userSelectionProductID) {
				products.remove(String.valueOf(userSelectionProductID));
				productList.remove(product);
				Files.write(productFile, "Product ID, Product Name, Price, Quantity, Perishable\n".getBytes());
				for (Product item : productList) {
					csvLine = item.getProductID() + "," + item.getProductName() + "," +
							item.getProductPrice() + "," + item.getProductQuantity() + "\n";
					Files.write(productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
				}
				break;
			}
		}
	}

	public static Product find(int userSelectionProductID, BufferedReader reader) throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		ArrayList<Product> productList = deserializeProduct(reader);


		for (Product product : productList) {
			if (product.getProductID() == MainMenu.userSelectionProductID) {
				System.out.println(product.getProductName() + " " + product.getProductPrice() + " " +
						product.getProductQuantity() + " " + product.getPerishable());
				return product;
			}
			return null;
		}
		return null;
	}

	public static Product save() throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		Files.write(savedFile, "Product ID | Product Name | Price | Quantity | Perishable\n".getBytes());
		for (Product product : products.values()) {
			serializeProduct(product);
		}
		return null;
	}


	public static Product load() throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		try (BufferedReader reader = Files.newBufferedReader(savedFile)) {
			ArrayList<Product> products = deserializeProduct(reader);

			System.out.println("===== Inventory List =====");
			System.out.println("ID | Name | Quantity | Price | Perishable");
			System.out.println("-----------------------------------------");

			for (Product product : products) {
				System.out.printf("%d | %s | %d | $%.2f%n",
						product.getProductID(),
						product.getProductName(),
						product.getProductQuantity(),
						product.getProductPrice(),
						product.getPerishable());
			}
		}
		return null;
	}

	public static void display() throws IOException {
		for (Product product : products.values()) {
			System.out.printf("%d | %s | %d | $%.2f%n",
					product.getProductID(),
					product.getProductName(),
					product.getProductQuantity(),
					product.getProductPrice(),
					product.isPerishable());
		}
	}

	public static void search(int userSelectionProductID, BufferedReader reader) throws IOException {
		Path inventoryFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		findByID(userSelectionProductID, reader);
	}


	public static Product update(Product product, int userSelectionProductID) throws IOException {

		String productKey = String.valueOf(userSelectionProductID);
		products.put(productKey, product);

		System.out.println("===== Inventory List =====");
		System.out.println("ID | Name | Quantity | Price | Perishable");
		System.out.println("-----------------------------------------");

		System.out.printf("%d | %s | %d | $%.2f%n",
				product.getProductID(),
				product.getProductName(),
				product.getProductQuantity(),
				product.getProductPrice(),
				product.getPerishable());

		return product;
	}
}







