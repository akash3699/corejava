DELIMITER $$
CREATE PROCEDURE sp_update_users_phoneno
(
IN pid INT,
IN pphone INT(11)
)
BEGIN
UPDATE users
SET phone=pphone
WHERE id=pid;
END $$
DELIMITER ;
