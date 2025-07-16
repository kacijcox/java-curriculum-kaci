USE bowls;
SELECT * FROM customer;
SELECT * FROM login;
SELECT * FROM item;
SELECT * FROM `order`;
SELECT * FROM order_item;
SELECT * FROM order_status;

-- know what a join is
-- know the difference betweeen inner and outer joins
-- know thw JOIN, ON, and USING keywords
-- have an alias for a table
-- be able to use LEFT, RIGHT joins

-- INNER join requires related rows to match
-- INNER join is implied we don't actually have to specificy an INNER join

SELECT * FROM customer
JOIN login ON customer.customer_id = login.customer_id;

SELECT c.customer_id, first_name, last_name, email_address 
FROM customer c
JOIN login l 
ON c.customer_id = l.customer_id;


SELECT * FROM customer
JOIN login ON customer.customer_id = login.customer_id;

-- USING keyword reducing typing if the columns you're joining have the same name
SELECT * FROM customer
JOIN login USING(customer_id);

-- joining more than two tables
-- customer name, item name, order date
SELECT * FROM customer
JOIN `order` o USING (customer_id)
JOIN order_item oi USING(order_id)
JOIN item i USING (item_id)
WHERE o.order_date LIKE "2020-07-28%";

-- OUTER join do not require related rows. There are 3 different types of OUTER join
-- LEFT I want everything from the first table in my join
-- RIGHT I want everything from the second table in my join
-- FULL I want everything from both tables

SELECT * 
FROM customer c -- the first table in the from clause is the LEFT table
LEFT JOIN login l USING(customer_id); -- the OUTER keyword can be omitted 

SELECT * 
FROM customer c -- the second table in the FROM clause after the JOIN is the RIGHT table
RIGHT JOIN login l USING(customer_id); -- the OUTER keyword can be omitted 

SELECT *
FROM login 
RIGHT JOIN customer c USING (customer_id)
WHERE email_address LIKE '%google%';

-- want all the customers that don't have a login so can send them an email to make an online order
SELECT * FROM c.email address
LEFT JOIN login l USING(customer_id)
WHERE l.customer_id IS NULL;

-- challenge: 
-- write a query to find customers that haven't made an order 
-- join customer table with order table 
-- 446 should return

SELECT * FROM customer c
LEFT JOIN `order` o USING(customer_id )
WHERE o.customer_id IS NULL;

SELECT * FROM customer c
LEFT JOIN `order` o USING(customer_id);

-- self join
SELECT child.name, parent.name AS parent_name
FROM order_status child ON child.parent_order_status_id = parent.order_status_id;

SELECT OrderID, OrderDate and Total FROM Server NAMES