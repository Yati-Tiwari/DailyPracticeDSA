-- Last updated: 8/14/2025, 11:20:50 AM
# Write your MySQL query statement below
SELECT customer_id
FROM customer 
GROUP BY customer_id
having count(distinct product_key)=(select count(*) from product);
