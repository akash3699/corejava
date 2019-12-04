DELIMITER $$
CREATE PROCEDURE sp_insert_users
(
IN pid INT,
IN pname VARCHAR(50),
IN pemail VARCHAR(50),
IN pphone INT,
IN ppasswd VARCHAR(50),
IN prole VARCHAR(50)
)
BEGIN
INSERT INTO users
VALUES (pid, pname,pemail,pphone,ppasswd, prole);
END $$
DELIMITER ;
