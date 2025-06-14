package inheritance;

public abstract class BankAccount {
	int accountNumber;
	int balance;

	public BankAccount(int accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public abstract double withdraw(Double withdrawAmount, Object depositAmount);

	public abstract void deposit(Double depositAmount);

	public abstract double endOfYearBalanceEstimate();


	@Override
	public String toString() {
		return "BankAccount{" +
				"accountNumber=" + accountNumber +
				", balance=" + balance +
				'}';
	}
}
