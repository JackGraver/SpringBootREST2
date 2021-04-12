DROP DATABASE school;
CREATE DATABASE school;

USE school;

CREATE TABLE staff (
	staffId INT NOT NULL AUTO_INCREMENT,
	role VARCHAR(255),
	password VARCHAR(255),
	PRIMARY KEY(staffId)
);
ALTER TABLE staff AUTO_INCREMENT = 1;

CREATE TABLE student (
	studentId int NOT NULL AUTO_INCREMENT,
	firstname VARCHAR(255),
	lastname VARCHAR(255),
	gpa FLOAT,
	PRIMARY KEY (studentId)
);
ALTER TABLE student AUTO_INCREMENT = 10000;

CREATE TABLE course (
	courseId int NOT NULL AUTO_INCREMENT,
	courseName VARCHAR(255),
	courseDescription VARCHAR(255),
	PRIMARY KEY (courseId)
);
ALTER TABLE course AUTO_INCREMENT = 100;

INSERT INTO staff(role, password)
VALUES ('Dean', 'password');

INSERT INTO staff(role, password)
VALUES ('Professor', 'password');


INSERT INTO student (firstname, lastname, gpa)
VALUES ('Gary', 'Dillon', 3.5);

INSERT INTO student (firstname, lastname, gpa)
VALUES ('Elle', 'Ramsey', 4.0);

INSERT INTO student (firstname, lastname, gpa)
VALUES ('Nicolle', 'Kinney', 3.2);

INSERT INTO student (firstname, lastname, gpa)
VALUES ('Saad', 'Mathis', 2.4);

INSERT INTO student (firstname, lastname, gpa)
VALUES ('Alastair', 'Rosa', 3.1);


INSERT INTO course (courseName, courseDescription)
VALUES ('Physics', 'Exploration of earths physics');

INSERT INTO course (courseName, courseDescription)
VALUES ('Biology', 'Learning our biology');

INSERT INTO course (courseName, courseDescription)
VALUES ('Mathematics', 'Mathematics expressions and functions');

INSERT INTO course (courseName, courseDescription)
VALUES ('English', 'Indepth english literature and writing');

INSERT INTO course (courseName, courseDescription)
VALUES ('French', 'Indepth french literature and writing');

INSERT INTO course (courseName, courseDescription)
VALUES ('Chemistry', 'Taking a look at chemistry');

INSERT INTO course (courseName, courseDescription)
VALUES ('Phys Ed', 'Physical education for your health');