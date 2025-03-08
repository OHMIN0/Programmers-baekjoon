select 
    MCDP_CD as 진료과코드,
    count(*) as 월예약건수
from APPOINTMENT
where date_format(APNT_YMD, '%Y%m') = '202205'
group by 진료과코드
order by 월예약건수, 진료과코드;
