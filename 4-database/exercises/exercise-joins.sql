use simplebuisness;

-- Solve each task by writing a query below the task description.
-- Each task describes the expected result.

-- Example: 
-- Select FirstName and LastName from Customer,
-- UserName from Login where rows from both tables are required.
-- Expected: 659 Rows


-- Select FirstName and LastName from Customer,
-- UserName from Login where rows from both tables are required.
-- Sort by UserName descending.
-- Expected: 659 Rows

SELECT FirstName, LastName, UserName 
FROM Customer 
INNER JOIN login ON Customer.CustomerId = login.CustomerId
ORDER BY UserName DESC;

-- Select FirstName and LastName from Customer,
-- UserName from Login where rows from both tables are required.
-- Only customers whose last name starts with 'W'.
-- Sort by UserName descending.
-- Expected: 24 Rows

SELECT FirstName, LastName, UserName
FROM Customer 
INNER JOIN login ON Customer.CustomerId = login.CustomerId
WHERE Customer.LastName = 'W%';

-- Join Item and Category. Select the item name and category name.
-- Expected: 19 Rows
SELECT Category.Name AS CategoryName, Item.Name AS ItemName 
FROM Category
INNER JOIN Item ON Category.CategoryId = Item.CategoryId;

-- Join item and category. Select the item name and category name.
-- Create an alias for each column: ItemName and CategoryName
-- Sort by the CategoryName, then ItemName.
-- Expected: 19 Rows

SELECT Category.Name AS CategoryName, Item.Name AS ItemName 
FROM Category
INNER JOIN Item ON Category.CategoryId = Item.CategoryId
ORDER BY CategoryName, ItemName;

-- Select Name and PricePerUnit from Item,
-- Name from Unit. Make rows from both tables required.
-- Add column aliases to avoid confusion from two `Name` columns.
-- Expected: 19 Rows

SELECT Item.Name AS ItemName, PricePerUnit FROM Item
INNER JOIN Unit ON Unit.Unitid = Item.Unitid;

-- Select all columns from Item, Category, and Unit.
-- Make all rows required.
-- Expected: 19 Rows

SELECT * FROM Item, Category
INNER JOIN Item ON Category.CategoryId = Item.CategoryId;

-- Select FirstName, LastName from Customer,
-- select Description from Project,
-- where the customer's LastName starts with 'B' or 'D'.
-- If a customer doesn't have a project, still include them.
-- (Hint: left outer join)
-- Expected: 228 Rows

-- Find all customers who do not have a project.
-- Expected: 195 Rows

-- Find all customers who do not have a login.
-- Expected: 341 Rows

-- Find all employees who are not assigned to a project.
-- Expected: 0 Rows

-- Select EmployeeId, FirstName, and LastName from Employee,
-- ProjectId and Description from Project
-- where the employee LastName equals `Gravel`.
-- Expected: 958 Rows

-- Which employees worked on a project for the customer
-- with last_name equal to 'Rao'?
-- Expected: Itch Gravel, Alang Durt, Ynez Durt, Ddene Soyle,
-- Mychal Soyle, Hugo Durt

-- Find employees and projects for projects starting in 2017.
-- Select ProjectId from Project and names from Employee.
-- Expected: 410 Rows

-- Create an "invoice" with line item totals (calculated field)
-- for items billed to projects for the customer with LastName 'Stelfox'.
-- Include the customer's names, ProjectId, item name, and calculated cost.
-- Expected:
-- Lanie Stelfox 481 Machine Labor     9720.000000
-- Lanie Stelfox 481 Standard Labor    3675.000000
-- Lanie Stelfox 481 Construction Sand 336.000000
-- Lanie Stelfox 481 Class 5 Gravel    624.000000
-- Lanie Stelfox 481 Wall Stone        3452.100000

-- Determine which customers employee Fleur Soyle worked for in
-- the 'M3H' postal_code. All customers in the postal_code should be included 
-- regardless of if they have a project or Fleur worked on it.
-- Though something should indicate if Fleur was on a M3H project.
-- Expected: 48 Rows, 3 projects that Fleur worked on.

SELECT c.FirstName, c.LastName FROM Customer
LEFT JOIN Project p USING (CustomerId)
LEFT JOIN ProjectEmployee pe ON p.projectId AND pe.employeeId  = (
SELECT EmployeeId
FROM Employee
WHERE FirstName = "Fleur" AND LastName = "Soyle")
WHERE PostalCode = "M3H";


-- Find customers without logins using a `right outer` join.
-- Expected: 341 Rows
SELECT * 
FROM login l
RIGHT JOIN customer c USING(CustomerId)
WHERE l.CustomerId = NULL;


-- List category with its parent category, but make the parent category
-- optional to include categories without a parent.
-- Expected: 8 Rows
SELECT 
	c.Name child_name,
    p.Name parent_name
FROM Category c
LEFT JOIN Category p ON c.ParentCategoryId = p.CategoryId;

-- Write an "everything" query:
-- CustomerId and names from customer
-- Description from Project
-- Quantity from ProjectItem
-- Name from Item
-- Name from Category
-- Name from Unit
-- for customers in the 'L3K' postal_code.
-- Expected: 39 Rows
SELECT
    c.customerId,
concat(c.firstName, " ", c.lastName) customer_name,
p.description,
pi.quantity,
i.name item_name,
ca.name category_name,
u.name unit_name
FROM customer c
JOIN project p USING(customerId)
JOIN projectItem pi USING(projectId)
JOIN item i USING(itemId)
JOIN category ca USING(categoryId)
JOIN unit u USING(unitId)
WHERE postalCode = "L3K";
                                    


