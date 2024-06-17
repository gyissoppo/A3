create database a3202401;
use a3202401;

create table usuario(
codigo int primary key auto_increment not null,
nome_empresa varchar(300),
cnpj varchar(20) not null,
celular varchar(15),
email varchar(60),
senha varchar(100)
) Engine = InnoDB;

create table formulario(
codigo int primary key auto_increment not null,
cnpj varchar(20),
pergunta1 varchar(5000),
pergunta2 varchar(200),
pergunta3 varchar(5000),
pergunta4nome varchar(250),
pergunta4email varchar(250)
) Engine = InnoDB;	

create table chat(
codigo int primary key auto_increment not null,
cnpj varchar(20),
mensagem varchar(5000)
) Engine = InnoDB;

create table feedback(
codigo int primary key auto_increment not null,
cnpj varchar(20),
feedbackcliente varchar(5000)
) Engine = InnoDB;

select * from usuario;
select * from formulario;
select * from feedback;
select * from chat;

