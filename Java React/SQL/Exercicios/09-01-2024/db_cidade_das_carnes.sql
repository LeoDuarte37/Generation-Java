CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categorias (
	id BIGINT AUTO_INCREMENT,
    categoria VARCHAR(25) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(25) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    preco DECIMAL(6,2) NOT NULL,
    data_validade DATE NOT NULL,
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categorias (id)
);

SELECT * FROM tb_categorias;
SELECT * FROM tb_produtos;
    
INSERT INTO tb_categorias (categoria, descricao) VALUES
("Carne Bovina", "Derivada do boi"),
("Carne Suína", "Derivada do porco"),
("Carne de peixe", "Derivada do peixe"),
("Carne de frango", "Derivada da galinha"),
("Exóticas", "Derivadas de animais silvestres ou de caça");

INSERT INTO tb_produtos (nome, descricao, preco, data_validade, categoria_id) VALUES
("Salmão", "Peixe da família Salmonidae", 47, "2024-04-08", 3),
("Contra filé", "Parte traseira do boi", 18, "2024-08-19", 1),
("Mignon", "Parte traseira do porco", 50, "2026-08-02", 2),
("Bacalhau", "Peixe da família Gadidae", 82.5, "2024-10-15", 3),
("Costela", "Parte inferior do porco", 45, "2025-02-10", 2),
("Chuleta", "Carne macia; parte superior da rês", 22, "2024-11-05", 1),
("Frango", "Frango assado", 36, "2026-05-20", 4),
("Peito de frango", "Peito de frango assado", 15, "2025-08-30", 4),
("Fraldinha", "Entre a parte traseira e a costela do boi", 30, "2026-05-20", 1);

SELECT nome, tb_produtos.descricao, preco, data_validade, tb_categorias.categoria
FROM tb_produtos INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id
WHERE preco > 50;

SELECT nome, tb_produtos.descricao, preco, data_validade, tb_categorias.categoria
FROM tb_produtos INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id
WHERE preco > 50 AND preco < 150;

SELECT nome, tb_produtos.descricao, preco, data_validade, tb_categorias.categoria
FROM tb_produtos INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id
WHERE nome LIKE "%C%";

SELECT nome, tb_produtos.descricao, preco, data_validade, tb_categorias.categoria, tb_categorias.descricao
FROM tb_produtos INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id
WHERE tb_categorias.id = 2;

SELECT nome, tb_produtos.descricao, preco, data_validade, tb_categorias.categoria, tb_categorias.descricao
FROM tb_produtos INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id;