select
    A.DEPT_ID,
    A.DEPT_NAME_EN,
    round(avg(SAL)) as AVG_SAL
from HR_DEPARTMENT as A
inner join HR_EMPLOYEES as B on A.DEPT_ID = B.DEPT_ID
group by A.DEPT_ID
order by AVG_SAL desc;