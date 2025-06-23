//for this class i referenced the interface lesson

public interface CartInterface {
	static void addItem() {

	}

	void removeItem(int itemId, int quantity);
	double calculateTotal();
	boolean isEmpty();
	void clearCart();
}
