DELIMITER $$
CREATE PROCEDURE sp_select_payments( )
BEGIN
SELECT * FROM payments;
END $$
DELIMITER ;
