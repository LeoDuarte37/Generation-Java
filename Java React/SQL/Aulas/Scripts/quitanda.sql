-- Criação de banco de dados
CREATE DATABASE db_quitanda;

-- Indicando uso de banco de dados
USE db_quitanda;

-- Criação de tabela
CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT,
    datavalidade DATE,
    preco DECIMAL NOT NULL,
    PRIMARY KEY (id)
);

-- Inserção de registros
INSERT INTO tb_produtos (nome, quantidade, datavalidade, preco) VALUES ("tomate", 100, "2023-05-23", 8.00);
INSERT INTO tb_produtos (nome, quantidade, datavalidade, preco) VALUES ("Uva", 50, "2023-05-07", 6.00);
INSERT INTO tb_produtos (nome, quantidade, datavalidade, preco) VALUES ("Banana", 20, "2023-05-15", 5.00);

-- Visualizar registros de todas as colunas da tabela 
SELECT * FROM tb_produtos;

-- Visualizar registros das colunas nome e preco da tabela 
SELECT nome, preco FROM tb_produtos;

-- Visualizar registros mais especificos da tabela 
SELECT * FROM tb_produtos WHERE id = 3;
SELECT * FROM tb_produtos WHERE preco < 8.00;
SELECT * FROM tb_produtos WHERE preco < 8.00 AND quantidade < 80;

DELETE FROM tb_produtos WHERE id = 2;

ALTER TABLE tb_produtos MODIFY preco DECIMAL(6,2);

ALTER TABLE tb_produtos ADD descricao VARCHAR(255);

SET SQL_SAFE_UPDATES = 1;

UPDATE tb_produtos SET preco = 5.99 WHERE id = 4;
UPDATE tb_produtos SET descricao = "Tomate cereja" WHERE id = 1;
UPDATE tb_produtos SET descricao = "Uva verde" WHERE id = 3;
UPDATE tb_produtos SET descricao = "Banana prata" WHERE id = 4;
