package inheritance;

public class CheckingAccount extends BankAccount {


	public CheckingAccount(int accountNumber, int balance, double v) {
		super(accountNumber, balance);
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
		return balance;
	}

}

