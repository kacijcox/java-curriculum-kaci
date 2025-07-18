USE bowls;

-- Know what it means aggregate
-- Be able to use aggregation functions COUNT(), MIN(), MAX(), AVG()
-- collect values from a result set using GROUP BY clause
-- filter aggregate functions using the HAVING clause

-- GROUP BY clause allows us to group the prices of items so that we can use them in aggregate functions
SELECT price, COUNT(price)
FROM item
GROUP BY price;

-- JOIN the customer table with the order table and use the GROUP BY and COUNT() to calculate how many orders each customer has
SELECT c.first_name, c.last_name, COUNT(c.customer_id)
FROM customer c
JOIN `order` o USING(customer_id)
GROUP BY c.customer_id;

SELECT order_id, COUNT(order_id), SUM(oi.quantity *  i.price)
FROM `order` o
JOIN order_item oi USING(order_id)
JOIN item i USING(item_id)
GROUP BY order_id
HAVING count(o.order_id) > 5;


SELECT order_id, COUNT(order_id), SUM(oi.quantity *  i.price) total_order_cost
FROM `order` o
JOIN order_item oi USING(order_id)
JOIN item i USING(item_id)
GROUP BY order_id
HAVING total_order_cost > 50
ORDER BY total_order_cost DESC
limit 1;


-- the sum of all orders by day
SELECT DAY(order_date) as order_day, SUM(oi.quantity *  i.price) as daily_total
FROM `order` o
JOIN order_item oi USING(order_id)
JOIN item i USING(item_id)
JOIN order_status os USING(order_status_id)
WHERE os.name = "Paid and closed"
GROUP BY order_day
HAVING daily_total > 2000
ORDER BY daily_total DESC
LIMIT 3;

-- ordering your queries
--
-- SELECT		names of columns we want in our result set
-- FROM/JOIN	tables we want to be pulling data from
-- WHERE		filtering the individual results
-- GROUP BY		combining results groupings
-- HAVING		filtering groupings
-- ORDER BY		sort by columns or aggregate functions defined in select
-- LIMIT/OFFSET	change the amount returned in the result set


select count(*)
from `order`
WHERE order_status_id != 10;
