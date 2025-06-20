public class GoldDiscount implements DiscountInterface {
	float goldPercentage = .10F;

	@Override
	public double calculateDiscount(double total) {
		return total * goldPercentage;
	}
}

