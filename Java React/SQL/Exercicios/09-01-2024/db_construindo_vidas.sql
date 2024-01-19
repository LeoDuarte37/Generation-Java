CREATE DATABASE db_construindo_vidas;

USE db_construindo_vidas;

CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    descricao VARCHAR(255),
    PRIMARY KEY(id)
);

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    preco DECIMAL(6,2) NOT NULL, 
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);

SELECT * FROM tb_categorias;
SELECT * FROM tb_produtos;

INSERT INTO tb_categorias(nome, descricao) VALUES
("Naturais", "Derivados da natureza"),
("Artificiais", "Derivados de processos industriais"),
("Combinados", "Obtidos da combinação entre materiais naturais e artificiais"),
("Vedação", "Servem para isolar e fechar ambientes"),
("Proteção", "Proteger e aumentar a durabilidade e a vida útil da edificação");

INSERT INTO tb_produtos(nome, descricao, preco, categoria_id) VALUES
("Vidro temperado", "Para box, portas, movéis", 180, 4),
("Cimento", "Elaborar o concreto, assentar blocos", 34, 3),
("Tinta vermelha", "Pintura", 15, 5),
("Areia", "Mistura para desenvolver concretos e argamassas", 5, 1),
("Pedra", "Mistura para desenvolver concretos e argamassas", 4, 1),
("Tinta branca", "Pintura", 15, 5),
("Tijolo", "Construção de bases", 20, 2),
("Telhas", "Construção de telhados", 18, 2);

SELECT * FROM tb_produtos WHERE preco > 100;

SELECT * FROM tb_produtos WHERE preco > 70 AND preco < 150;

SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT tb_produtos.id, tb_produtos.nome, tb_produtos.descricao, preco, categoria_id, tb_categorias.nome, tb_categorias.descricao 
FROM tb_produtos INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id;

SELECT tb_produtos.id, tb_produtos.nome, tb_produtos.descricao, preco, categoria_id, tb_categorias.nome, tb_categorias.descricao
FROM tb_produtos INNER JOIN tb_categorias
ON categoria_id = tb_categorias.id
WHERE tb_categorias.id = 2;



