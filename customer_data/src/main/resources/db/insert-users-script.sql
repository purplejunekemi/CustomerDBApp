/*SET FOREIGN_KEY CHECKS = 0;*/
TRUNCATE TABLE `customer_db`.`customer`;
/*SET FOREIGN_KEY CHECKS = 1;*/

insert into `customer_db`.`customer` (`customer_id`, `firstname`, `lastname`, `email`)

values(7, 'Shola', 'Makinde', 'shola@gmail.com'),
(3, 'Shola', 'Ojo', 'ojoa@gmail.com'),
(6, 'Kems', 'Makinde', 'kems@gmail.com');