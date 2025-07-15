use SimpleSchool;
SELECT * FROM Teacher;

-- using WHERE clause in a sql query
-- working with NULL values in queries
-- AND OR LIKE IN BETWEEN keywords
-- ORDER BY clause
-- using subqueries in WHERE clause

-- order of execution of sql queries
-- FROM/JOIN
-- WHERE
-- GROUP BY
-- HAVING
-- SELECT
-- ORDER BY
-- LIMIT/OFFSET 

-- -- -- -- SELECT/WHERE -- -- -- -- 
-- WHERE clause operators =, >, <, >=, <=, !=
SELECT *
FROM Student
WHERE ClassYear = 2025; 

-- searching for NULL values with IS and IS NOT
SELECT * 
FROM Room
WHERE description IS NOT NULL;

-- filter  on multiple boolean operations with OR/AND
SELECT FirstName, LastName, ClassYear
FROM Student
WHERE ClassYear = 2023 OR ClassYear = 2026;

SELECT FirstName, LastName, ClassYear
FROM Student
WHERE ClassYear = 2023 AND FirstName = 'Dorrie';

-- using wild card character '%' or '_'with LIKE keyword to filter substrings
SELECT *
FROM student
WHERE firstname LIKE 'M%';

SELECT *
FROM student
WHERE firstname LIKE 'M%i';

SELECT *
FROM student
WHERE firstname LIKE 'M__li';

SELECT *
FROM student
WHERE firstname NOT LIKE 'M%';

SELECT *
FROM student
WHERE firstname LIKE 'Fle%t__';

SELECT *
FROM Student
WHERE FirstName NOT LIKE 'M__li';

SELECT *
FROM Student
WHERE ClassYear IN (2022,2024,2026);

SELECT * FROM GradeItem;
SELECT * FROM GradeType;
SELECT * FROM Section;
-- use the IN keyword with subquery that returns a single column as a list
SELECT *
FROM student
WHERE classyear IN (2022, 2024, 2026, 2028); -- can embed SELECT inside brackets (aka subquery)

SELECT * FROM gradeitem;
SELECT * FROM gradetype;
SELECT * FROM semester;
-- use the IN keyword with a subquery that returns a single column as list
SELECT *
FROM gradetype
WHERE gradetypeid IN (
	SELECT gradetypeid
    FROM gradeitem
);

-- link teacher to section to course...to find all teachers teaching english
SELECT *
FROM student
WHERE classyear IN (2022, 2024, 2026, 2028); -- can embed SELECT inside brackets (aka subquery)

SELECT * FROM gradeitem;
SELECT * FROM gradetype;
SELECT * FROM semester;
-- use the IN keyword with a subquery that returns a single column as list
SELECT *
FROM gradetype
WHERE gradetypeid IN (
	SELECT gradetypeid
    FROM gradeitem
);

-- link teacher to section to course...to find all teachers teaching english
SELECT *
FROM course
WHERE coursename LIKE '%English%';

-- using BETWEEN to filter a range, must use AND to separate values of range
SELECT *
FROM student
WHERE classyear BETWEEN 2024 AND 2027;

SELECT *
FROM student
WHERE firstname BETWEEN 'Cecily' AND 'Sheila';

SELECT *
FROM room
WHERE roomnumber BETWEEN 100 AND 200;

SELECT *
FROM semester
WHERE startdate BETWEEN '2022-01-01' AND '2023-01-01';

-- ORDER BY allows us to order records by the values of a column, ASC, DESC
SELECT *
FROM student
ORDER BY classyear DESC;

SELECT *
FROM student
ORDER BY classyear ASC;

SELECT *
FROM student
ORDER BY classyear;

SELECT *
FROM student
ORDER BY classyear ASC, lastname DESC;

SELECT *
FROM student
WHERE classyear BETWEEN 2024 AND 2027
ORDER BY classyear ASC, lastname DESC
LIMIT 10;

SELECT studentid
FROM student
WHERE classyear BETWEEN 2024 AND 2027
ORDER BY classyear ASC, lastname DESC
LIMIT 10;

-- OFFSET similar to LIMIT it allows us to skip/paginate a number of records
SELECT *
FROM student
WHERE classyear BETWEEN 2024 AND 2027
ORDER BY classyear ASC, lastname DESC, firstname DESC
LIMIT 15 OFFSET 15;
