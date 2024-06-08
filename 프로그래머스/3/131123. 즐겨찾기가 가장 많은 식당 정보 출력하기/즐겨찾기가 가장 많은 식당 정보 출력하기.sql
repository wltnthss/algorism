SELECT 
    FOOD_TYPE, REST_ID,	REST_NAME, FAVORITES
FROM 
    REST_INFO A
WHERE 
    FAVORITES IN (  SELECT 
                        MAX(FAVORITES)
                    FROM 
                        REST_INFO B
                    WHERE 
                        A.FOOD_TYPE = B.FOOD_TYPE
                    GROUP BY 
                        FOOD_TYPE)
ORDER BY 
    FOOD_TYPE DESC