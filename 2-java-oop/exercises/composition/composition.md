# Composition Exercise
# 1. Create a CompositionExercise Class
* This is where you will demonstrate the use of all the other objects and classes you create in this exercise
* Should have a public static void main()
# 2. Create a BudgetItem Class
* BudgetItem should have the following encapsulated properties: 
  * String description - name of this BudgetItem
  * double amount      - dollar amount of this BudgetItem (always positive)
  * int repeatCount    - how many times in a year will this BudgetItem occur
* create a constructor for initializing a BudgetItem object
* a toString() method to print out the relevant information
# 3. Create a Budget Class
* Budget should have the following encapsulated properties:
  * ArrayList<BudgetItem> income;
  * ArrayList<BudgetItem> expenses;
* Budget should have methods for the following behaviors:
  * void addIncome(BudgetItem income)   - add an income to income ArrayList
  * void addExpense(BudgetItem expense) - add an expense to expenses ArrayList
  * void printBudgetSummary()           - print all BudgetItems and an end of year summary for all income/expenses
# 4. Implement a Console Interface to work with a budget
* Initialize a Budget object in the main() of CompositionExercise
* Using your ConsoleUI utility class implement the following menu options in CompositionExercise
1. Add Income - Prompt the user for all the information needed to initialize an income budget item and add it to your Budget object
2. Add Expense - Prompt the user for all the information needed to initialize an expense budget item and add it to your Budget object
3. Print Budget - Use the printBudgetSummary() method in the budget object to print off what the user has entered
### Sample Output:
```
--Budget Tracker--

1. Add Income
2. Add Expense
3. Print Budget
>>> 1
Enter name of income:
>>> Job
Enter amount of income:
>>> 1500
Enter number of times this will reoccur in a year:
>>> 24
New Income Added

1. Add Income
2. Add Expense
3. Print Budget
>>> 2
Enter name of expense:
>>> Rent
Enter amount of income:
>>> 1200
Enter number of times this will reoccur in a year:
>>> 12
New Expense Added

1. Add Income
2. Add Expense
3. Print Budget
>>> 2
Enter name of expense:
>>> Internet
Enter amount of income:
>>> 120
Enter number of times this will reoccur in a year:
>>> 12
New Expense Added

1. Add Income
2. Add Expense
3. Print Budget
>>> 3
-- Budget --
Income:     $36000.00
Job         | $1500 | 24

Expenses:   $15840.00
Rent        | $1200 | 12
Internet    | $120  | 12

Total:      $20160.00
```
