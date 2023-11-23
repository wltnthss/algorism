-- 코드를 입력하세요 ID, 이름, 코드, 분류, 가격
SELECT 
    PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE 
FROM 
    FOOD_PRODUCT
WHERE 
    PRICE = 
            (
            SELECT
                MAX(PRICE)
            FROM 
                FOOD_PRODUCT
            )
    