DELIMITER $$
CREATE PROCEDURE sp_update_copies_status
(
IN pid INT,
IN pstatus VARCHAR(50)
)
BEGIN
UPDATE copies
SET status=pstatus 
WHERE id=pid;
END $$
DELIMITER ;
