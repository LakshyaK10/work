# Write your MySQL query statement below
SELECT s.score , COUNT(s1.score) as 'rank' 
FROM SCORES s, (SELECT DISTINCT score FROM SCORES) s1
WHERE s.score<=s1.score
GROUP BY s.id
ORDER BY s.score DESC;