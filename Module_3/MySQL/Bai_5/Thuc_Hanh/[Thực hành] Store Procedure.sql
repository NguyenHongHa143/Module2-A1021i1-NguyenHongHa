use classicmodels;
DELIMITER //
CREATE procedure InfoAllCustomer()
BEGIN
	SELECT * FROM CUSTOMERs;
end//
CALL InfoAllCustomer();

DELIMITER //
DROP PROCEDURE IF EXISTS `findAllCustomers`//

CREATE PROCEDURE findAllCustomers()

BEGIN

SELECT * FROM customers where customerNumber = 175;

END //