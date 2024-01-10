CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

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
("Cosméticos", "Produtos de beleza"),
("Higiene", "Cuidado pessoal"),
("Sem tarja", "Remédio vendido sem prescrição médica"),
("Tarja Vermelha", "Remédio de risco intermediário. Precisa de prescrição médica"),
("Tarja preta", "Remédio de grande risco! Precisa de prescriçao médica.");

INSERT INTO tb_produtos (nome, descricao, preco, data_validade, categoria_id) VALUES
("Dipirona", "Remédio para dor de cabeça", 10, "2024-04-08", 3),
("Creme de cabelo", "Creme para finalização", 18, "2024-08-19", 1),
("Ibuprofeno", "Remédio anti-inflamatório", 9, "2026-08-02", 3),
("Tryptanol", "Remédio antidrepessivo", 19, "2024-10-15", 4),
("Shampoo", "Produto para limpeza capilar", 8, "2025-02-10", 2),
("Papel Higienico", "Produto para higiene", 14, "2024-11-05", 2),
("Ritalina", "Remédio para tratamento de TDAH", 10, "2026-05-20", 5),
("Protetor solar", "Creme para proteção da pele", 10, "2025-08-30", 1),
("Biomag", "Remédio para tratamento de gerenciamento de peso", 70, "2026-05-20", 5);

SELECT nome, tb_produtos.descricao, preco, data_validade, tb_categorias.categoria
FROM tb_produtos INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id
WHERE preco > 50;

SELECT nome, tb_produtos.descricao, preco, data_validade, tb_categorias.categoria
FROM tb_produtos INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id
WHERE preco > 5 AND preco < 60;

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

    