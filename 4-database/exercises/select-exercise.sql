-- Select Literal Values
-- 1. Write a SELECT query that prints the string: "All for one, and one for all!"
SELECT 'all for one and one for all!' AS prints;

-- 2. Write a SELECT query that uses the CONCAT function to combine "All for one," and " and one for all!"
SELECT CONCAT('all for one',' ','and one for all') AS concat_combine;

-- 3. Write a SELECT query that adds 6 and 6.
SELECT SUM(6)+(6) AS addition_result;

-- 4. Write a SELECT query that divides 5 by 2.
SELECT 5 / 2 AS division;

-- 5. Write a SELECT query that divides 5.0 by 2.0 and returns an int value. (2)
SELECT FLOOR (5.0 / 2.0) AS int_value;

-- 6. Write a SELECT query with 2 values - 6 divided by 4 and the remainder.  (1.5000, 2)
SELECT 6 / 4 AS division, 6 % 4 AS remainder;

-- 7. Write a SELECT query for 6 squared. (36)
SELECT POWER (6,2) AS squared_value;


-- 8. Write a SELECT query that Return a random number between 1 and 100
SELECT FLOOR(RAND() * 100) + 1 AS random_number;

-- Select Against Tables
-- 1. Select all the rows from the Building table.
SELECT * FROM Building;

-- 2. What are the period name, start, and end times?
SELECT PeriodName, StartTime, EndTime FROM Period;

-- 3. Which table is empty?
SELECT table_name AS empty_table FROM information_schema.tables WHERE table_schema = 'SimpleSchool' AND table_rows < 1;

-- 4. List all courses and credit hours in the format: CourseName (CreditHours)
SELECT CourseID as course_name, CreditHours as credit_hours FROM Course;

-- 5. What are the teachers' full names (first names and last initials) for the first five teachers?
SELECT FirstName AS first_name, LEFT(LastName,1) AS last_inital FROM Teacher LIMIT 5;

-- 6. How many rooms are there?
SELECT RoomID FROM Room;

-- 7. What are all of the valid BuildingIDs for a room?
SELECT COUNT(distinct(RoomID)) FROM Room; 

-- 8. How many unique SubjectIDs appear in the Course table?
SELECT COUNT(distinct(SubjectID)) FROM Course;

-- 9. How many grade types are there?
SELECT COUNT(distinct(GradeTypeID)) FROM GradeType;

-- 10. What are the IDs and Names of the grade types? (Hint: Name the columns appropriately in the ResultSet "ID" and "Name")
SELECT GradeTypeID AS grade_ID, GradeTypeName AS grade_name FROM GradeType;

-- 11. What grade types appear in the GradeItem table?
SELECT * FROM GradeItem;






