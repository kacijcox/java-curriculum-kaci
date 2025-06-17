# OOP programming - general learning outcomes
## we want to organize our code in a way that our data and our behaviors are together

# objects/classes
* user the keyword new to be able to instansiate a object
* understand the classees are blueprints for objects
* you can create many objects from one class/blueprint
* staic propeties and methods belong to the class not instantiated objects built from the class

# encapsulation
* people using our classes/objects shouldn't have to know hhow they work to use them (black box programming)
* reduce the cognitive load when are breaking down problems and reading code
* communicating our intentions with code
  * access modifiers public/private/protected/default
  * protect future developers from interacting with code in packages they shouldn't (without good reason)

# inheritence
* be able to identify when there is an inheritance relationship (parent/child, superclass/subclass)
    * extends keyword
* override methods from parent classes, be able o explain why we might want to override a method 
* differentiate between an abstract class and a concrete class
    * know what an method is, 
    * absract classes can have abstract methods that must be implemented by a child for the child class to be intialized as an object
* understand how to implement polymorphic methods using inheritance 
    * different implementation of the same overridden method in child classes

# composition
* composition is the organization of how classes and objects are related
* know the difference between composition (has a relationship) and inheritance

# collections
* arraylist
    * know how to initialize 
    * know how to add/modify elements
    * know how to remove elements
    * using them in loops

* know what an abstract method is,
* abstract classes can abstract methods that must be implemented by a child class for the child
* Understand how to implement polymorphic methods using inheritance
* different implementations of the same overridden method in child classes

# Composition
* Composition is the organization of how Classes and Objects are related
* Know the difference between composition ("has-a" relationship) and inheritance ("is-a" relationship)

# Interfaces
* Define an interface
* Explain possible problems that interfaces solve
  * promotes loose coupling
  * makes your code flexible
  * makes code bases easier to maintain
  * allow you to swap out implementations
* Declare an interface
* Be able to implement an interface
  * "implements" keyword
* Know the difference between extending abstract classes / implementing an interface
  * you can only extend one class, you can implement multiple interfaces
  *  if you have state and behaviors that are shared then exctend, interfaces are behaviors only
  
# collections
* array list
  * know how to initialize
  * know how to add/modify elements
  * know how to remove elements
  * using them in loops
  
* ArrayList
  * mainstain insertion order
  * can be sorted
  * have an index to access elements
  * can grow to accomdate more elements
  * know when to use an arraylist
    * if you are needing to access elements from 
    * anytime you are wanting to sort elements
    * know when to use an ArrayList
    * Pros
      * if you are needing to access elements from the list based on an index
      * any time you're wanting to sort elements an array list has build in funcitonality for it
    * Cons
      * inserting new elements into a list are slower (the backing array must be copied to a larger array when adding)
      * searching through an array list is slow
    
* Stack
  * know push/pop
  * last in first out
  * know that java's method calls are stored on a stack
  
* Queue
  * know add/remove
  * first in first out
  * think of it as a line of poeple waiting to be processed or something similiar

* Set
  * do not maintain an insertion order
  * do not allow duplicate elements
  * transverse or loop through the elements
  * know when to use a set
  * Pros
    * fast insert
    * removing duplicates from other data structures
  * Cons
    * not sortable
    * don't try and treat them like a list
    
  * map
    * key value pairs
    * know what it is similiar to a dictionary in python
    * can't have duplicate keys (can have only one null key)
    * know when to use them
    * know how to loop/iterate through the keys/values/entry sets
    * 
  
