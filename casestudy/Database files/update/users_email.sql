DELIMITER $$
CREATE PROCEDURE sp_update_users_email
(
IN pid INT,
IN pemail VARCHAR(50)
)
BEGIN
UPDATE users
SET email=pemail
WHERE id=pid;
END $$
DELIMITER ;
