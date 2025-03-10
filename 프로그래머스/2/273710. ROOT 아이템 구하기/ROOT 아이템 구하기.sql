select 
    A.ITEM_ID,
    A.ITEM_NAME
from ITEM_INFO A
join ITEM_TREE B ON A.ITEM_ID = B.ITEM_ID
where B.PARENT_ITEM_ID is NULL
order by A.ITEM_ID;