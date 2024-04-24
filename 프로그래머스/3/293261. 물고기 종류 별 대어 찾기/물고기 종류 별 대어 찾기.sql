-- 코드를 작성해주세요
SELECT 
    FI.ID, FNI.FISH_NAME, FI.LENGTH
FROM 
    FISH_INFO FI,
    FISH_NAME_INFO FNI
WHERE 
    1=1
    AND FI.FISH_TYPE = FNI.FISH_TYPE
    AND (FI.FISH_TYPE, FI.LENGTH) IN (
                                    SELECT 
                                        A.FISH_TYPE, MAX(A.LENGTH) LENGTH
                                    FROM 
                                        FISH_INFO A
                                    GROUP BY 
                                        FISH_TYPE
                                 )