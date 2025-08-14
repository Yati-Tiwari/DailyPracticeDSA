-- Last updated: 8/14/2025, 11:25:28 AM
# Write your MySQL query statement below
SELECT email FROM person
GROUP BY email
HAVING COUNT(email)>1;
