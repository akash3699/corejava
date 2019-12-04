DELIMITER $$
CREATE PROCEDURE sp_insert_issuerecord
(
IN pid INT,
IN pcopyid INT,
IN pmemberid INT,
IN pissue_date DATE,
IN preturn_duedate DATE,
IN preturn_date DATE,
IN pfine_amount INT
)
BEGIN
INSERT INTO issuerecord
VALUES (pid, pcopyid, pmemberid,pissue_date,preturn_duedate,preturn_date,pfine_amount);
END $$
DELIMITER ;
