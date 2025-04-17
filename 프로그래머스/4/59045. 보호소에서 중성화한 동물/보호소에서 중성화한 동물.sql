select 
    ins.ANIMAL_ID,
    ins.ANIMAL_TYPE,
    ins.NAME
from ANIMAL_INS as ins
inner join ANIMAL_OUTS as outs on ins.ANIMAL_ID = outs.ANIMAL_ID
where left(ins.SEX_UPON_INTAKE, 6) = "Intact" and left(outs.SEX_UPON_OUTCOME, 6) != "Intact"
order by ins.ANIMAL_ID;
