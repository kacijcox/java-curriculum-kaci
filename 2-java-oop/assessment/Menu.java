//in this class i referenced my composition/list/adventure exercise for my menu/switches and
// imported the consoleUI from the consoleUI exercise
public class Menu {
	public static void main(String[] args) {
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
			}
		}
	}
}
