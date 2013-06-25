-- Generated with Genova.
--
-- Run this schema script against MySQL as follows: 
-- mysql -u root -p courseDB < coursedb-drop.sql

-- First: DROP foreign keys

-- Second: DROP tables
DROP TABLE IF EXISTS Answer;
DROP TABLE IF EXISTS Assignment;
DROP TABLE IF EXISTS Course;
DROP TABLE IF EXISTS Student;
DROP TABLE IF EXISTS StudentCourse;
