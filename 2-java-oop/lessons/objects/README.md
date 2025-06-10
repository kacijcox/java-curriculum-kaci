# Objects Exercise
## 1. Create a ObjectsExercise class
* This is where you will demonstrate the use of all the other objects and classes you create in this exercise
* Should have a public static void main() 
## 2. Create a Movie class
* Create properties for:
  * Title
  * Directed by
  * Box Office Return
  * Country
  * Running Time in minutes
* Ensure proper encapsulation of your class by having public getters/setters for all private properties 
* Create a constructor for films that have already come out with the following 5 parameters:
  * Title, Director, Box Office Return, Directed by, Running Time
* Create a constructor for films not yet released with the following 4 parameters:
  * Title, Director, Directed by, Running Time
* Create a toString() method that will print out all the information for a movie
* Initialize 3 Movies in ObjectsExercise using your Movie class
  * use the 5 parameter constructor for two movies that are already out and 
  * use the 4 parameter constructor for a movie that hasn't been released 
  * use the toString you created to print out all of the movies
### Sample Output:
```
Snow White and the Seven Dwarfs, United States 
Directed by: David Hand
Running Time: 83 minutes
Box Office: $418 million

Das Boot, Germany 
Directed By: Wolfgang Petersen
Running Time: 194 minutes
Box Office: $277 million

Dora and the Search for Sol Dorado, United States
Directed By: Alberto Belli
Running Time: 96 minutes
```
## 3. Create Locker class
* Create properties for:
  * lockerId (String): A unique identifier for the locker.
  * isOccupied (boolean): Indicates whether the locker is currently in use.
  * contents (String): Description of the contents in the locker.
  * lockerPin (String): 4 character String for a locker's pin
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a constructor for initializing a locker with a lockerId and a pin, and sets isOccupied to false and set the contents to an empty string
* Create a toString() that returns a string for displaying the locker's details
* Create methods for the following behaviors:
  * void storeItem(String item): Stores an item in the locker, sets isOccupied to true, and updates the contents.
  * void removeItem(): Empties the locker, sets isOccupied to false, and clears the contents.
* Initialize 3 Lockers in ObjectsExercise, and demonstrate the use of the constructor, storeItem(), retrieveItem(), and toString() methods
### Sample Output:
```
LockerID| A1 - CLOSED
Contents| Shoes
Pin     | 9988

LockerID| A2 - OPEN
Contents| 
Pin     | 

LockerID| A3 - CLOSED
Contents| Jacket
Pin     | 7117
```

## 4. Create a useful ConsoleUI class
* Create a class that contains methods that you can use to prompt the user and parse their inputs
* Making the methods static allows you to call them without instantiating an object
* Examples of methods:
  * String getString(String prompt) - Prompts the user for input and returns the string entered
  * int getInt(String prompt) - Prompts the user for input and returns an int
  * double getDouble(String prompt) - Prompts the user for input and returns a double 
  * boolean getBoolean(String prompt) - Prompts the user for a Yes/No or some kind of binary option and returns true for one option and false for the other
* possible overloaded methods could be
  * int getInt(String prompt, min , max) - designate the range you want the user to be able to enter
  * double getDouble(String prompt, int rounding) - allow the user to designate the number of decimal places to return
* Make sure you make the methods as useful as possible. 
  * Try/Catch any parsing errors
  * Re-prompt on invalid input
