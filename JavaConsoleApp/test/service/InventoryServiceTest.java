package service;
import model.Product;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;

import static model.Product.products;
import static org.junit.Assert.*;


public class InventoryServiceTest {
	Product testProduct = new Product(1, 2, "orange",.34, true);


	@Test
	public void InventoryService_findByID_checkThatIDExists() throws IOException {
		ArrayList<Product> testProductList = new ArrayList<>();
		testProductList.add(testProduct);
		int result = InventoryService.find(1);

		assertEquals(1, result);
		System.out.println(result);
	}

	@Test
	public void InventoryService_deleteProduct_noProduct() throws IOException {
		products.clear();

		InventoryService.deleteProduct();
		assertTrue(products.isEmpty());
	}

	@Test
	public void InventoryService_displayAll_noProduct() throws IOException {
		products.clear();

		InventoryService.displayAll();

		assertTrue(products.isEmpty());
	}

	@Test
	public void InventoryService_updateProduct_emptyInventory() throws IOException {
		products.clear();
		Product updatetestProduct = testProduct;

		InventoryService.updateProduct(updatetestProduct, 3);

		assertTrue(products.isEmpty());
	}

	@Test
	public void InventoryService_searchProduct_searchForProduct() throws IOException {
		ArrayList<Product> testProductList = new ArrayList<>();
		testProductList.add(testProduct);

		int result = InventoryService.searchProduct(1);

		assertEquals(1, result);
	}
}
