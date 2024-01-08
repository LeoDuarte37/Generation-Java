-- Criação de banco de dados
CREATE DATABASE db_estoque;

-- Indicando uso de banco de dados
USE db_estoque;

-- Criação de tabela
CREATE TABLE tb_marcas (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(20) NOT NULL,
    ativo BOOLEAN,
    PRIMARY KEY(id)
);

-- Inserção de registros
INSERT INTO tb_marcas(nome, ativo) VALUES ("Nike", TRUE);
INSERT INTO tb_marcas(nome, ativo) VALUES ("Adidas", TRUE);
INSERT INTO tb_marcas(nome, ativo) VALUES ("Vans", TRUE);
INSERT INTO tb_marcas(nome, ativo) VALUES ("All Star", TRUE);

-- Visualizar registros de todas as colunas da tabela 
SELECT * FROM tb_marcas;

-- Nova tabela com chave estrangeira (chave primária de tb_marcas)
CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    preco DECIMAL,
    marca_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (marca_id) REFERENCES tb_marcas (id)
);

SELECT * FROM tb_produtos;

-- Inserção de registros
INSERT INTO tb_produtos (nome, preco, marca_id) VALUES ("Tênis", 199.90, 1);

-- Atualizando o preco, adicionando dois números após a virgula
ALTER TABLE tb_produtos MODIFY COLUMN preco DECIMAL(6, 2);

-- Novos registros com a atualização de preço
INSERT INTO tb_produtos (nome, preco, marca_id) VALUES ("Calça", 80.90, 2);
INSERT INTO tb_produtos (nome, preco, marca_id) VALUES ("Camisa", 49.99, 3);

-- Busca de registros por string usando o LIKE
SELECT * FROM tb_produtos WHERE nome LIKE '%Cal%';
