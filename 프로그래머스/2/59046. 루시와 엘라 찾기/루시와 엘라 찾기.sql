select ANIMAL_ID, NAME, SEX_UPON_INTAKE
from ANIMAL_INS
where 
    NAME like 'Lucy' 
    or NAME LIKE 'Ella' 
    or NAME like 'Pickle'
    or NAME like 'Rogan'
    or NAME like 'Sabrina'
    or NAME like 'Mitty';