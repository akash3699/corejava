DELIMITER $$
CREATE PROCEDURE sp_delete_payments
(
IN pid INT
)
BEGIN
DELETE FROM payments
WHERE id=pid;
END $$
DELIMITER ;
