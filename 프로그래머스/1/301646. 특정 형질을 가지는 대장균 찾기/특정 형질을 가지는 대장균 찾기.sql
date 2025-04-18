select 
    count(*) as COUNT
from 
    ECOLI_DATA
where 
    (GENOTYPE & 2) = 0 # 2번형질을 미보유하는 조건, 4(0100)이 포함되지않아야함
    and ((GENOTYPE & 4) = 4 or (GENOTYPE & 1) = 1) # 조건2, 8(1000) or 2(0010)이 포함되어야함
;