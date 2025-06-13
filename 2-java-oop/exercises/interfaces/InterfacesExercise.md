# 1. Create InterfaceExercise class
* This is where you will demonstrate the use of all the other objects and classes you create in this exercise
* Should have a public static void main()

## 2. Create PinService interface
* PinService should have an abstract method called getNewPin() that returns a String
* PinService should have an abstract method called checkPin() that returns a boolean

## 3. Create child of the Locker class called PersonalLocker
* PersonalLocker will implement PinService
* Its implementation of the getNewPin()
    * should prompt the user to generate a 4 digit PIN for accessing the locker
    * set the pin for the locker to the user's input
    * return a String stating that the PIN has been set
* Its implementation of checkPin()
    * should prompt the user to enter a 4 digit PIN
    * return true if it matches
    * reprompt them a total of 3 times before printing an error message and returning false

## 4. Create child of the Locker class called ValetLocker
* PersonalLocker will implement PinService
* Its implementation of getNewPin()
    * should generate a random 4 digit PIN
    * set the locker's pin to the generated pin
    * return a String that represents a receipt that can be given to a user with the lockerID and pin
* Its implementation of checkPin()
    * Should prompt the user to enter a 4 digit PIN and return true if it matches
    * It should return false if the user enters the wrong pin
    * If the user enters "OVERRIDE" it should return true

## 5. Create LockerManager class
* LockerManager should have the following encapsulated property:
    * ArrayList<Locker> lockers;
* Create a constructor that initializes lockers with 5 personalLockers and 5 valetLockers
* Create a method called rentLocker(String lockerID)
    * call the getNewPin() method on the locker with the id matching the lockerID parameter
    * print the return from getNewPin() and prompt the user to store an item (call setContents())
    * set isOccupied to true
* Create a method called emptyLocker(String lockerID)
    * call the checkPin() method on the locker with the id matching the lockerID parameter
    * if checkPin() returns true: print out the contents and set isOccupied to false

## 6. Instantiate and Use LockerManager in InterfaceExercise class
* demonstrate the use of rentLocker() and emptyLocker() on a personalLocker
* demonstrate the use of rentLocker() and emptyLocker() on a valetLocker
