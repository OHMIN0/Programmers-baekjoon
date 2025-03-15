select 
    D.ID,
    D.EMAIL,
    D.FIRST_NAME,
    D.LAST_NAME
from 
    DEVELOPERS as D
where 
-- exists문은 서브쿼리가 참일 경우, 해당 쿼리를 결과에 포함시키고,
-- 거짓일경우 제외함
-- 즉, Python과 C#의 바이너리값이 해당 쿼리의 D.SKILL_CODE값에 포함될 경우에만
-- 그 쿼리들을 결과에 출력시킬 수 있음
    exists (
        select 1
        from SKILLCODES as S
        where S.NAME in ('Python', 'C#')
            and (D.SKILL_CODE & S.CODE) = S.CODE
            -- SKILL_CODE와 CODE는 둘 다 Integer형이라
            -- 비교연산시 이진수로 알아서 변환된 뒤 비교됨
    )
order by D.ID;