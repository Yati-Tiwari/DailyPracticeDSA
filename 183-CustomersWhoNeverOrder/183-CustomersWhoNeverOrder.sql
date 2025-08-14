-- Last updated: 8/14/2025, 11:25:30 AM
# Write your MySQL query statement below
select customers.name as customers from customers
left join orders
on customers.id=orders.customerId
where orders.id is null;

-- select name as customers 
-- from customers
-- where id not in(select customerid from orders);
