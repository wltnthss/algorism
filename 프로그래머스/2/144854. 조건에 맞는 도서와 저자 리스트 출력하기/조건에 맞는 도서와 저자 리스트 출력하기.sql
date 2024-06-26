-- 코드를 입력하세요
SELECT
    BOOK_ID, AUTHOR_NAME, TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD') PUBLISHED_DATE
FROM 
    BOOK B LEFT JOIN AUTHOR A
    ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE 
    1=1
    AND B.CATEGORY = '경제'
ORDER BY 
    PUBLISHED_DATE
    