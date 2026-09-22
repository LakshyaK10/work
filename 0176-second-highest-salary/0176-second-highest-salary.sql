# Write your MySQL query statement below
-- SELECT MAX(salary) AS SecondHighestSalary
-- FROM Employee
-- WHERE salary<(SELECT MAX(SALARY)
--             FROM Employee);


-- SELECT (
--     SELECT salary
--     FROM Employee
--     ORDER BY salary DESC
--     LIMIT 1
--     OFFSET 1
-- ) AS SecondHighestSalary;


SELECT (
    SELECT DISTINCT salary
    FROM (
        SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
        FROM Employee
    ) AS TempRank
    WHERE rnk=2
) AS SecondHighestSalary;


