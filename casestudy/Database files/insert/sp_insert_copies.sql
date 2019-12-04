DELIMITER $$
CREATE PROCEDURE sp_insert_copies
(
IN pid INT,
IN pbookid INT,
IN prack INT,
IN pstatus VARCHAR(50)
)
BEGIN
INSERT INTO copies
VALUES (pid, pbookid, prack,pstatus);
END $$
DELIMITER ;
