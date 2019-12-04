DELIMITER $$
CREATE PROCEDURE sp_insert_payments
(
IN pid INT,
IN puserid INT,
IN pamount INT,
IN ptype VARCHAR(50),
IN ptransaction_time TIME,
IN pnextpayment_duedate DATE
)
BEGIN
INSERT INTO payments
VALUES (pid, puserid,pamount,ptype,ptransaction_time,pnextpayment_duedate);
END $$
DELIMITER ;
