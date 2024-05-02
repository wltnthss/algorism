-- 코드를 작성해주세요
SELECT 
    COUNT(*) FISH_COUNT
FROM 
(
    SELECT 
        TIME 
    FROM 
        FISH_INFO FI
) A
WHERE DATE_FORMAT(TIME, '%Y') = '2021'