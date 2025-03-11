select 
    sum(g.SCORE) as SCORE,
    g.EMP_NO,
    e.EMP_NAME,
    e.POSITION,
    e.EMAIL
from HR_EMPLOYEES as e
join HR_GRADE as g on e.EMP_NO = g.EMP_NO
where g.YEAR = '2022'
group by g.EMP_NO
order by SCORE desc
limit 1;