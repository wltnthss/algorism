SELECT ANIMAL_ID
     , ANIMAL_TYPE
     , NAME
  FROM ANIMAL_OUTS
 WHERE SEX_UPON_OUTCOME IN ('Spayed Female', 'Neutered Male') 
   AND animal_id in ( SELECT ANIMAL_ID 
                        FROM ANIMAL_INS
                       WHERE SEX_UPON_INTAKE NOT IN  ('Spayed Female', 'Neutered Male')
                    )
    ORDER BY ANIMAL_ID