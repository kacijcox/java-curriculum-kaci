# Summative Assessment: Shopping Cart
## Introduction
Shopping Inc. has hired you to code the prototype for their point of sale (POS) system. This product will be used specifically at regional stores to help ring up customers at the register.

The user of this product isn't the shopper, though. Instead, it's the casher behind the counter who will accept the customer's items and ring them up. Once a cart is started, it can not be emptied unless all items are removed. Shopping Inc. is super excited to see this prototype come to life as they are waiting to their one hundredth store.

## Requirements
Functional Requirements
* The user is presented with the main menu.
    * The user has the following options:
        * Display Cart
        * Remove an item
        * Add an item
        * Add a discount
        * Check out
        * Exit

### 1. Display Menu
* User shouldn't be given the option to remove an item if their cart is empty
* User shouldn't be able to check out an empty cart

### 2. Display Cart
* Print off the items that have been added to the cart
* Print off the current total

### 3. Add an item
* Print off the items that are in stock
* Allow the user to add items either one by one or multiple at a time (your choice)
* Don't allow the user to add more of an item than is in stock

### 4. Remove an item
* Print to console the list of items that have been added to the cart
* Allow the user to remove items either one by one or multiple at a time (your choice)

### 5. Add a Rewards Program Discount
* Prompt the user to enter or select a reward and apply the appropriate discount on checkout
* Only allow one discount at a time
* Consider using a interface for applying this discount
* discount interface that has a getDiscount(Some kind of list of items) that returns a double
* each implementation of discount has a different way of handling the discount

### 6. Checkout
* When the user checks out, print a receipt, empty the cart, and clear a discount 

### 7. Exit
* Print an exit message and end the program

## Deliverables and Considerations:
* Make sure to add a README.md containing pseudocode for all classes
* Create and add UML Diagram containing all classes to the root of the summative assessment directory 
* Be sure to work both Map and List elements into your design.
* Write at least one Interface and implement it.
* Each feature should be isolated into a separate method.
* Break up your project into GitHub Issues and never commit a non-functioning project to your repo


## Example Output:
### Menu
```
Main Menu
1. Display Cart
2. Add an Item
3. Remove an Item
4. Apply Discount
5. Checkout
6. Exit
```
### Display Cart
```
Cart:
------------------------------
ID  | Item            | Count
----|-----------------|-------
[1] | Bread           | 1
[2] | Milk            | 2
[3] | Apples (1 lb)   | 1
[4] | Cereal          | 1
------------------------------
                Total: $14.75
```
### Add an Item
```
Add an Item:
---------------------------------------
ID   | Item            | Price | Stock 
-----|-----------------|-------|-------
[1]  | Apples (1 lb)   | $1.99 | 15              
[2]  | Milk            | $3.49 | 20              
[3]  | Bread           | $2.29 | 15              
[4]  | Eggs            | $2.99 | 20              
[5]  | Ground Beef     | $4.99 | 10              
[6]  | Rice            | $1.79 | 20              
[7]  | Orange Juice    | $2.59 | 10              
[8]  | Cereal          | $3.79 | 30              
[9]  | Cheddar Cheese  | $2.89 | 10              
[10] | Broccoli (1 lb) | $1.59 | 20              
---------------------------------------
Enter ID of item to add:
>>> 6
Rice added to cart.
```
### Remove an Item
```
Remove an Item:
------------------------------
ID  | Item            | Count
----|-----------------|-------
[1] | Bread           | 1
[2] | Milk            | 2
[3] | Apples (1 lb)   | 1
[4] | Cereal          | 1
------------------------------
Enter ID of item to remove:
>>> 2
Milk removed from cart.
```

### Add a discount
```
Enter a discount code:
>>> GOLD
Gold Member Discount added, 15% off Total purchase.
```

### Checkout
```

1 Bread           $2.29
2 Milk            $6.98
1 Apples (1 lb)   $1.99
1 Cereal          $3.79
------------------------
           Discount: 10%
           Total: $13.28
           
      -Thank you-
```

# Example Data:
## Example Grocery Store Items
| Item            | Price | Inventory Count |
|-----------------|-------|-----------------|
| Apples (1 lb)   | $1.99 | 15              |
| Milk            | $3.49 | 20              |
| Bread           | $2.29 | 15              |
| Eggs            | $2.99 | 20              |
| Ground Beef     | $4.99 | 10              |
| Rice            | $1.79 | 20              |
| Orange Juice    | $2.59 | 10              |
| Cereal          | $3.79 | 30              |
| Cheddar Cheese  | $2.89 | 10              |
| Broccoli (1 lb) | $1.59 | 20              |

## Rewards for Loyalty Program: 
| Reward Code     | Discount                      |
|-----------------|-------------------------------|
| SILVER_MEMBER   | 10% off total                 |
| GOLD_MEMBER     | 15% off total                 |
| PLATINUM_MEMBER | Buy 2 get 1 free on all items |
