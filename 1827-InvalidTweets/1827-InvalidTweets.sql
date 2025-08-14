-- Last updated: 8/14/2025, 11:19:35 AM
# Write your MySQL query statement below
select tweet_id
from tweets
where(length(content)>15);