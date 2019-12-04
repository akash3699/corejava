DELIMITER $$
CREATE PROCEDURE sp_insert_copies
(
IN pid INT,
IN pbookid INT,
IN prack INT,
IN pstatus VARCHAR(50)
)
BEGIN
INSERT INTO library.copies (rack,status,id,book_id)
VALUES (prack,pstatus,pid, pbookid);
END $$
DELIMITER ;
