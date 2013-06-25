-- Generated with Genova.
--
-- Run this schema script against MySQL as follows: 
-- mysql -u courseDB_user -p courseDB < coursedb-schema.sql

-- CREATE TABLE statements including basic column definitions
CREATE TABLE Answer (
  answerText varchar(30),
  id int
);

CREATE TABLE Assignment (
  assignmentText varchar(30),
  id int
);

CREATE TABLE Course (
  code varchar(30),
  id int,
  isActive tinyint,
  name varchar(30)
);

CREATE TABLE Student (
  age int,
  id int,
  name varchar(30),
  studentNr int
);

CREATE TABLE StudentCourse (
  id int
);

