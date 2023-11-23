-- 코드를 입력하세요
SELECT
    MEMBER_ID, MEMBER_NAME, GENDER, to_char(date_of_birth, 'yyyy-mm-dd') DATE_OF_BIRTH
from 
    member_profile
where 
    TO_CHAR(DATE_OF_BIRTH, 'MM') = 3
    AND TLNO IS NOT NULL
    AND GENDER = 'W'
order by 
    member_id asc;