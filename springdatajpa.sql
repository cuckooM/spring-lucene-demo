CREATE TABLE IF NOT EXISTS tbl_user (
   id bigint(20) NOT NULL AUTO_INCREMENT PRIMARY key,
   login_name varchar(128) NOT NULL,
   user_name varchar(256),
   sex INT,
   state INT NOT NULL DEFAULT 1,
   create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;