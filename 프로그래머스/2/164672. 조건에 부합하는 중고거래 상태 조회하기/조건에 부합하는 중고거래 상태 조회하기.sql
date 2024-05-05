-- -- 코드를 입력하세요
SELECT
    board_id, writer_id, title, price, 
    CASE WHEN STATUS = 'SALE' THEN '판매중' 
         WHEN STATUS = 'RESERVED' THEN '예약중' 
         WHEN STATUS = 'DONE' THEN '거래완료' 
    END STATUS
FROM 
    USED_GOODS_BOARD 
WHERE 
    1=1
    AND TO_CHAR(CREATED_DATE, 'YYYY-MM-DD') = '2022-10-05'
ORDER BY    
    BOARD_ID DESC

