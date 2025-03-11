select count(*) as FISH_COUNT
from FISH_INFO as info
join FISH_NAME_INFO as name on name.FISH_TYPE = info.FISH_TYPE
where name.FISH_NAME like 'BASS' or name.FISH_NAME like 'SNAPPER';