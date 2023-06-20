CREATE TABLE students (
student_id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
name VARCHAR(20));

CREATE TABLE exams(
exam_id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
name VARCHAR(20));

CREATE TABLE students_exams(
student_id INT,
exam_id INT);

INSERT INTO students (student_id, name)
VALUES (1, 'Mila'), (2, 'Toni'), (3, 'Ron');

INSERT INTO exams (exam_id, name)
VALUES (101, 'Spring MVC'), (102, 'Neo4j'), (103, 'Oracle 11g');

INSERT INTO students_exams(student_id, exam_id)
VALUES (1, 101), (1, 102), (2, 101), (3, 103), (2, 102), (2, 103);

ALTER TABLE students_exams
ADD CONSTRAINT pk_students_exams
PRIMARY KEY (student_id, exam_id),
ADD CONSTRAINT fk_students_exams
FOREIGN KEY students_exam (student_id)
REFERENCES students (student_id);

ALTER TABLE students_exams
ADD CONSTRAINT fk_exams_students
FOREIGN KEY students_exams (exam_id)
REFERENCES exams(exam_id);
