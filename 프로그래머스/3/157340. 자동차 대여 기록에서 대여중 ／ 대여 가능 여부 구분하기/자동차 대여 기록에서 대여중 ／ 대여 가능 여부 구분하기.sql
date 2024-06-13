-- 코드를 입력하세요
select distinct(car_id),
    case when car_id in 
    (select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where to_char(start_date, 'yyyy-mm-dd') <= '2022-10-16' 
        and to_char(end_date, 'yyyy-mm-dd') >= '2022-10-16') then '대여중' 
        else '대여 가능' end as availability
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
order by 1 desc