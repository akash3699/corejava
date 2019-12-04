DELIMITER $$
CREATE PROCEDURE sp_update_books_price
(
IN pid INT,
IN pprice INT
)
BEGIN
UPDATE books
SET price=pprice
WHERE id=pid;
END $$
DELIMITER ;
