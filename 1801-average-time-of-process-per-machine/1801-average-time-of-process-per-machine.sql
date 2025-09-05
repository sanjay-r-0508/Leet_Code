# Write your MySQL query statement below
select machine_id, 
    round(avg(endTime-startTime),3) as processing_time
from
(select 
    machine_id, 
    process_id, 
    MAX(case when activity_type='start' then timestamp end) as startTime,
    MAX(case when activity_type='end' then timestamp end) as endTime

from activity
group by machine_id, process_id) as ProcessTimes
group by machine_id;
