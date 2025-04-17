select 
    CATEGORY,
    PRICE as MAX_PRICE,
    PRODUCT_NAME
    
from FOOD_PRODUCT

where 
    # PRICE = (서브쿼리)일 경우, "="는 비교연산자이므로 서브쿼리가 하나의 행만을 리턴해야함
    # PRICE in (서브쿼리)일 경우, 리턴된 서브쿼리와 같은 값의 PRICE값들을 가진 행들만을 골라낼 수 있음
    PRICE in (
        select max(PRICE) 
        from FOOD_PRODUCT 
        group by CATEGORY
    )
    and CATEGORY in ("과자", "국", "김치", "식용유")

order by PRICE desc;