package data;
import model.Product;
import ui.MainMenu;
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

	public static void add(Product product) throws IOException {
		serializeProduct(product);
	}

	public static ArrayList<Product> serializeProduct(Product product) throws IOException {
		ArrayList<Product> productList = new ArrayList<>();

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


	public static Product load() throws IOException {
		ArrayList<Product> productList = deserializeProduct();

		for (Product product : productList) {
			Product.products.put(String.valueOf(product.getProductID()), product);
		}
		return null;
	}


	public static void delete(int userSelectionProductID, Product productID) {

		try {
			ArrayList<Product> productList = deserializeProduct();

			for (Product product : productList) {
				if (product.getProductID() == userSelectionProductID) {
					productList.remove(product);
					Files.write(productFile, "productID, productName, price, quantity\n".getBytes());
					for (Product item : productList) {
						csvLine = item.getProductID() + "," + item.getProductName() + "," +
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
		try {
			ArrayList<Product> productList = deserializeProduct();

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
}




