package model;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class ProductTest {
	@Test
	public void Product_productName_setAndGetProductName() {
	Product testProduct = new Product(1, 2, "orange",.34, true);

	String result = testProduct.setProductName("kiwi");

	Assert.assertSame(result, testProduct.getProductName());

		System.out.println(result);
	}

	@Test
	public void Product_productProductID_setAndGetProductID() {
		Product testProduct = new Product(1, 2, "orange",.34, true);

		int result = testProduct.setProductID(5);

		Assert.assertSame(result, testProduct.getProductID());

		System.out.println(result);
		System.out.println(testProduct.getProductID());
	}

	@Test
	public void Product_productQuantity_setAndGetProductQuantity() {
		Product testProduct = new Product(1, 2, "orange",.34, true);

		int result = testProduct.setProductQuantity(10);

		Assert.assertSame(result, testProduct.getProductQuantity());

		System.out.println(result);
		System.out.println(testProduct.getProductQuantity());
	}

	@Test
	public void Product_productPrice_setAndGetProductPrice() {
		Product testProduct = new Product(1, 2, "orange",.34, true);

		double result = testProduct.setProductPrice(.48);

		assertEquals(result, .48, testProduct.getProductPrice());

		System.out.println(result);
		System.out.println(testProduct.getProductPrice());
	}
}



