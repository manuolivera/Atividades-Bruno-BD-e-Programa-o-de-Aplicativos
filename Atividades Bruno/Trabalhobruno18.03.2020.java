CREATE DATABASE Trabalhobruno18.03;

///*Bibilioteca*///
CREATE TABLE Usuario (
nomeUser varchar(180) unique NOT NULL default("Não informado"),
matriculaUser int unsigned unique,
enderecoUser varchar(180) unique NOT NULL default("Não informado"),
emailUser varchar(180) unique NOT NULL
);

CREATE TABLE Livro (
codigoLivro int not null unique auto_increment,
nomeLivro varchar(50) not null unique,
nomeAutorLivro varchar(120) not null,
edicaoLivro int not null 
);

CREATE TABLE Autor (
codigoAutor int unsigned not null unique,
nomeAutor varchar(80) unique not null default("Não informado"),
nacionalidade varchar(60) not null default("Não informado"),
enderecoWebAutor varchar(125) not null default("Não informado"),
emailAutor varchar(140) not null unique default("Não informado")
);

CREATE TABLE Assunto (
assuntoCodigo int unsigned  not null , 
assuntoNome varchar (220) not null default("Não informado")
);

CREATE TABLE SubAssunto(
subAssuntoCodigo int unsigned  not null ,
subAssuntoNome int unsigned not null
);

///* Empresa *///
CREATE TABLE Departamentos (
depNome varchar(250) unique not null default("Não informado"),
depCodigo float(5) unsigned not null unique,
depLocalizacao varchar(250) unique not null
);

CREATE TABLE AdmDepartamentos (
admDepNome varchar(250) unique not null default("Não informado"),
admDepCodigo float(5) unsigned not null unique,
admDepDTInicio datetime not null default("Não informado")
);

CREATE TABLE Projeto (
projetoNome varchar(100) unique not null default("Não informado"),
projetoLocalizacao varchar(100) not null default("Não informado")
);

CREATE TABLE Funcionario (
funcionarioNome varchar(100) unique not null default("Não informado"),
funcionarioNum int unsigned unique not null default("Não informado"),
funcionarioNumSeguro int unsigned unique not null default("Não informado"),
funcionarioEndereco varchar(250) not null default("Não informado"),
funcionarioSalario float(5) unsigned not null default(0.000),
funcionarioSexo varchar(10) not null default("Não informado"),
funcionarioDataNascimento date not null
);

CREATE TABLE FuncionarioNoProjeto(
funcionarioNome varchar(100) unique not null,
funcionarioNomeProjeto varchar(100) unique not null default("Não informado"),
funcionarioTempoNoProjeto time
);

CREATE TABLE FuncionarioDependente(
dependenteNome varchar(100) unique not null,
dependenteSexo varchar(10) unique not null,
dependenteNascimento date,
dependenteRelacaoFuncionario varchar(230) unique not null
);