-- 코드를 입력하세요
-- SELECT
--     DISTINCT USER_ID, PRODUCT_ID
-- FROM 
--     ONLINE_SALE
-- ORDER BY 
--     PRODUCT_ID DESC;

-- SELECT
--     USER_ID, PRODUCT_ID
-- FROM 
--     ONLINE_SALE
-- ORDER BY 
--     USER_ID;
    
-- SELECT 
--     USER_ID, PRODUCT_ID, COUNT(USER_ID) CNT
-- FROM 
--     ONLINE_SALE
-- GROUP BY 
--     USER_ID, PRODUCT_ID
-- ORDER BY  
--     USER_ID ASC;

-- 2 는 3개, 7은 2개
SELECT USER_ID, PRODUCT_ID
FROM (
SELECT USER_ID, PRODUCT_ID, COUNT(*) CNT
FROM ONLINE_SALE
GROUP BY USER_ID, PRODUCT_ID
)
WHERE CNT > 1
ORDER BY USER_ID, PRODUCT_ID DESC;
    
    
    