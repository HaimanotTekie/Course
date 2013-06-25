-- Generated with Genova.
--
-- Run this schema script against MySQL as follows: 
-- mysql -u courseDB_user -p courseDB < coursedb-schema.sql

-- CREATE TABLE statements including basic column definitions
CREATE TABLE Answer (
  answerText varchar(30),
  id int auto_increment NOT NULL,
  assignment_id int NOT NULL,
  student_id int NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Assignment (
  assignmentText varchar(30),
  id int auto_increment NOT NULL,
  course_id int NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Course (
  code varchar(30) NOT NULL,
  id int auto_increment NOT NULL,
  isActive tinyint,
  name varchar(30),
  PRIMARY KEY (id)
);

CREATE TABLE Student (
  age int,
  id int auto_increment NOT NULL,
  name varchar(30),
  studentNr int,
  PRIMARY KEY (id)
);

CREATE TABLE StudentCourse (
  id int auto_increment NOT NULL,
  course_id int NOT NULL,
  student_id int NOT NULL,
  PRIMARY KEY (id)
);

