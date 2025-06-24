import java.util.Map;

public class CheckOut extends ShoppingCart {
	public static double total;

	public static double checkoutTotal(){
		total = 0;
		for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
			String itemName = entry.getKey();
			int quantity = entry.getValue();
			Map<String, Object> item = Items.items.get(itemName);
			if (item == null) {
				continue;
			}
			double price = (double) item.get("price");
			total += price * quantity;
		}
		return total;
	}
}
