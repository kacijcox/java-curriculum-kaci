package data;
import model.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static model.Product.products;

public class InventoryRepositoryTest {
	Product testProduct = new Product(1, 5, "apple", .34, false); //created a test product for test
	static final Path testFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv"); // defined inventory path


	@Before
	public void setUp() {
		products.clear();
	}

	@After
	public void endTest() {
		products.clear();
	}

	@Test
	public void InventoryRepository_add_productAdd() throws IOException {

		InventoryRepository.add(testProduct); //adding the test product here

		Assertions.assertEquals(1, Product.products.size()); //test if the product was added, if so, we should get 1
		Assertions.assertTrue(Files.exists(testFile)); //check if the the file exists
	}

	@Test
	public void InventoryRepository_delete_deleteProduct() throws IOException {
		InventoryRepository.add(testProduct);

		InventoryRepository.save();

		InventoryRepository.delete(testProduct, 1);
		Assertions.assertEquals(0, Product.products.size()); // checked that the size is 0. since it was 1 before product was deleted, it should be 0 now
	}


	@Test
	public void InventoryRepository_find_findProduct() throws IOException {
		InventoryRepository.add(testProduct); // add  the test product
		InventoryRepository.save(); //added, product was not being saved
//		userSelectionProductID = 1; //find the test product by id 1
		String result = String.valueOf(InventoryRepository.find(testProduct.getProductID())); // set the result to the test ID which is one

		Assertions.assertEquals(1, Integer.parseInt(result)); //expect 1, and check against the result
	}

	@Test
	public void InventoryRepository_save_productSave() throws IOException {
		InventoryRepository.add(testProduct); // add the test product
		InventoryRepository.save();//save the test product

		String result = (testProduct.getProductName()); //get product name and save it to result

		Assertions.assertEquals(result, "apple"); // test that the result is equal to the test name that was set
		System.out.println(result);

	}

	@Test
	public void InventoryRepository_load_productLoad() throws IOException {
		ArrayList<Product> testProductList = new ArrayList<>();

		testProductList.add(testProduct); //add the test product
		InventoryRepository.load();

		String result = String.valueOf(testProduct);

		Assertions.assertTrue(result.contains("apple"));
		System.out.println(result);
	}

	@Test
	public void InventoryRepository_update_productUpdate() throws IOException {
		InventoryRepository.add(testProduct); // add the test prodyct

		Product updatedProduct = new Product(5, 5, "apple", .34, false); //added need to create NEW one instead of modifying existing one

		InventoryRepository.update(updatedProduct, testProduct.getProductID());

		Assertions.assertTrue(products.containsKey("1"));
		Assertions.assertEquals(updatedProduct.getProductID(), products.get("1").getProductID());
	}
}
