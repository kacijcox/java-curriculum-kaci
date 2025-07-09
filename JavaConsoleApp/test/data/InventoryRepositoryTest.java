package data;
import model.Product;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static ui.MainMenu.userSelectionProductID;


public class InventoryRepositoryTest {
	Product testProduct = new Product(1, 5, "apple", .34, false);
	static final Path testFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

	@Test
	public void InventoryRepository_add_productAdd() throws IOException {

		InventoryRepository.add(testProduct);

		Assertions.assertEquals(1, Product.products.size());
		Assertions.assertTrue(Files.exists(testFile));
	}

	@Test
	public void InventoryRepository_delete_deleteProduct() throws IOException {

		InventoryRepository.delete(testProduct, 1);

		Assertions.assertEquals(0, Product.products.size());
	}


	@Test
	public void InventoryRepository_find_findProduct() throws IOException {
		InventoryRepository.add(testProduct);
		userSelectionProductID = 1;
		String result = String.valueOf(InventoryRepository.find(testProduct.getProductID()));

		Assertions.assertEquals(1, Integer.parseInt(result));
	}

	@Test
	public void InventoryRepository_save_productSave() throws IOException {
		InventoryRepository.add(testProduct);
		InventoryRepository.save();

		String result = (testProduct.getProductName());

		Assertions.assertEquals(result, "apple");
		System.out.println(result);

	}

	@Test
	public void InventoryRepository_load_productLoad() throws IOException {
		InventoryRepository.add(testProduct);
		InventoryRepository.load();

		String result = (testProduct.getProductName());

		Assertions.assertEquals(result, "apple");
		System.out.println(result);
	}

	@Test
	public void InventoryRepository_update_productUpdate() throws IOException {
		InventoryRepository.add(testProduct);
		testProduct.setProductID(5);

		InventoryRepository.update(testProduct, 5);

		Assertions.assertEquals(5, testProduct.getProductID());
	}


}
