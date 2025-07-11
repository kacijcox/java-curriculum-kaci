### Move menu/options into it’s own class
* MenuUserInput Class
    * User Input Methods
* MenuOption Class
  * Menu options

### Correct usage of public, static, and private methods and properties
### Add expiration date function
* give warning if product expires in >5 days

### Exception handling package
* class inputValidator
  ** validateproductID
  ** validateProductName
    * validateProductQuantity 
    * example usage: inputvalidator.validateproductID(product.getProductID());


### Additional features
  * Search by ID, type, and name
  * Total inventory value
  * Save to persistant file

### Move formatting from Inventory Repository into toStrings

### Create Helpers

### Call Main method
### Pagnation
### Implement more Lambdas
### Win pattern matching

### Advanced features
  * Admin login
  * User login
    * Tracks user activity

### GUI React.js
  * CORS
  * Create React folder
  * Run npx create-react-app JavaConsoleApp-Front-End
  * Components
    * Login.jsx
    * Menu.jsx //implement component composition
      * Inventory.jsx
      * AddProduct.jsx
        * ProductID.jsx
        * ProductName.jsx
        * ProductQuantity.jsx
        * ProductPrice.jsx
        * IsPerishable.jsx
      * DeleteProduct.jsx
      * UpdateProduct.jsx
      * SaveProduct.jsx
      * LoadProduct.jsx
      * Search.jsx
  * App.jsx  
    *  Display Main Menu
      * {<Menu />}
        * {<AddProduct />}
          * {<ProductID />}
          * {<ProductName />}
          * {<ProductQuantity />}
          * {<ProductPrice />}
          * {<IsPerishable />}
        * {<DeleteProduct />}
          * {<ProductID />}
      * {<Login />}
      * //TBC

    