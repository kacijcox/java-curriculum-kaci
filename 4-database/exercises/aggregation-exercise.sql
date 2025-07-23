use simplebuisness;

-- Solve each task by writing a query below the task description.
-- Each task describes the expected result.

-- Example: 
-- Count the number of customers in Toronto
-- Expected: 14


-- How many employees have the last_name 'Soyle'?
-- Expected: 12
SELECT LastName, COUNT(LastName)
FROM Employee
WHERE LastName = "Soyle";

-- How many projects are there in the database?
-- Expected: 1121
SELECT ProjectID, COUNT(*)
FROM Project
GROUP BY ProjectID;

-- What's the earliest project start_date?
-- Expected: 2017-09-23
SELECT StartDate AS earliest_start_date, MIN(StartDate) AS earliest_start_date
FROM Project
GROUP BY StartDate
ORDER BY StartDate ASC
LIMIT 1;

-- What's the latest employee start_date?
-- Expected: 2020-08-25
SELECT StartDate, MAX(StartDate)
FROM Project
GROUP BY StartDate
ORDER BY StartDate DESC
LIMIT 1;

-- Count customers per city.
-- Expected: 88 Rows
SELECT City, COUNT(CustomerID) AS customer_count
FROM Customer
GROUP BY City
HAVING COUNT(CustomerID) > 0;

-- take city data and count how many customers equal the city data and list all the cities 
-- will need to join the customer ID and cities
-- customer ID per city
SELECT City, COUNT(CustomerID) AS customer_count
FROM Customer
GROUP BY City
HAVING COUNT(CustomerID) > 0;

-- Count customers per postal_code.
-- Expected: 84 Rows
SELECT PostalCode, COUNT(CustomerID) AS customer_count_postal_code
FROM Customer
GROUP BY PostalCode
HAVING COUNT(CustomerID) > 0;

-- Count employees per last_name.
-- Expected: 3(3)? Rows
SELECT COUNT(LastName)
FROM Employee;

-- Count the number of projects per city.
-- Expected: 88 Rows
SELECT City, COUNT(ProjectId) AS projects_per_city
FROM Project
JOIN Customer ON Customer.CustomerId = Project.CustomerId
GROUP BY City
HAVING COUNT(ProjectId) > 0;

-- Count the number of projects per city.
-- Sort by the count descending and select the top 10 rows.
-- Expected: 10 Rows
SELECT City, COUNT(ProjectId) AS projects_per_city
FROM Project
JOIN Customer ON Customer.CustomerId = Project.CustomerId
GROUP BY City
HAVING COUNT(ProjectId) > 0
ORDER BY projects_per_city DESC LIMIT 10;

-- Which postal_code has the most projects?
-- Expected: M3H
SELECT PostalCode, COUNT(ProjectId) AS max_postal_code
FROM Project
JOIN Customer ON Customer.CustomerId = Project.CustomerId
GROUP BY PostalCode
HAVING COUNT(ProjectId) > 0
ORDER BY max_postal_code DESC LIMIT 2;

-- Count the number of projects per start_date year.
-- Expected: 4 Rows
SELECT DATE_FORMAT(StartDate, '%Y') AS project_start_date, COUNT(ProjectId) AS number_of_projects
FROM Project
GROUP BY project_start_date
HAVING COUNT(ProjectId) > 0
ORDER BY number_of_projects DESC;

-- Count the number of employees per project in the M3H postal_code.
-- Group by project_id, sort by count descending.
-- Expected: 39 Rows
SELECT PostalCode as postal_code, COUNT(EmployeeId) AS employee_id, ProjectEmployee.ProjectId AS project_id
FROM ProjectEmployee
JOIN Project ON Project.ProjectId = ProjectEmployee.ProjectId
JOIN Customer ON Customer.CustomerId = Project.CustomerId
WHERE PostalCode = "M3H"
GROUP BY ProjectEmployee.ProjectId
HAVING COUNT(ProjectEmployee.ProjectId) > 0
ORDER BY employee_id DESC;

-- Calculate the total cost per project in the 'M3H' postal_code.
-- (Hint: sum a calculation)
-- Expected: 39 Rows
SELECT ProjectItem.ProjectID, ProjectItem.ItemId, PostalCode, (ProjectItem.Quantity * Item.PricePerUnit) AS Total
FROM ProjectItem
JOIN Project ON  Project.ProjectId = ProjectItem.ProjectId
JOIN Customer On Customer.CustomerId = Project.CustomerId
JOIN Item ON Item.ItemId = ProjectItem.ItemId
WHERE PostalCode = 'M3H'
GROUP BY ProjectItem.ProjectID, ProjectItem.ItemId, PostalCode, ProjectQuantity, PricePerUnit;

-- What's the most expensive project in the 'M3H' postal_code?
-- Expected: 18828.00
SELECT ProjectItem.ProjectID, PostalCode, SUM(ProjectItem.Quantity * Item.PricePerUnit) AS Total
FROM ProjectItem
JOIN Project ON  Project.ProjectId = ProjectItem.ProjectId
JOIN Customer On Customer.CustomerId = Project.CustomerId
JOIN Item ON Item.ItemId = ProjectItem.ItemId
WHERE PostalCode = 'M3H'
GROUP BY ProjectItem.ProjectID, PostalCode
ORDER BY Total DESC;

-- How many projects did each employee work on? 
-- Expected: 33 Rows
SELECT COUNT(ProjectEmployee.EmployeeId + ProjectEmployee.ProjectId) AS employee_total
FROM ProjectEmployee
GROUP BY ProjectEmployee.EmployeeId
ORDER BY employee_total ASC;

-- How many employees worked on more than 140 projects?
-- Expected: 10 Rows
SELECT COUNT(ProjectEmployee.EmployeeId + ProjectEmployee.ProjectId) AS employee_total
FROM ProjectEmployee
GROUP BY ProjectEmployee.EmployeeId
HAVING employee_total > 140
ORDER BY employee_total ASC;

-- How many projects cost more than $20,000?
-- Expected: 55 Rows
SELECT ProjectItem.ProjectID, PostalCode, SUM(ProjectItem.Quantity * Item.PricePerUnit) AS Total
FROM ProjectItem
JOIN Project ON  Project.ProjectId = ProjectItem.ProjectId
JOIN Customer On Customer.CustomerId = Project.CustomerId
JOIN Item ON Item.ItemId = ProjectItem.ItemId
GROUP BY ProjectItem.ProjectID, PostalCode
HAVING Total > 20000
ORDER BY Total DESC;


-- Across all projects, what are the total costs per item?
-- Select the item name and sum.
-- Sort by the sum desc;
-- Expected: 18 Rows
SELECT *
FROM project p 
JOIN projectItem pi USING(projectId)
JOIN item i USING(itemId)
GROUP BY ProjectId;


-- Across all projects, what are the total costs per item category?
-- Select the category name and sum.
-- Sort by the sum desc;
-- Expected: 7 Rows


-- What's the average 'Standard Labor' cost per city?
-- Expected: 88 Rows
SELECT c.city
FROM item i, AVG(pi.quantity * i pricePerUnit) AS standard_labor_cost
JOIN projectItem pi USING(itemId)
JOIN project p USING (projectId)
JOIN customer c USING (customerId)
WHERE i.name = "standard labor"
GROUP BY city;

-- you can create a named temp tables or derived table by passing a SELECT statement into the FROm clause
SELECT MAX(standard_labor_cost

FROM (
SELECT c.city
FROM item i, FORMAT(AVG(pi.quantity * i pricePerUnit),2) AS standard_labor_cost
JOIN projectItem pi USING(itemId)
JOIN project p USING (projectId)
JOIN customer c USING (customerId)
WHERE i.name = "standard labor"
GROUP BY city);



-- Challenge: Which customer has the first project of 2019?
-- (Requires a subquery.)
-- Expected: Starkie 2019-01-01
