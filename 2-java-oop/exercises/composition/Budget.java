package composition;

import java.util.ArrayList;

public class Budget {
	private ArrayList<BudgetItem> income = new ArrayList<>();
	private ArrayList<BudgetItem> expenses = new ArrayList<>();

public void addIncome(BudgetItem income) {
	this.income.add(income);
}
public void addExpense(BudgetItem expenses) {
	this.expenses.add(expenses);
}
public void printBudgetSummary() {
	System.out.println("income: " + income);
	System.out.println("expenses: " + expenses);
}

	public BudgetItem[] getIncome() {
		return income.toArray(new BudgetItem[0]);
	}

	public BudgetItem[] getExpenses() {
	return expenses.toArray(new BudgetItem[0]);
	}
}
