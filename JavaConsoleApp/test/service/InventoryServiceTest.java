package service;
import data.InventoryRepository;
import model.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

import static model.Product.products;
import static org.junit.Assert.*;


public class InventoryServiceTest {
	private InventoryService inventoryService;
	Product testProduct = new Product();

	@Before
	public void setUp() {
		inventoryService = new InventoryService(new InventoryRepository());
		products.clear();
	}

	@After
	public void endTest() {
		products.clear();
	}


	@Test
	public void InventoryService_deleteProduct_noProduct() throws IOException {
		products.clear();

		inventoryService.deleteProduct();
		assertTrue(products.isEmpty());
	}

	@Test
	public void InventoryService_displayAll_noProduct() throws IOException {
		products.clear();

		inventoryService.displayAll();

		assertTrue(products.isEmpty());
	}

	@Test
	public void InventoryService_updateProduct_emptyInventory() throws IOException {
		products.clear();
		Product updatetestProduct = testProduct;

		inventoryService.updateProduct(updatetestProduct, 3);

		assertTrue(products.isEmpty());
	}
}

