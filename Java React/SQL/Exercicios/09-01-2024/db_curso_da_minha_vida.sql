CREATE DATABASE db_curso_da_minha_vida;

USE db_curso_da_minha_vida;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    area VARCHAR(30) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE tb_curso(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    preco DECIMAL(6,2) NOT NULL,
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

SELECT * FROM tb_categoria;
SELECT * FROM tb_curso;

INSERT INTO tb_categoria(nome, area) VALUES
("Programação", "Tecnologia da Informação"),
("Desenho", "Arte"),
("Idioma", "Letras"),
("Cozinha", "Gastronomia"),
("Intrumento", "Música");

INSERT INTO tb_curso(nome, descricao, preco, categoria_id) VALUES
("Java", "Linguagem back-end", 120, 1),
("MySQL", "Linguagem de banco de dados", 200, 1),
("Inglês", "Inglês para comunicação", 400, 3),
("Guitarra", "Teoria musical", 80, 5),
("Desenhos Cartoons", "Introdução ao desenho cartoon", 150, 2),
("Pintura em quadros", "Técnicas de pintura com tinta", 600, 2),
("Bateria", "Teoria musical", 100, 5),
("React", "Linguagem front-end", 700, 1);

SELECT * FROM tb_curso WHERE preco > 500;

SELECT * FROM tb_curso WHERE preco > 600 AND preco < 1000;

SELECT * FROM tb_curso WHERE nome LIKE "%J%";

SELECT tb_curso.id, tb_curso.nome, descricao, preco, categoria_id, tb_categoria.nome, area 
FROM tb_curso INNER JOIN tb_categoria
ON categoria_id = tb_categoria.id;

SELECT tb_curso.id, tb_curso.nome, descricao, preco, categoria_id, tb_categoria.nome, area 
FROM tb_curso INNER JOIN tb_categoria
ON categoria_id = tb_categoria.id
WHERE tb_categoria.id = 1;
