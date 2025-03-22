select a.ANIMAL_ID, a.NAME
from ANIMAL_INS as a
left join ANIMAL_OUTS as b on a.ANIMAL_ID = b.ANIMAL_ID
where b.ANIMAL_ID is not null
order by datediff(b.DATETIME, a.DATETIME) desc
limit 2;