USE SimpleSchool;

-- 1. Write a `SELECT` query that gets the StudentID, LastName, and FirstName of all Students with a LastName that starts with `Cr`. (2 rows returned) 
SELECT StudentID, LastName, FirstName
FROM Student
WHERE LEFT (LastName,2) = 'CR';

-- 2. Write a `SELECT` query that gets all Courses with one of the following SubjectIDs: 1, 2, 4. Use the `OR` keyword. (14 rows returned) 
SELECT SubjectID 
FROM Course 
WHERE SubjectID = 1 OR SubjectID = 2 OR SubjectID = 4;

-- 4. Write a `SELECT` query that gets all Courses with one of the following SubjectIDs: 1, 2, 4. Use the `IN` keyword. (14 rows returned) 
SELECT SubjectID 
FROM Course 
WHERE SubjectID IN (1,2,4);

-- 5. Select all courses with more than 3.0 credit hours. (8 rows returned)
SELECT CreditHours FROM
Course WHERE CreditHours > 3;

-- 5. Write a `SELECT` query that gets the Student record with an id of 42. (1 row returned) 
SELECT StudentID FROM Student WHERE 
StudentID = 42;

-- 6. Write a `SELECT` query that gets the Student FirstNames that start with "C" using `LIKE`. (5 rows returned) 
SELECT FirstName FROM Student 
WHERE FirstName LIKE 'C%';

-- 7. Write a `SELECT` query that gets the Student FirstNames names that start with "Ce" using `BETWEEN`. (1 row returned) 
SELECT FirstName FROM Student
WHERE LEFT(FirstName,2) = 'Ce';

-- 8. Write a `SELECT` query that gets the first 10 unique Student LastNames. (10 rows returned) 
SELECT LastName FROM Student LIMIT 10;

-- 9. Write a `SELECT` query that returns the first 10 Student records. (10 rows returned) 
SELECT StudentID, FirstName, LastName, ClassYear FROM Student LIMIT 10;

-- 10. Write a `SELECT` query that returns the top five Students in reverse alphabetical order by LastName. (5 rows returned) 
SELECT LastName FROM Student
WHERE LastName BETWEEN 'A' AND 'Bz' 
ORDER BY LastName
LIMIT 5;

-- 11. Write a 'SELECT' statement that retrieves all periods that start after 10:00 AM. (5 rows returned) 
SELECT StartTime FROM Period
WHERE StartTime > '10:00:00';

-- 12. Write a 'SELECT' statment showing how all students ordered by their class year in ascending order. (50 rows returned) 
SELECT * FROM Student
ORDER BY ClassYear DESC;

-- 13. Write a 'SELECT' statment with a subquery in the 'WHERE' clause that returns the first and last names of teachers teaching a period 2 class (4 rows returned) 
SELECT FirstName, LastName FROM Teacher
WHERE TeacherID IN
 (SELECT TeacherID
    FROM Section
    WHERE PeriodID = 2);

-- 14.  Write a Write a 'SELECT' statment with a subquery in the 'WHERE' clause that returns all of the courses that are either a "Arts" or "Science" subjects (9 rows returned)
SELECT * 
FROM Tables WHERE SubjectName = 'Arts' OR 'Science';

-- 15. What is the average creditHours of all of the math Courses? (3.800000)

SELECT SubjectID, AVG(CreditHours) FROM Course
WHERE SubjectID = 2
GROUP BY SubjectID;

-- 16. Using the sectionroster table and a subquery, How many sections is the student "Deborah Lowing" in?  (8)
SELECT COUNT(*) FROM SectionRoster
WHERE StudentID = (
    SELECT StudentID
    FROM Student
    WHERE FirstName = 'Deborah' AND LastName = 'Lowing');

-- 17. What teachers are teaching a period between 13:00:00 and 13:45:00? (2 rows returned)

SELECT * FROM Teacher
WHERE TeacherID IN (
SELECT TeacherID FROM Section
WHERE PeriodID IN (
SELECT PeriodID FROM Period
WHERE StartTime = '13:00:00' AND EndTime = '13:45:00'));



