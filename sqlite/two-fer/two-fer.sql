-- Schema: CREATE TABLE "twofer" ("input" TEXT, "response" TEXT);
-- Task: update the twofer table and set the response based on the input.


UPDATE twofer,
    CASE 
        WHEN input THEN 'One for '${input}, One for me'
        ELSE 'One for you, One for me'