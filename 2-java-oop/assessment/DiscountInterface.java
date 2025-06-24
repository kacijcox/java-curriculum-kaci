public interface DiscountInterface {
	double calculateDiscount(double total);
	String discountType();

	public static void main(String[] args) {
		DiscountInterface silver = new SilverDiscount();
		DiscountInterface gold = new GoldDiscount();
		DiscountInterface platinum = new PlatinumDiscount();

		System.out.println(silver.discountType() + ": $" + silver.calculateDiscount(CheckOut.total));
		System.out.println(gold.discountType() + ": $" + gold.calculateDiscount(CheckOut.total));
		System.out.println(platinum.discountType() + ": $" + platinum.calculateDiscount(CheckOut.total));
	}
	}