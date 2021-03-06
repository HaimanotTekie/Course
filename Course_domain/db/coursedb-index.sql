/* Generated with Genova. */
--
-- Run this schema script against MySQL as follows: 
-- mysql -u courseDB_user -p courseDB < coursedb-index.sql

-- ALTER TABLE and CREATE FOREIGN KEY/INDEX statements

-- Answer
ALTER TABLE Answer ADD CONSTRAINT Answer_assignment_idF FOREIGN KEY (assignment_id) REFERENCES Assignment (id);
ALTER TABLE Answer ADD CONSTRAINT Answer_student_idF FOREIGN KEY (student_id) REFERENCES Student (id);

-- Assignment
ALTER TABLE Assignment ADD CONSTRAINT Assignment_course_idF FOREIGN KEY (course_id) REFERENCES Course (id);

-- Course

-- Student

-- StudentCourse
ALTER TABLE StudentCourse ADD CONSTRAINT StudentCourse_course_idF FOREIGN KEY (course_id) REFERENCES Course (id);
ALTER TABLE StudentCourse ADD CONSTRAINT StudentCourse_student_idF FOREIGN KEY (student_id) REFERENCES Student (id);

