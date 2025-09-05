# Write your MySQL query statement below
SELECT v.customer_id, count(*) as count_no_trans from Visits as v
left join Transactions as s
on s.visit_id=v.visit_id
where s.transaction_id is null
group by v.customer_id;