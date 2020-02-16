drop user if exists 'springapp_user'@'localhost';

create USER 'springapp_user'@'localhost' identified by 'mypassword';

grant all privileges on customer_db.* to 'springapp_user'@'localhost';

flush privileges;