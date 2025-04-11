-- 코드를 입력하세요
SELECT
    inf.REST_ID,
    inf.REST_NAME,
    inf.FOOD_TYPE,
    inf.FAVORITES,
    inf.ADDRESS,
    round(avg(rev.REVIEW_SCORE), 2) as SCORE
from REST_INFO as inf
inner join REST_REVIEW as rev on inf.REST_ID = rev.REST_ID
group by inf.REST_ID 
    having ADDRESS like "서울%"
order by SCORE desc, FAVORITES desc;