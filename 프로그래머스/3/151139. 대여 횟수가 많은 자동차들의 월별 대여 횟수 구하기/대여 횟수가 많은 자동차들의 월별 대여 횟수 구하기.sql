SELECT 
    MON, CAR_ID, COUNT(HISTORY_ID) RECORDS
FROM 
(
    SELECT 
        EXTRACT(MONTH FROM START_DATE) MON, CAR_ID, HISTORY_ID
    FROM 
        CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    WHERE
        1=1
        AND TO_DATE('2022-08-01', 'YYYY-MM-DD') <= START_DATE
        AND TO_DATE('2022-11-01', 'YYYY-MM-DD') > START_DATE
        AND CAR_ID IN
        (
            SELECT 
                CAR_ID
            FROM 
                CAR_RENTAL_COMPANY_RENTAL_HISTORY
            WHERE
                1=1
                AND TO_DATE('2022-08-01', 'YYYY-MM-DD') <= START_DATE
                AND TO_DATE('2022-11-01', 'YYYY-MM-DD') > START_DATE
            GROUP BY 
                CAR_ID
            HAVING 
                COUNT(*) > 4
        ) 
) A
GROUP BY 
    MON, CAR_ID
HAVING 
    COUNT(*) > 0
ORDER BY 
    MON, CAR_ID DESC
