import java.util.HashMap;
import java.util.Map;

public abstract class ShoppingCart extends Items {

	public static Map<String, Integer> cartItems = new HashMap<>();

	public static void addItem(int selectedChoice) {
		String userInput = String.valueOf(selectedChoice);
		if (Items.items.containsKey(userInput)) {
			Map<String, Object> item = Items.items.get(userInput);
			String itemName = (String) item.get("name");
			if (cartItems.containsKey(itemName)) {
				int currentQuantity = cartItems.get(itemName);
				cartItems.put(itemName, currentQuantity + 1);
			} else {
				cartItems.put(itemName, 1);
			}
		}
	}

	public static void removeItem(int selectedChoice, int choice) {
		String userInput = String.valueOf(selectedChoice);
		if (Items.items.containsKey(userInput)) {
			Map<String, Object> item = Items.items.get(userInput);
			String itemName = item.get("name").toString();
			if (cartItems.containsKey(itemName)) {
				int quantity = cartItems.get(itemName);
				if (quantity > 1) {
					cartItems.put(itemName, quantity - 1);
				} else {
					cartItems.remove(itemName);
				}
			} else {
				System.out.println("item not found");
			}
		}
	}

	public static void displayCart() {
		for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
	}
}




