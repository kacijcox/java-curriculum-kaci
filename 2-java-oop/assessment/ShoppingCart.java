import java.util.HashMap;
import java.util.Map;

public abstract class ShoppingCart extends Items implements CartInterface {

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
		} else {
			System.out.println("item not found");
		}
	}
	public static void removeItem(int selectedChoice) {
		System.out.println("select an item to remove");
		Items.displayItems();
		String userInput = String.valueOf(selectedChoice);
		if (Items.items.containsKey(userInput)) {
			Map<String, Object> item = Items.items.get(userInput);
			String itemName = (String) item.get("name");
			if (cartItems.containsKey(itemName)) {
				int currentQuantity = cartItems.get(itemName);
				cartItems.put(itemName, currentQuantity + -1);
			} else {
				System.out.println("item not found");
			}
		}
	}
}


