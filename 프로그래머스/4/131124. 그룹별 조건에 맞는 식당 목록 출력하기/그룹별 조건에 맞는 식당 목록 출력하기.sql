
-- SELECT 
--     MAX(CNT)
-- FROM
-- (
-- SELECT 
--     MEMBER_ID, COUNT(*) CNT
-- FROM 
--     REST_REVIEW
-- GROUP BY 
--     MEMBER_ID
-- ) A

SELECT 
    C.MEMBER_NAME, B.REVIEW_TEXT, TO_CHAR(B.REVIEW_DATE, 'YYYY-MM-DD')
FROM 
(
    SELECT 
        MEMBER_ID, CNT
    FROM 
    (
        SELECT 
            MEMBER_ID, COUNT(MEMBER_ID) CNT
        FROM 
            REST_REVIEW
        GROUP BY 
            MEMBER_ID
    )
    WHERE 
        CNT = ( SELECT 
                    MAX(CNT)
                FROM
                (
                    SELECT 
                        MEMBER_ID, COUNT(*) CNT
                    FROM 
                        REST_REVIEW
                    GROUP BY 
                        MEMBER_ID
                ) ) 
) A, 
REST_REVIEW B, MEMBER_PROFILE C
WHERE 
    1=1
    AND A.MEMBER_ID = B.MEMBER_ID
    AND A.MEMBER_ID = C.MEMBER_ID
ORDER BY 
    REVIEW_DATE, REVIEW_TEXT 
