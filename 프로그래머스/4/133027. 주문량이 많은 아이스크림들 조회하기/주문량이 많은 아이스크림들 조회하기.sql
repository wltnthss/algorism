SELECT 
    FLAVOR
FROM 
(
    SELECT 
        A.TOTAL_ORDER + SM TOTAL_SUM, B.FLAVOR
    FROM 
        FIRST_HALF A INNER JOIN 
        (
            SELECT 
                SUM(TOTAL_ORDER) SM, FLAVOR
            FROM 
                JULY 
            GROUP BY 
                FLAVOR 
            ORDER BY 
                SM DESC
        ) B
        ON A.FLAVOR = B.FLAVOR
    ORDER BY 
        TOTAL_SUM DESC
)
WHERE 
    ROWNUM <= 3