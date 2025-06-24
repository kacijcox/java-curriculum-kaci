public class GoldDiscount implements DiscountInterface {
	@Override
	public double calculateDiscount(double total) {
		return total * .15;
	}

	@Override
	public String discountType() {
		return "gold";
	}
}



