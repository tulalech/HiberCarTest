DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
  id int(20) NOT NULL,
  color int(11) DEFAULT NULL,
  mark varchar(255) DEFAULT NULL,
  model varchar(255) DEFAULT NULL
);