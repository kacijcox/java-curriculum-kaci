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
import static ui.MainMenu.*;


public class InventoryRepository {
	static final Path productFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
	// define final path of the file being used to load/save inventory
	static String csvLine;
	// define csvLine in productFile

	public static void add(Product product) throws IOException {
		products.put(String.valueOf(product.getProductID()), product);
		// add() just simply adds to the hash array of products. no serialization into the csv
	}

	public static ArrayList<Product> serializeProduct(Product product) throws IOException {
		ArrayList<Product> productList = new ArrayList<>(); // creating a new array list for the added product to be serialized into the csv file
		productList.add(product); // added the product to the newly created array list

		if (Files.exists(InventoryRepository.productFile)) { //checking that inventory exists before serialization logic is intialized
			csvLine =
					product.getProductID() + "," +
							product.getProductName() + "," +
							product.getProductPrice() + "," +
							product.getProductQuantity() + "," +
							product.isPerishable() + "\n";

			Files.write(InventoryRepository.productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
			//if the inventory file exists, the file is written to and the array list is serialized into the csv file
		}
		return productList;
	}

	public static ArrayList<Product> deserialize() throws IOException {
		ArrayList<Product> productList = new ArrayList<>(); // creating a new array list for the products to be deserialized and prepared for viewing
		List<String> lines = Files.readAllLines(productFile); // a new list is created for iteration
		lines.remove(0); // skip the header

		for (String line : lines) { // iterate through the lines of the csv file
			String[] csvLine = line.split(",");
			Product products = new Product( //create the product object from the csv for viewing
					Integer.parseInt(csvLine[0]),
					Integer.parseInt(csvLine[3]),
					csvLine[1],
					Double.parseDouble(csvLine[2]),
					Boolean.parseBoolean(csvLine[4]));

			productList.add(products); //the product is added to the new array list
		}
		return productList; // and finally the array list is returned for viewing
	}

	public static void delete(Product productID, int userSelectionProductID) throws IOException {
		ArrayList<Product> productList = deserializeProduct(); // the stored array list is deserialized and prepared for viewing

		for (Product product : productList) { // iterate through the array list of products to find the product to be deleted
			if (product.getProductID() == userSelectionProductID) { // if there is a product ID that exists in the stored product list that matches the user input
				products.remove(String.valueOf(userSelectionProductID)); // then it is removed from the hash map of products and the csv file is updated accordingly
				productList.remove(product); // and the product is also removed from the array list of products
				Files.write(productFile, "Product ID, Product Name, Price, Quantity, Perishable\n".getBytes()); // the header is rewritten
				for (Product item : productList) { // and now checks for the products that remain
					csvLine = item.getProductID() + "," + item.getProductName() + "," +
							item.getProductPrice() + "," + item.getProductQuantity() + "\n";
					Files.write(productFile, csvLine.getBytes(), StandardOpenOption.APPEND); // and appends them to the product file
				}
				break;
			}
		}
	}

	public static int find(int userSelectionProductID) throws IOException {
		ArrayList<Product> productList = deserializeProduct(); // the stored array list is deserialized and prepared for viewing


		for (Product product : productList) { //iterate through the array list
			if (product.getProductID() == MainMenu.userSelectionProductID) { // if the user input matches a product ID that exists
				System.out.println(product.getProductName() + " " + product.getProductPrice() + " " + // then the product information is printed
						product.getProductQuantity() + " " + product.getPerishable());
			}
		}
		return userSelectionProductID;
	}

	public static Product save() throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		Files.write(savedFile, "Product ID | Product Name | Price | Quantity | Perishable\n".getBytes()); // a header is added to the saved inventory
		for (Product product : products.values()) { //products is interated through
			serializeProduct(product); // and serialize is called to add the products in the array list
		}
		return null;
	}


	public static Product load() throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		ArrayList<Product> products = deserializeProduct(); // and the array list is deserialized

			System.out.println("===== Inventory List =====");
			System.out.println("ID | Name | Quantity | Price | Perishable");
			System.out.println("-----------------------------------------");

			for (Product product : products) { // the products are iterated through
				System.out.printf("%d | %s | %d | $%.2f%n", //format
						//product getters are called to print the product info
						product.getProductID(),
						product.getProductName(),
						product.getProductQuantity(),
						product.getProductPrice(),
						product.getPerishable());
			}
		return null;
	}

	public static void display() throws IOException {
		products.values().forEach(product -> // (demonstrate use of a lambda) iterate through the products hash map values
			System.out.printf("%d | %s | %d | $%.2f%n | %b%n",
					product.getProductID(),
					product.getProductName(),
					product.getProductQuantity(),
					product.getProductPrice(),
					product.isPerishable()));
	}

	public static void search(int userSelectionProductID) throws IOException {
		Path inventoryFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		findByID(userSelectionProductID); // the findbyID method is called to find the product ID that matches the user input
	}


	public static Product update(Product product, int userSelectionProductID) throws IOException {

		String productKey = String.valueOf(userSelectionProductID); // the product ID is converted to a string for the hash map key
		products.put(productKey, product); // the product is added to the hash map with the updated product ID as the key

		System.out.println("===== Inventory List =====");
		System.out.println("ID | Name | Quantity | Price | Perishable");
		System.out.println("-----------------------------------------");

		//set the values
		product.setProductID(newProductID);
		product.setProductName(newProductName);
		product.setProductQuantity(newProductQuantity);
		product.setProductPrice(newProductPrice);
		product.setPerishable(newIsPerishable);

		System.out.printf("%d | %s | %d | $%.2f%n | %b%n", // print the new product information
				product.getProductID(),
				product.getProductName(),
				product.getProductQuantity(),
				product.getProductPrice(),
				product.getPerishable());

		return product;
	}
}







