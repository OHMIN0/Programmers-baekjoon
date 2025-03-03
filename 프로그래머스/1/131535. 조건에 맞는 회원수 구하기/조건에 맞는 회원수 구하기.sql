select count(*) 
from USER_INFO
where 
    substring(JOINED,1,4) = 2021 and 20 <= AGE and AGE <= 29;