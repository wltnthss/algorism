-- 코드를 입력하세요
SELECT 
    mcdp_cd "진료과 코드", COUNT(*) "5월예약건수"
FROM  
    APPOINTMENT 
WHERE 
    TO_CHAR(APNT_YMD, 'YYYY-MM') = '2022-05'
GROUP BY 
    mcdp_cd
ORDER BY 
    "5월예약건수", "진료과 코드"