select 
    B.CATEGORY,
    sum(S.sales) as TOTAL_SALES
from BOOK as B
inner join BOOK_SALES as S on B.BOOK_ID = S.BOOK_ID
where S.SALES_DATE >= "2022-01-01" and S.SALES_DATE <= "2022-01-31"
group by CATEGORY
order by CATEGORY asc;