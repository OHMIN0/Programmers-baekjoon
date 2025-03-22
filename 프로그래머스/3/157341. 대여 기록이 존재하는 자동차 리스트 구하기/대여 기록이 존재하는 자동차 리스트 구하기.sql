select A.CAR_ID as CAR_ID
from CAR_RENTAL_COMPANY_CAR as A
inner join CAR_RENTAL_COMPANY_RENTAL_HISTORY as B on A.CAR_ID = B.CAR_ID
where A.CAR_TYPE='세단' and month(START_DATE) = 10
group by A.CAR_ID
order by CAR_ID desc;