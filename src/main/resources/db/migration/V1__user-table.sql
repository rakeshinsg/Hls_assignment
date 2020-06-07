CREATE TABLE USERS (
  UID INT AUTO_INCREMENT PRIMARY KEY,
  user_name VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  role VARCHAR(50) NOT NULL
);

insert into USERS values (1, 'Tom', 'mot', 'User');
insert into USERS values (2, 'john', 'nhoj', 'Admin');