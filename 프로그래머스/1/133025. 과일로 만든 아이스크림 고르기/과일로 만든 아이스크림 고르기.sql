select  
    a.FLAVOR as FLAVOR
from FIRST_HALF as a
inner join ICECREAM_INFO as b on a.FLAVOR=b.FLAVOR
where a.TOTAL_ORDER > 3000 and left(b.INGREDIENT_TYPE, 5) = "fruit"
order by a.TOTAL_ORDER desc;