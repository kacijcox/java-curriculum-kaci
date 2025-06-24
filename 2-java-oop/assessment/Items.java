import java.util.Map;
import java.util.LinkedHashMap;


public class Items {
	public static Map<String, Map<String, Object>> items = new LinkedHashMap<>();

	static {
		Map<String, Object> apples = new LinkedHashMap<>();
		apples.put("id", 1);
		apples.put("name", "apples");
		apples.put("price", 1.99);
		apples.put("stock", 15);
		items.put("apples", apples);

		Map<String, Object> milk = new LinkedHashMap<>();
		milk.put("id", 2);
		milk.put("name", "milk");
		milk.put("price", 3.49);
		milk.put("stock", 30);
		items.put("milk", milk);

		Map<String, Object> bread = new LinkedHashMap<>();
		bread.put("id", 3);
		bread.put("name", "bread");
		bread.put("price", 3.29);
		bread.put("stock", 15);
		items.put("bread", bread);

		Map<String, Object> eggs = new LinkedHashMap<>();
		eggs.put("id", 4);
		eggs.put("name", "eggs");
		eggs.put("price", 2.99);
		eggs.put("stock", 20);
		items.put("eggs", eggs);

		Map<String, Object> groundbeef = new LinkedHashMap<>();
		groundbeef.put("id", 5);
		groundbeef.put("name", "ground beef");
		groundbeef.put("price", 4.99);
		groundbeef.put("stock", 10);
		items.put("groundbeef", groundbeef);

		Map<String, Object> rice = new LinkedHashMap<>();
		rice.put("id", 6);
		rice.put("name", "rice");
		rice.put("price", 1.79);
		rice.put("stock", 20);
		items.put("rice", rice);

		Map<String, Object> orangejuice = new LinkedHashMap<>();
		orangejuice.put("id", 7);
		orangejuice.put("name", "orange juice");
		orangejuice.put("price", 2.59);
		orangejuice.put("stock", 10);
		items.put("orangejuice", orangejuice);

		Map<String, Object> cheddarcheese = new LinkedHashMap<>();
		cheddarcheese.put("id", 8);
		cheddarcheese.put("name", "cheddar cheese");
		cheddarcheese.put("price", 2.89);
		cheddarcheese.put("stock", 10);
		items.put("cheddarcheese", cheddarcheese);

		Map<String, Object> cereal = new LinkedHashMap<>();
		cereal.put("id", 9);
		cereal.put("name", "cereal");
		cereal.put("price", 3.79);
		cereal.put("stock", 30);
		items.put("cereal", cereal);

		Map<String, Object> broccoli = new LinkedHashMap<>();
		broccoli.put("id", 10);
		broccoli.put("name", "broccoli");
		broccoli.put("price", 1.59);
		broccoli.put("stock", 20);
		items.put("broccoli", broccoli);
	}

	public static void displayItems() {
		for (String key : Items.items.keySet()) {
			Map<String, Object> item = Items.items.get(key);
			System.out.println(("id: ") + item.get("id")
					+ (" | ")
					+ ("name: ") + item.get("name")
					+ (" | ")
					+ ("price: ") + item.get("price")
					+ (" | ")
					+ ("stock: ") + item.get("stock") + ("\n"));
		}
	}
}



