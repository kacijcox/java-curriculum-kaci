//package service;
//import model.Product;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import static model.Product.products;
//import static org.junit.Assert.*;
//
//
//public class InventoryServiceTest {
//	Product testProduct = new Product();
//
//	@Before
//	public void setUp() {
//		products.clear();
//	}
//
//	@After
//	public void endTest() {
//		products.clear();
//	}
//
//
//
//	@Test
//	public void InventoryService_findByID_checkThatIDExists() throws IOException {
//		InventoryService.addProduct(testProduct);
//		int result = InventoryService.searchProduct(1);
//
//		assertEquals(1, result);
//		System.out.println(result);
//	}
//
//	@Test
//	public void InventoryService_deleteProduct_noProduct() throws IOException {
//		products.clear();
//
//		InventoryService.deleteProduct();
//		assertTrue(products.isEmpty());
//	}
//
//	@Test
//	public void InventoryService_displayAll_noProduct() throws IOException {
//		products.clear();
//
//		InventoryService.displayAll();
//
//		assertTrue(products.isEmpty());
//	}
//
//	@Test
//	public void InventoryService_updateProduct_emptyInventory() throws IOException {
//		products.clear();
//		Product updatetestProduct = testProduct;
//
//		InventoryService.updateProduct(updatetestProduct, 3);
//
//		assertTrue(products.isEmpty());
//	}
//
//	@Test
//	public void InventoryService_searchProduct_searchForProduct() throws IOException {
//		ArrayList<Product> testProductList = new ArrayList<>();
//		testProductList.add(testProduct);
//
//		int result = InventoryService.searchProduct(1);
//
//		assertEquals(1, result);
//	}
//}
