package composition;

import java.util.Scanner;

import objects.ConsoleUI;

public class CompositionExercise {
	private static Scanner scanner = new Scanner(System.in);

	public static String getString(String prompt) {
		System.out.print(prompt);
		return scanner.nextLine();
	}

	public static void main(String[] args) {

		Budget budgetObject = new Budget();

		while (true) {
			System.out.println("---budget menu");
			System.out.println("1. add income");
			System.out.println("2. add expense");
			System.out.println("3. print budget");
			System.out.println("4. exit");

			int choice = objects.ConsoleUI.getInt("enter selection: \n");
			switch (choice) {
				case 1:
					double income = ConsoleUI.getDouble("enter income: ");
					BudgetItem incomeItem = new BudgetItem(income);
					budgetObject.addIncome(incomeItem);
					System.out.println("enter description");
					String description = String.valueOf(ConsoleUI.getString("description: "));
					incomeItem.setDescription(description);
					System.out.println("enter how many times will occur annually :");
					int repeatCount = ConsoleUI.getInt("repeats: ");
					incomeItem.setRepeatCount(repeatCount);
					break;
				case 2:
					double expense = ConsoleUI.getDouble("enter expense: ");
					BudgetItem expenseItem = new BudgetItem(expense);
					budgetObject.addExpense(expenseItem);
					System.out.println("enter description: ");
					description = String.valueOf(ConsoleUI.getString("description: "));
					expenseItem.setDescription(description);
					System.out.println("enter how many times will occur annually :");
					repeatCount = ConsoleUI.getInt("repeats: ");
					expenseItem.setRepeatCount(repeatCount);
					break;
				case 3:
					budgetObject.printBudgetSummary();
					double totalIncome = 0;
					for (BudgetItem item : budgetObject.getIncome()) {
						totalIncome += item.getAmount() * item.getRepeatCount();
					}
					for (BudgetItem item : budgetObject.getExpenses()) {
						totalIncome -= item.getAmount() * item.getRepeatCount();
					}
					System.out.println("net income: " + totalIncome);
					break;

				case 4:
					System.out.println("adios");
					return;
				default:
					System.out.println("invalid selection");
					break;
			}
		}


	}
}
