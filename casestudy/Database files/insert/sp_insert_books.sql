DELIMITER $$
CREATE PROCEDURE sp_insert_books
(
IN pid INT,
IN pname VARCHAR(256),
IN pauthor VARCHAR(256),
IN psubject VARCHAR(256),
IN pprice INT,
IN pisbn INT
)
BEGIN
INSERT INTO books
VALUES (pid, pname, pauthor,psubject,pprice,pisbn);
END $$
DELIMITER ;
