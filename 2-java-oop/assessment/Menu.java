import objects.ConsoleUI;

//in this class i referenced my composition/list/adventure exercise for my menu/switches and
// imported the consoleUI from the consoleUI exercise
public class Menu {
	private static DiscountInterface discount;
	public static void main(String[] args) {
		String selectedDiscount = "";

		while (true) {
			System.out.println("~~~welcome to food store~~~\n");
			System.out.println("1. display cart \n");
			System.out.println("2. remove item \n");
			System.out.println("3. add item \n");
			System.out.println("4. add discount \n");
			System.out.println("5. checkout \n");
			System.out.println("6. exit \n");

			int selectedChoice = objects.ConsoleUI.getInt("enter selection: \n");
			switch (selectedChoice) {
				case 1:
					System.out.println("items in your cart: \n");
					ShoppingCart.displayCart();
					break;
				case 2:
					int itemID = objects.ConsoleUI.getInt("enter id to remove: ");
					ShoppingCart.removeItem(itemID, selectedChoice);
					System.out.println("cart updated");
					System.out.println(ShoppingCart.cartItems.keySet());
					break;
				case 3:
					System.out.println("available items");
					Items.displayItems();
					itemID = objects.ConsoleUI.getInt("enter id to add to cart ");
					ShoppingCart.addItem(itemID);
					System.out.println("confirmed \n");
					System.out.println(ShoppingCart.cartItems.keySet());
					break;
				case 4:
					System.out.println("add a discount");
					selectedDiscount = ConsoleUI.getString("select a discount: ");
					if (selectedDiscount.equals("silver discount")) {
						System.out.println("you selected the silver discount \n");
						break;
					}
					if (selectedDiscount.equals("gold discount")) {
						System.out.println("you selected the gold discount \n");
						break;
					}
					if (selectedDiscount.equals("platinum discount")) {
						System.out.println("you selected the platinum discount \n");
						break;
					}
				case 5:
					CheckOut.checkoutTotal(); // This sets CheckOut.total
					DiscountInterface discount = null;
					switch (selectedDiscount.toLowerCase()) {
						case "silver discount":
							discount = new SilverDiscount();
							System.out.println(CheckOut.checkoutTotal());
							break;
						case "gold discount":
							discount = new GoldDiscount();
							break;
						case "platinum discount":
							discount = new PlatinumDiscount();
							break;
					}
					if (discount == null) {
						System.out.println(" " + CheckOut.checkoutTotal());
					}
					else {
						double discountAmount = discount.calculateDiscount(CheckOut.checkoutTotal());
						double finalTotal = CheckOut.checkoutTotal() - discountAmount;
						System.out.println("your total before discount: " + CheckOut.checkoutTotal());
						System.out.println(discount.discountType() + " discount applied: -$" + discountAmount);
						System.out.println("Total after discount: $" + finalTotal);
					}
					break;
			}
		}
	}
}

