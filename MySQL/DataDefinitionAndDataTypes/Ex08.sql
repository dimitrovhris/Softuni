ALTER table users
DROP primary key,
ADD CONSTRAINT pk_users2
PRIMARY KEY users(id, username);
