CREATE DATABASE DB6;

use DB6;


SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE Users(idUser INT NOT NULL AUTO_INCREMENT,id1 VARCHAR(10) NOT NULL, PRIMARY KEY(idUser), contra varchar(10), tipo int(10));

SET FOREIGN_KEY_CHECKS = 1;

GRANT ALL ON DB2.* TO root IDENTIFIED BY '1234';

INSERT INTO Users(id1, contra, tipo) VALUES('Maestro', '1234', 1);
INSERT INTO Users(id1, contra, tipo) VALUES('Alumno', '1234', 2);
INSERT INTO Users(id1, contra, tipo) VALUES('Admin', '1234', 3);
