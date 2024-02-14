drop database restaurante;
create database if not exists restaurante;
use restaurante;
create table restaurante(
codigo int auto_increment primary key,
preco decimal(4,2),
modelo varchar(50),
categoria varchar(50)
);

drop database historico;
create database if not exists historico;
use historico;
create table historico(
codigo int auto_increment primary key,
cliente varchar(100),
mesa int,
pedido varchar(100),
quantidade int,
custo decimal(4,2),
valor decimal(4,2),
pagamento varchar(12)

);

drop database funcionarios;
create database if not exists funcionarios;
use funcionarios;
create table funcionarios(
codigo int auto_increment primary key,
nome varchar(100),
cpf varchar(11),
nascimento int,
nivel int,
registro int
);
