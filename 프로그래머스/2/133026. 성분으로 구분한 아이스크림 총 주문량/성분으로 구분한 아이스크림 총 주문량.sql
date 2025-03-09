-- 코드를 입력하세요
SELECT 
    i.INGREDIENT_TYPE,
    sum(f.TOTAL_ORDER) as TOTAL_ORDER
from
    FIRST_HALF as f,
    ICECREAM_INFO as i
where i.FLAVOR = f.FLAVOR
group by I.INGREDIENT_TYPE 
order by TOTAL_ORDER;