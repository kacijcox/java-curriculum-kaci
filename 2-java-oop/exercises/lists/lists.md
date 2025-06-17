# 1. Create ListExercise class
* This is where you will demonstrate the use of all the other objects and classes you create in this exercise
* Should have a public static void main()

# 2. Add a MenuItem class
* Create properties for:
    * int itemNumber
    * String itemName
    * int orderNumber
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create any constructors or other methods that you feel would help you.

# 3. Add an Action class
* Create properties for:
    * MenuItem menuItem - the MenuItem that this action is for
    * boolean addToOrder - true if the action was to add to an order and false if it was to remove from an order
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create a constructor that takes a MenuItem menuItem and a boolean addToOrder

# 4. Create a OrderManager class
* Create properties for:
    * int currentOrderNumber
    * ArrayList<MenuItem> currentOrder
    * Stack<Action> undoActions
    * Stack<Action> redoActions
    * Queue<MenuItem> kitchenQueue
* Ensure proper encapsulation of your class by having public getters/setters for all private properties
* Create any constructors or other methods that you feel would help you.
* Add the following methods to OrderManager:
    * void addToOrder(MenuItem menuItem) - adds a menu item to the currentOrder
        * add the menuItem passed as a parameter to the currentOrder Arraylist
        * add a new Action to the undoActions Stack (Hint: undoActions.push(new Action(menuItem, true))
    * void removeFromOrder(MenuItem menuItem)
        * remove a single menuItem from the currentOrder
        * add a new Action to the undoActions Stack (Hint: undoActions.push(new Action(menuItem, false))
    * void undo() - reverts the last action in the undoActions Stack
    * void redo() - reverts the last action in the redoActions Stack
    * void confirmOrder() - sends the entire order to the kitchen queue and clears the current order
        * add the items in the currentOrder to the kitchenQueue
        * clear the undoActions Stack
        * clear the redoActions Stack
        * clear the currentOrder ArrayList
        * increment the currentOrderNumber
# 5. Implement an OrderManager in the ListExercise class to create a menu for servers to use
* Create a menu to print off 4 menu items
* Create a UI that allows the user to add items, remove items, undo an action, redo an action, and confirm an order

## Sample Output
```
_________________________
ORDER# 0
_________________________
[A]DD ITEM TO ORDER
[D]ELETE ITEM FROM ORDER
[U]NDO
[R]EDO
[C]ONFIRM ORDER
>>> A
_________________________
[1] Burger  [2] Fries
[3] Coke    [4] Shake
_________________________
>>> 1
_________________________
ORDER# 0
Burger
_________________________
[A]DD ITEM TO ORDER
[D]ELETE ITEM FROM ORDER
[U]NDO
[R]EDO
[C]ONFIRM ORDER
>>> 

```
