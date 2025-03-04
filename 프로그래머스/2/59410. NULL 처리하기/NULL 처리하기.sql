select ANIMAL_TYPE
        ,CASE
            WHEN NAME IS NULL THEN 'No name'
            ELSE NAME
        END AS NAME
        ,SEX_UPON_INTAKE 
from ANIMAL_INS
order by ANIMAL_ID;