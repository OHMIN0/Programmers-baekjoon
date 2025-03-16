select 
    case
        when month(DIFFERENTIATION_DATE)>=1 and month(DIFFERENTIATION_DATE)<=3  
            then concat("1","Q")
        when month(DIFFERENTIATION_DATE)>=4 and month(DIFFERENTIATION_DATE)<=6  
            then concat("2","Q")
        when month(DIFFERENTIATION_DATE)>=7 and month(DIFFERENTIATION_DATE)<=9  
            then concat("3","Q")
        when month(DIFFERENTIATION_DATE)>=10 and month(DIFFERENTIATION_DATE)<=12  
            then concat("4","Q")
    end as QUARTER,
    count(*) as ECOLI_COUNT
from ECOLI_DATA
group by QUARTER
order by QUARTER;
