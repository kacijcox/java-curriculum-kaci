import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	@Test
	public void ShoppingCart_itemsInCart(){
		int items = 2;

		int result = ShoppingCart.addItem(items);

		Assertions.assertEquals(2, result);
		System.out.println(result);
	}



}