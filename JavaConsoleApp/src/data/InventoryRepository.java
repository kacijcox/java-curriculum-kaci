package data;

import model.Product;
import service.InventoryService;
import ui.MenuUserInput;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import static model.Product.products;

public class InventoryRepository {
	final Path productFile = Paths.get("inventory.csv");
	private InventoryService inventoryService;
	private Product product;
	private MenuUserInput menuUserInput;
	String productKey;

	public InventoryRepository() {
		this.menuUserInput = menuUserInput;
	}

	public void add(Product product) throws IOException {
		products.put(String.valueOf(product.getProductID()), product);
	}

	public void serializeProduct(Product product) throws IOException {
		ArrayList<Product>productList = new ArrayList<>();
		productList.add(product);

		if (Files.exists(productFile)) {
			String csvLine = product.toCsvString();
			Files.write(productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
		}
	}

	public ArrayList<Product> deserialize() throws IOException {
		ArrayList<Product> productList = new ArrayList<>();
		List<String> lines = Files.readAllLines(productFile);
		lines.remove(0);

		for (String line : lines) {
			String[] csvLine = line.split(",");
			Product products = product.parseCsvLineToProduct(csvLine);
			productList.add(products);
		}
		return productList;
	}

	public void delete(int userSelectionProductID) throws IOException {
		ArrayList<Product> productList = inventoryService.deserializeProduct();
		for (Product product : productList) {
			if (product.getProductID() == userSelectionProductID) {
				products.remove(String.valueOf(userSelectionProductID));
				productList.remove(product);
				Files.write(productFile, product.productHeader().getBytes());
				for (Product ignored : productList) {
					String csvLine = product.toCsvString();
					Files.write(productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
				}
				break;
			}
		}
	}

	public int find(int userSelectionProductID) throws IOException {
		ArrayList<Product> productList = inventoryService.deserializeProduct();

		for (Product product : productList) {
			if (product.getProductID() == menuUserInput.getUserSelectionProductID()) {
				System.out.println(product.getProductName() + " " + product.getProductPrice() + " " +
						product.getProductQuantity() + " " + product.getPerishable());
			}
		}
		return userSelectionProductID;
	}

	public Product save() throws IOException {
		Files.write(productFile, product.productHeader().getBytes());
		for (Product product : products.values()) {
			serializeProduct(product);
		}
		return null;
	}

	public Product load() throws IOException {
		ArrayList<Product> productList = deserialize();

		products.clear();

		for (Product product : productList) {
			products.put(String.valueOf(product.getProductID()), product);
		}
		return product;
	}

	public void display() throws IOException {
		products.values().forEach(product -> // (demonstrate use of a lambda) iterate through the products hash map values
				products.get(productKey).formatUpdateProductGetter());
	}

	public void search(int userSelectionProductID) throws IOException {
		inventoryService.findByID(userSelectionProductID);
	}

	public Product update(Product product, int userSelectionProductID) throws IOException {
		String productKey = String.valueOf(userSelectionProductID);
		products.put(productKey, product); 
		products.get(productKey).formatUpdateProductGetter();
		return product;
	}
}







