package composition;

public class Payment {
	private double amount;
	private boolean isPaid;

	public Payment(double amount, boolean isPaid) {
		this.amount = amount;
		this.isPaid = isPaid;
	}

	public double getAmount() {
		return amount;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean paid) {
		isPaid = paid;
	}
}