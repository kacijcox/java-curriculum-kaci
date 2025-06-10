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
* Faculty Class should be a child/subclass of Faculty class
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
* * Create a toString()
* implement the getPay() method for Staff. It should be Pay Rate * Hours Worked

## 6. Create a Student class
Student Class should be a child/subclass of Person class
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




