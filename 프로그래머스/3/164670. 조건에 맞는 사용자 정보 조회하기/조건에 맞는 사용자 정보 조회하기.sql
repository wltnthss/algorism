-- 코드를 입력하세요
SELECT
    USER_ID,	NICKNAME,	city || ' ' || street_address1 || ' ' || street_address2 전체주소,	
    REGEXP_REPLACE(TLNO, '(.{3})(.+)(.{4})', '\1-\2-\3')  전화번호
FROM 
    USED_GOODS_USER A
WHERE 
    (SELECT COUNT(WRITER_ID) FROM USED_GOODS_BOARD B WHERE B.WRITER_ID = A.USER_ID GROUP BY WRITER_ID) >= 3
ORDER BY 
    USER_ID DESC

-- SELECT COUNT(WRITER_ID) FROM USED_GOODS_BOARD GROUP BY WRITER_ID;