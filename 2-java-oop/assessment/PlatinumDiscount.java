public class PlatinumDiscount implements DiscountInterface {
	@Override
	public double calculateDiscount(double total) {
		return total * .5;
	}

	@Override
	public String discountType() {
		return "platinum";
	}
}
