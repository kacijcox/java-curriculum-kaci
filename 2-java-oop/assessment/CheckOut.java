import java.util.Map;

public class CheckOut extends ShoppingCart {
	public static double total;
	public static DiscountInterface discount;


	public static double checkoutTotal() {
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

	public static void discountTotal() {
		double discountAmount = discount.calculateDiscount(CheckOut.checkoutTotal());
		double finalTotal = CheckOut.checkoutTotal() - discountAmount;
		System.out.println("your total before discount: " + CheckOut.checkoutTotal());
		System.out.println(discount.discountType() + " discount applied: -$ " + discountAmount +
				" and your total after discount is " + finalTotal);
	}
}
