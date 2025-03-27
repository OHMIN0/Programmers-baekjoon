select 
    B.USER_ID,
    B.NICKNAME,
    sum(PRICE) as TOTAL_SALES
from USED_GOODS_BOARD as A
join USED_GOODS_USER as B on A.WRITER_ID = B.USER_ID
where STATUS = 'DONE'
group by B.USER_ID 
having TOTAL_SALES >= 700000
order by TOTAL_SALES;
