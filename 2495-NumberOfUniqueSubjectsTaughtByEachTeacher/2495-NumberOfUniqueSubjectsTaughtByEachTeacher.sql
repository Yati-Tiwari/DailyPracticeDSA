-- Last updated: 8/14/2025, 11:18:17 AM
# Write your MySQL query statement below
SELECT teacher_id,COUNT(distinct subject_id) AS cnt
FROM TEACHER
GROUP BY teacher_id;