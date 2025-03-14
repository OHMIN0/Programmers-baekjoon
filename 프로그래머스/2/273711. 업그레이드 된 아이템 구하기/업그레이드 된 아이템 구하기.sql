select 
    i2.ITEM_ID,
    i2.ITEM_NAME,
    i2.RARITY
from ITEM_INFO as i1
join ITEM_TREE as t on i1.ITEM_ID = t.PARENT_ITEM_ID
join ITEM_INFO as i2 on t.ITEM_ID = i2.ITEM_ID
where i1.RARITY = 'RARE'
order by i2.ITEM_ID desc;