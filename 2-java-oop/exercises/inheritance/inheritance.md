# Objects Exercise
## 1. Create a InheritanceExercise class
* This is where you will demonstrate the use of all the other objects and classes you create in this exercise
* Should have a public static void main()

## 2. Create a Person class
* Create properties for:
    * Name
    * Social Security Number
    * Location (example: "high school" or "middle school")
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a constructor for this class
* A Person doesn't have enough information to initialize. So make sure a Person object cannot be created.

## 3. Create a Faculty class
* Faculty Class should be a child/subclass of Person class
* Create properties for:
    * Pay Rate (How much they are paid per pay period)
    * Employee ID (some way to uniquely identify an employee)
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a constructor for this class
* A Faculty doesn't have enough information to initialize. So make sure a Faculty object cannot be created.
* Create an abstract method double getPay()

## 4. Create a Teacher class
* Teacher Class should be a child/subclass of Faculty class
* Create properties for:
    * Subject Taught (example: "Math", "Science", "History")
    * Years Employed (How much of a bonus to their pay based on how long they've been employed)
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a constructor for this class
* Create a toString()
* implement the getPay() method for a teacher. It should be Pay Rate + (Years Employed * $100)

## 5. Create a Staff class
* Staff Class should be a child/subclass of Faculty class
* Create properties for:
    * Hours Worked (Number of hours worked in pay period)
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a constructor for this class
* Create a toString()
* implement the getPay() method for Staff. It should be Pay Rate * Hours Worked

## 6. Create a Student class
* Student Class should be a child/subclass of Person class
* Create properties for:
    * Student Grade Level (1,2,3... Freshman, Junior, Senior)
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a toString()
* Create a constructor for this class

## 7. Initialize Your Classes in InheritanceExercise
* Create two Teachers and print their info using toString() methods
* Create two Staff employees and print their info using toString() methods
* Create two Students and print their info using toString() methods
* Call and print the result of the getPay() methods on all faculty

## 8. Create a BankAccount Class
* Create properties for:
  * Account Number 
  * Balance/Principal
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a constructor for this class
* Create a toString() (Account Number and Balance)
* Create abstract methods for:
  * double withdraw(Double withdrawAmount) 
  * void deposit(Double depositAmount)
  * double endOfYearBalanceEstimate()
  
## 9. Create a CheckingAccount Class
* CheckingAccount is a child/subclass of BankAccount
* Implement the Abstract methods from BankAccount:
  * void deposit(Double depositAmount)
    * Balance = Balance + depositAmount
  * double withdraw(Double withdrawAmount)
    * Balance = Balance - withdrawAmount
    * don't withdraw more than is available in the account
    * return the amount that is actually withdrawn
  * double endOfYearBalanceEstimate()
    * return Balance
    
## 10. Create a SavingsAccount Class
* SavingsAccount is a child/subclass of BankAccount
* Add the following properties:
  * Interest Rate
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a constructor for this class
* Create a toString() (Account Number, Balance, Interest Rate)
* Implement the Abstract methods from BankAccount:
    * void deposit(Double depositAmount)
        * Balance = Balance + depositAmount
    * double withdraw(Double withdrawAmount)
        * Balance = Balance - withdrawAmount
        * don't withdraw more than is available in the account
        * return the amount that is actually withdrawn
    * double endOfYearBalanceEstimate()  (use interest calculation that compounds 12 times for an end of year estimate)
        * return Balance * (( 1 + (Interest Rate / 12))¹²)  Hint: Math.pow() can help with getting an exponent

## 11.Create a MoneyMarketAccount Class
* MoneyMarketAccount is a child/subclass of SavingsAccount
* Add the following properties:
  * Withdraw Fee
  * Minium Balance
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a constructor for this class
* Create a toString() (Account Number, Balance, Interest Rate, Withdraw Fee, Minium Balance)
* Implement the Abstract methods from BankAccount:
    * void deposit(Double depositAmount)
        * Balance = Balance + depositAmount
    * double withdraw(Double withdrawAmount)
        * Balance = Balance - (WithdrawAmount + Withdraw Fee) 
        * don't withdraw more than the Minium Balance
        * return the amount that is actually withdrawn
  * double endOfYearBalanceEstimate()  (use interest calculation that compounds 12 times for an end of year estimate)
      * return Balance * (( 1 + (Interest Rate / 12))¹²)

## 12. Test Your Classes in InheritanceExercise
* Create A CheckingAccount and call the class' toString()
* Create A SavingsAccount and call the class' toString()
* Create A MoneyMarketAccount and call the class' toString()
* Demonstrate the endOfYearBalanceEstimate() for each type of account by printing out what it returns