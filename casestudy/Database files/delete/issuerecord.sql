DELIMITER $$
CREATE PROCEDURE sp_delete_issuerecord
(
IN pid INT
)
BEGIN
DELETE FROM issuerecord
WHERE id=pid;
END $$
DELIMITER ;
