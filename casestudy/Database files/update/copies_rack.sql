DELIMITER $$
CREATE PROCEDURE sp_update_copies_rack
(
IN pid INT,
IN pstatus VARCHAR(50)
)
BEGIN
UPDATE copies
SET rack=prack
WHERE id=pid;
END $$
DELIMITER ;
