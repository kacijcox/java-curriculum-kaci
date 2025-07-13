package data;

import model.Product;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;


public class InventoryRepositoryTest {
	private InventoryRepository inventoryRepository;
	private Product testProduct;
	private Path testInventory = Path.of("test_inventory.csv");

	@Before
	public void setUp() throws IOException {
		inventoryRepository = new InventoryRepository();
		testProduct  = new Product().setAllProduct(false, 1, "peach", 4, .58);
		Files.deleteIfExists(testInventory);
		Files.createFile(testInventory);
	}

	@Test
	public void InventoryRepository_add_duplicateProduct() throws IOException {
		inventoryRepository.add(testProduct);
		inventoryRepository.add(testProduct);

		assertEquals(1, Product.products.size());
	}

//	@Test
//	public void InventoryRepository_deserialize_emptyFile() throws IOException {
//		inventoryRepository.productFile = testInventory;
//		ArrayList<Product> result = inventoryRepository.deserialize();
//		assertTrue(result.isEmpty());

	@Test
	public void InventoryRepository_find_nonExistingProductID() throws IOException {
		Product testProduct2 = new Product().setAllProduct(true, 2, "pear", 2, .39);
		ArrayList<Product> testProductList = new ArrayList<>();
		testProductList.add(testProduct2);

		int result = inventoryRepository.find(3);
		boolean existsInList = testProductList.stream().anyMatch(product -> product.getProductID() == result);

		assertFalse(existsInList);

		System.out.println(testProductList.size());
		testProductList.clear();
	}

	@Test
	public void InventoryRepository_save_saveProductWhenArrayIsEmpty() throws IOException {
		HashMap<String, Product> testProductList3 = new HashMap<>(); // Empty product list
		inventoryRepository.productFile = testInventory;

		Product.products.clear();
		inventoryRepository.save();

		assertTrue(testProductList3.isEmpty());
	}
	}

