CREATE DATABASE portfolio_raul_guanca;

USE portfolio_raul_guanca;

CREATE TABLE persona (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(45) NULL, apellido VARCHAR(45) NULL, fechaNac DATE NULL, celular INT NULL, correo VARCHAR(45) NULL, url_foto VARCHAR(50) NULL, mainSkill VARCHAR(100), acercaDe VARCHAR(250), PRIMARY KEY (id));

INSERT INTO persona (nombre, apellido, fechaNac, celular, correo, url_foto, mainSkill, acercaDe) VALUES ('Raúl Gabriel', 'Guanca', '1985-07-22', '3816572456', 'raulgguanca@gmail.com', NULL, 'Full Stack Web Developer', 'I am a programming and technology enthusiast');

CREATE TABLE domicilio (id INT NOT NULL AUTO_INCREMENT, calle VARCHAR(45) NULL, numero INT NULL, codigoPostal INT NULL, localidad VARCHAR(45) NULL, provincia VARCHAR(45) NULL, pais VARCHAR(45) NULL, id_persona INT NOT NULL, PRIMARY KEY (id), FOREIGN KEY (id_persona) REFERENCES portfolio_raul_guanca.persona (id));

INSERT INTO domicilio (calle, numero, codigoPostal, localidad, provincia, pais, id_persona) VALUES ('San Lorenzo', 1988, 4000, 'San Miguel de Tucumán', 'Tucumán', 'Argentina', 1);

CREATE TABLE experiencia_laboral (id INT NOT NULL AUTO_INCREMENT, position VARCHAR(45) NULL, company VARCHAR(45) NULL, img VARCHAR(45) NULL, modo VARCHAR(45) NULL, inicio VARCHAR(45) NULL, fin VARCHAR(45) NULL, timeElapsed VARCHAR(45) NULL, ubicacion VARCHAR(45), id_persona INT NOT NULL, PRIMARY KEY (id), FOREIGN KEY (id_persona) REFERENCES portfolio_raul_guanca.persona (id));

INSERT INTO experiencia_laboral (position, company, img, modo, inicio, fin, timeElapsed, ubicacion, id_persona) VALUES ('Supervisor', 'Teleperformance Argentina', NULL, 'Full-Time', 'oct 2009', 'mar 2018', '8 ños y 5 meses', 'Tucumán, Argentina', 1);

CREATE TABLE educacion (id INT NOT NULL AUTO_INCREMENT, school VARCHAR(45) NULL, title VARCHAR(45) NULL, img VARCHAR(45) NULL, carrer VARCHAR(45) NULL, score FLOAT NULL, inicio VARCHAR(45) NULL, fin VARCHAR(45) NULL, PRIMARY KEY (id));

INSERT INTO educacion (school, title, img, carrer, score, inicio, fin) VALUES ('Argentina Programa', 'Full Stack Web Developer', NULL, 'Programación', NULL, 'nov 2021', 'ago 2022'), ('Colegio Nacional Bartolomé Mitre', 'Perito Especializado en Recursos Naturales', NULL, 'Humanidades', 7.9, 'mar 2005', 'jul 2006');

CREATE TABLE tecnologias (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(20) NULL, progress FLOAT NULL, PRIMARY KEY (id));

INSERT INTO tecnologias (name, progress) VALUES ('HTML', 75), ('CSS', 50), ('JS', 25), ('SQL', 50), ('PHP', 15);

CREATE TABLE proyectos (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(45) NULL, client VARCHAR(45) NULL, img VARCHAR(45) NULL, description VARCHAR(300) NULL, url VARCHAR(50) NULL, PRIMARY KEY (id));

INSERT INTO proyectos (name, client, img, description, url) VALUES('Base de datos local', 'Cuartel de Bomberos Voluntarios', NULL, 'Realicé una base de datos local con una página para la gestión de la misma via formularios. La misma se desarrolló con Xampp, MySQL, HTML, CSS Y PHP', NULL);

CREATE TABLE usuarios (id INT NOT NULL AUTO_INCREMENT, usuario VARCHAR(20) NOT NULL, contrasenha VARCHAR(250) NOT NULL, PRIMARY KEY (id));