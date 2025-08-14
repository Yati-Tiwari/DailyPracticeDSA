-- Last updated: 8/14/2025, 11:22:56 AM
SELECT x, y, z,
       CASE
           WHEN (x + y > z) AND (x + z > y) AND (y + z > x)
           THEN 'Yes'
           ELSE 'No'
       END AS triangle
FROM Triangle;
