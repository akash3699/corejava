DELIMITER $$
CREATE PROCEDURE sp_select_users( )
BEGIN
SELECT * FROM users;
END $$
DELIMITER ;