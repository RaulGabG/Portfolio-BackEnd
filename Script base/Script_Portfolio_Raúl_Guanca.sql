CREATE DATABASE portfolio_raul_guanca;

USE portfolio_raul_guanca;

CREATE TABLE persona (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(45) NULL, apellido VARCHAR(45) NULL, fechaNac DATE NULL, celular INT NULL, correo VARCHAR(45) NULL, url_foto VARCHAR(50) NULL, mainSkill VARCHAR(100), acercaDe VARCHAR(250), PRIMARY KEY (id));

CREATE TABLE domicilio (id INT NOT NULL AUTO_INCREMENT, calle VARCHAR(45) NULL, numero INT NULL, codigoPostal INT NULL, localidad VARCHAR(45) NULL, provincia VARCHAR(45) NULL, pais VARCHAR(45) NULL, id_persona INT NOT NULL, PRIMARY KEY (id), FOREIGN KEY (id_persona) REFERENCES portfolio_raul_guanca.persona (id));

CREATE TABLE experiencia_laboral (id INT NOT NULL AUTO_INCREMENT, position VARCHAR(45) NULL, company VARCHAR(45) NULL, img VARCHAR(45) NULL, modo VARCHAR(45) NULL, inicio VARCHAR(45) NULL, fin VARCHAR(45) NULL, timeElapsed VARCHAR(45) NULL, ubicacion VARCHAR(45), id_persona INT NOT NULL, PRIMARY KEY (id), FOREIGN KEY (id_persona) REFERENCES portfolio_raul_guanca.persona (id));

CREATE TABLE educacion (id INT NOT NULL AUTO_INCREMENT, school VARCHAR(45) NULL, title VARCHAR(45) NULL, img VARCHAR(45) NULL, carrer VARCHAR(45) NULL, score FLOAT NULL, inicio VARCHAR(45) NULL, fin VARCHAR(45) NULL, id_persona INT NOT NULL, PRIMARY KEY (id), FOREIGN KEY (id_persona) REFERENCES portfolio_raul_guanca.persona (id));

CREATE TABLE proyectos (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(45) NULL, client VARCHAR(45) NULL, img VARCHAR(45) NULL, description VARCHAR(300) NULL, url VARCHAR(50) NULL, id_persona INT NOT NULL, PRIMARY KEY (id), FOREIGN KEY (id_persona) REFERENCES portfolio_raul_guanca.persona (id));

CREATE TABLE tecnologias (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(20) NULL, progress FLOAT NULL, id_proyectos INT NOT NULL, PRIMARY KEY (id), FOREIGN KEY (id_proyectos) REFERENCES portfolio_raul_guanca.proyectos (id));

CREATE TABLE usuarios (id INT NOT NULL AUTO_INCREMENT, usuario VARCHAR(20) NOT NULL, contrasenha VARCHAR(250) NOT NULL, id_persona INT NOT NULL, PRIMARY KEY (id), FOREIGN KEY (id_persona) REFERENCES portfolio_raul_guanca.persona (id));