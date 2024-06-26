
SELECT 
    A.HOUR, COUNT(*) COUNT
FROM
(
    SELECT 
        EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP)) HOUR
    FROM 
        ANIMAL_OUTS A
    WHERE 
        1=1
        AND TO_CHAR(DATETIME, 'HH24:MI') BETWEEN '09:00' AND '19:59'
) A
GROUP BY 
    A.HOUR
ORDER BY 
    A.HOUR
    