import java.util.HashMap;
import java.util.Map;

public abstract class ShoppingCart extends Items {

	public static Map<String, Integer> cartItems = new HashMap<>();

	public static int addItem(int selectedChoice) {
		for (Map.Entry<String, Map<String, Object>> entry : Items.items.entrySet()) {
			Map<String, Object> item = entry.getValue();
			int id = (int) item.get("id");
			if (id == selectedChoice) {
				String itemName = (String) item.get("name");
				if (cartItems.containsKey(itemName)) {
					int currentQuantity = cartItems.get(itemName);
					cartItems.put(itemName, currentQuantity + 1);
				} else {
					cartItems.put(itemName, 1);
				}
				return id;
			}
		}
		return selectedChoice;
	}

	public static void removeItem(int selectedChoice, int choice) {
		for (Map.Entry<String, Map<String, Object>> entry : Items.items.entrySet()) {
			Map<String, Object> item = entry.getValue();
			int id = (int) item.get("id");
			if (id == selectedChoice) {
				String itemName = (String) item.get("name");
				if (cartItems.containsKey(itemName)) {
					int quantity = cartItems.get(itemName);
					if (quantity > 1) {
						cartItems.put(itemName, quantity - 1);
					} else {
						cartItems.remove(itemName);
					}
				} else {
					System.out.println("item not found in cart");
				}
				return;
			}
		}
	}

	public static void displayCart() {
		for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue().toString());
			System.out.println("your current cart: " + ShoppingCart.cartItems.keySet());
			System.out.println("your total is: " + CheckOut.checkoutTotal());

		}
	}

	public static void clearCart() {
		Items.items.clear();
		cartItems.clear();
	}
}






