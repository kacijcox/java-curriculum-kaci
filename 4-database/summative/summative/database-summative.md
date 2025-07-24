# Summative Assessment: Java Databases
### For this assessment you will be creating a REST API (representational state transfer) for the SimpleBistro database.


### 1. Create Java Models for the following tables
* item
    * join with item category
* item_category
* order
* order_item
    * join with item
* payment
    * join with payment_type
* payment_type
* server
    * join with order
* tax

### 2. Create JpaRepositories for
* item
* order
* order_item
* server

### 3. Create Controllers for the following endpoints:

| HTTP Method      | Endpoint                     | Description                                  |
|------------------|------------------------------|----------------------------------------------|
| ItemController   |                              |                                              |
| GET              | /items                       | get all items                                |
| GET              | /items/{id}                  | get an item by an id                         |
| GET              | /items?category={categoryId} | get all items by categoryId                  |
| PUT              | /items                       | update an existing item                      | 
| POST             | /items                       | add a new item                               |
| DELETE           | /items/{id}                  | remove an item                               |
| OrderController  |                              |                                              |
| GET              | /orders                      | get all orders                               |
| GET              | /orders/{id}                 | get an order by an id                        |
| GET              | /orders?server={serverId}    | get all orders by a serverId                 |
| PUT              | /orders                      | update an existing order                     |
| POST             | /orders                      | add a new order                              |
| DELETE           | /order/{id}                  | remove an order                              |
| ServerController |                              |                                              |
| GET              | /servers                     | get all servers                              | 
| GET              | /servers/{id}                | get a server by an id                        | 
| GET              | /servers/current             | get all servers that haven't been terminated | 
| PUT              | /servers                     | update an existing server                    | 
| POST             | /servers                     | add a new server                             |
| DELETE           | /servers/{id}                | remove a server                              |

    