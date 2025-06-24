public class SilverDiscount implements DiscountInterface {

	@Override
	public double calculateDiscount(double total) {
		return total * .05;
	}

	@Override
	public String discountType() {
		return "silver";
	}
}