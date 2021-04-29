CREATE DATABASE ativiade_bruno

CREATE TABLE conta (
idconta int PRIMARY KEY AUTO_INCREMENT
    nome varchar(60),
    sobrenome varchar(60),
    celular varchar(20),
    email varchar(50),
    senha varchar(50),
    dt_nascimento date,
    sexo char(1)  
);

INSERT INTO conta(nome, sobrenome, celular, email, senha, dt_nascimento, sexo) values("Emanuelli", "De Oliveira", "48 998846831"
,"manu_oliveira@hotmail.com", "12083010", "2003-12-08", "m");

////////////////////////////////////////////////////////////////////////////////////
CREATE TABLE conta_aluno(
	idconta_aluno int PRIMARY KEY AUTO_INCREMENT,
    nome varchar(50)
);
INSERT INTO conta_aluno(nome) values("Emanuelli");
INSERT INTO conta_aluno(nome) values("Valentina");
INSERT INTO conta_aluno(nome) values("Gabriela");
///////////////////////////////////////////////////////////////////////////////////
CREATE TABLE estacionamento(
	idcarro int PRIMARY KEY AUTO_INCREMENT,
    marca varchar(20),
    modelo varchar(50),
    ano_de_fabricacao int,
    ano_do_modelo int,
    placa char(7),
    cor varchar(20),
    numero_do_chassi char(17)
);
INSERT INTO estacionamento(marca, modelo, ano_de_fabricacao, ano_do_modelo, placa, cor, numero_do_chassi)
values ("Hyundai", "Hb20", 2015, 2015, "hba3424", "Branco", "HI678542769HIN567");
//////////////////////////////////////////////////////////////////////////////////
CREATE TABLE biblioteca(
	idlivro int PRIMARY KEY AUTO_INCREMENT,
    titulo varchar(100),
    autor varchar(100),
    editora varchar(50),
    ano_de_publicacao int
);

INSERT INTO biblioteca(titulo, autor, editora, ano_de_publicacao) values("A casa das orquídeas", "Lucinda Riley", "Arqueiro", "2015");




