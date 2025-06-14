package inheritance;

public abstract class SavingsAccount extends BankAccount{
	double interestRate;

	public SavingsAccount(int accountNumber, int balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double withdraw(Double withdrawAmount, Object depositAmount) {
		if (withdrawAmount <= balance) {
			balance = (int) (balance - withdrawAmount);
			return withdrawAmount;
		}
		return 0;
	}


	@Override
	public void deposit(Double depositAmount) {
		balance = (int) (balance + depositAmount);
	}

	@Override
	public double endOfYearBalanceEstimate() {
		return balance * Math.pow((1 + (interestRate / 12)), 12);
	}

	@Override
	public String toString() {
		return "SavingsAccount{" +
				"interestRate=" + interestRate +
				", accountNumber=" + accountNumber +
				", balance=" + balance +
				'}';
	}

	public abstract double withdraw(Double withdrawAmount);
}
