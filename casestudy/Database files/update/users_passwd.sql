DELIMITER $$
CREATE PROCEDURE sp_update_users_passwd
(
IN pid INT,
IN ppasswd VARCHAR(50)
)
BEGIN
UPDATE users
SET passwd=ppasswd
WHERE id=pid;
END $$
DELIMITER ;
