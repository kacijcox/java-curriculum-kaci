public class SilverDiscount implements DiscountInterface {
	float silverPercentage = .05F;

	@Override
	public double calculateDiscount(double total) {
		return total * silverPercentage;
	}
}
