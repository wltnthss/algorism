SELECT ID, MAX(LENGTH) LENGTH FROM FISH_INFO GROUP BY ID ORDER BY MAX(LENGTH) DESC, ID LIMIT 10