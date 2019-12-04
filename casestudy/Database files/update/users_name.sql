DELIMITER $$
CREATE PROCEDURE sp_update_users_name
(
IN pid INT,
IN pname VARCHAR(50)
)
BEGIN
UPDATE users
SET name=pname
WHERE id=pid;
END $$
DELIMITER ;
