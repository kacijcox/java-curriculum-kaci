-- ACID is an acronym for:
-- Atomic - all portions of a transaction succeed or the entire transaction fails
-- Consistency - changes to the database always leave it in a valid state, allows for eventual consistency between related databases
-- Isolation - a database is able to manage concurrent users and transactions
-- Durable - when a transaction is successful, it is safely stored and can be recovered or rolled back

-- SQL Structured Query Language - it has himan reable way to communicate with a database
-- Schema - collection of all data and functionality for a group of tables
-- USE keyword lets use define what Schedma we are wanting to use for thisd sql file/script

USE SimpleSchool;

-- SELECT keyword/statement reading data from a database
-- simple math with SELECT statements

SELECT 1 + 1;
SELECT 2-1, 10/3; -- multiple math statements in one SELECT seperated by ','
SELECT FLOOR(10/3); -- use FLOOR() to get a rounded down int from a decimal
SELECT 10 % 3;	-- mod % to get the remainder from division
SELECT EXP(1); -- constant e, used for interest/compounding/logs

-- CEILING(4.5), SQRT(49), POW(9,3)
SELECT RAND(); -- generate a random decimal between 0-1

-- SELECT functions for working with String
SELECT CONCAT('FIRST', 'SECOND'); -- combine strings with the CONCAT() function
SELECT 'FIRST' + 'LAST'; -- you can't use the plus operator to concatenate strings

SELECT 'Hello world'; -- printing from SELECT

-- SELECT with data from tables
-- SELECT - get/read data from the table specified
-- * shortcut for getting all columns in table in result set
-- FROM - what table or tables are we selecting from
-- teacher - the name of the table we are querying`
SELECT * FROM Teacher;

SELECT FirstName, LastName FROM Teacher;

-- functions for reducing data to a single result
SELECT COUNT(*) AS number_of_teachers FROM Teacher;
SELECT SUM(CreditHours) FROM Course;
SELECT * FROM Course;

SELECT AVG(PointsPossible) FROM GradeItem;
SELECT * FROM GradeItem;

SELECT * FROM Student;
SELECT DISTINCT(ClassYear) FROM Student;
SELECT COUNT(distinct(ClassYear)) FROM Student;
SELECT Min(RoomNumber) as Lowest, MAX(RoomNumber) as Max FROM Room;
SELECT * FROM Teacher LIMIT 7;





