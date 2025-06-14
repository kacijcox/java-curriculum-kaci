package inheritance;

public class MoneyMarketAccount extends SavingsAccount {
	double withdrawFee;
	double minimumBalance;

	public MoneyMarketAccount(int accountNumber, int balance, double interestRate) {
		super(accountNumber, balance, interestRate);
		this.withdrawFee = withdrawFee;
		this.minimumBalance = minimumBalance;
	}

	public double getWithdrawFee() {
		return withdrawFee;
	}

	public void setWithdrawFee(double withdrawFee) {
		this.withdrawFee = withdrawFee;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	@Override
	public void deposit(Double depositAmount) {
		balance = (int) (balance + depositAmount);
	}
	@Override
	public double withdraw(Double withdrawAmount) {
		if (withdrawAmount <= balance) {
			balance = (int) (balance - withdrawAmount);
			return withdrawAmount;
		}
		return 0;
	}
	@Override
	public double endOfYearBalanceEstimate() {
		return balance;
	}
	}
