USE SimpleSchool;

-- *** RE RUN THE simple-school-db.sql SEED DATA BEFORE STARTING ***

-- 1. Add a new subject to the database named "Comp. Science".
INSERT INTO `Subject`(SubjectName) VALUES ('Comp. Science');

-- 2. Modify the new subject's name to "Computer Science".
UPDATE `Subject` SET SubjectName = 'Computer Science' WHERE SubjectName = ('Comp. Science');
 
-- 3. Add the following courses to the database, all in the Computer Science subject:
--    * Java - 3 credit hours
--    * C# - 3 credit hours
--    * JavaScript - 3 credit hours
--    * Advanced Java - 3 credit hours

INSERT INTO Course (CourseName, CreditHours, SubjectID) VALUES -- i had issues, that is why the subjectID is 9 and not 6
("Java",3,9),
("C#",3,9),
("JavaScript",3,9),
("Advanced Java",3,9)
;

-- 4. Rename the course "Java". It's new name should be "Java 101".
UPDATE Course SET CourseName = 'Java 101' WHERE CourseName = 'Java';

-- 5. Rename the course "Advanced Java". It's new name should be "Java 201" and credit hours should be 4. Do this in one statement.
UPDATE Course SET CourseName = 'Java 201' WHERE CourseName = 'Advanced Java' AND CreditHours = 4;

-- 6. Delete the "Computer Science" subject. What error message did you get? Why?
SELECT * FROM `Subject`;
DELETE FROM `Subject` WHERE SubjectName = 'Computer Science';
-- i didn't get an error message

-- 7. Delete the "Java 101" course. Be sure to write a select statement first, to ensure you will affect only the intended record.
SELECT * FROM `Subject`;
DELETE FROM `Subject` WHERE SubjectName = 'Java 101';

-- 8. Delete the remaining "Computer Science" courses with one statement. Be sure to write a select statement first, to ensure you will affect only the intended records.
SELECT * FROM Course;
DELETE FROM Course WHERE CourseName = 'Computer Science';

SELECT * FROM `Subject`;
DELETE FROM `Subject` WHERE SubjectName = 'Computer Science';

-- 9. Delete the "Computer Science" subject. Be sure to write a select statement first, to ensure you will affect only the intended record.
SELECT * FROM `Subject`;
DELETE FROM `Subject` WHERE SubjectName = 'Computer Science';