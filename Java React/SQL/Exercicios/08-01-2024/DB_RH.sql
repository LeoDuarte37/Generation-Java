CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_colaboradores (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(40) NOT NULL,
    dataNasc date NOT NULL,
    cpf BIGINT NOT NULL,
    salario DECIMAL(6,2) NOT NULL,
    ativo BOOLEAN NOT NULL,
    PRIMARY KEY (id)
);

SELECT * FROM tb_colaboradores;

INSERT INTO tb_colaboradores (nome, dataNasc, cpf, salario, ativo) 
VALUES ("Léo Duarte", "2004-11-05", 1234567890, 4000.00, true); 

INSERT INTO tb_colaboradores (nome, dataNasc, cpf, salario, ativo) 
VALUES ("Carol Ferreira", "2005-04-08", 1234567890, 6000.00, true);

INSERT INTO tb_colaboradores (nome, dataNasc, cpf, salario, ativo) 
VALUES ("Irineu", "2002-01-05", 1234567890, 2300.00, true);

INSERT INTO tb_colaboradores (nome, dataNasc, cpf, salario, ativo) 
VALUES ("Josefá", "1998-11-22", 1234567890, 1500.00, true);

INSERT INTO tb_colaboradores (nome, dataNasc, cpf, salario, ativo) 
VALUES ("Reginalda", "1991-08-03", 1234567890, 8000.00, true);

INSERT INTO tb_colaboradores (nome, dataNasc, cpf, salario, ativo) 
VALUES ("Guilherme", "2000-01-18", 1234567890, 1900.00, true);

SELECT nome FROM tb_colaboradores WHERE salario > 2000;
SELECT nome FROM tb_colaboradores WHERE salario < 2000;

UPDATE tb_colaboradores SET ativo = FALSE WHERE id = 5;



