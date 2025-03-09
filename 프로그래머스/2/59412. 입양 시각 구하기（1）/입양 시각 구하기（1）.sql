select hour(datetime) as HOUR, COUNT(datetime) as COUNT
from ANIMAL_OUTS
where HOUR(datetime)>=9 and HOUR(datetime)<=19
group by HOUR
order by HOUR;