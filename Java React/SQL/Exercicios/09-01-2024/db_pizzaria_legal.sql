CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias (
	id BIGINT AUTO_INCREMENT,
    categoria VARCHAR(30) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE tb_pizzas (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    ingredientes VARCHAR(255) NOT NULL,
    valor DECIMAL(5,2) NOT NULL,
    descricao VARCHAR(400) NOT NULL,
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);

SELECT * FROM tb_categorias;
SELECT * FROM tb_pizzas;
    
INSERT INTO tb_categorias (categoria, descricao) VALUES
("Salgada", "Contém: Frango, calabresa, musarrela"),
("Doce", "Contém: chocolate, doce de leite, Nutela"),
("Vegana", "Pizzas sem ingredientes que envolvam animais"),
("Ovolactovegetariana", "Pizzas apenas com ovos ou queijos"),
("Especiais", "Pizzas especiais da casa");

INSERT INTO tb_pizzas (nome, ingredientes, valor, descricao, categoria_id) VALUES
("Calabresa", "Calabresa, azeitona e cebola", 30, "Pizza salgada com calabresa, azeitona e cebola", 1),
("Musarela", "Muçarela, queijo e orégano", 30, "Pizza salgada com muçarela, queijo e orégano", 1),
("Prestígio", "Chocolate e côco", 40, "Pizza doce com chocolate e côco", 2),
("Carciofini", "Molho de tomate natural, alcachofras temperadas e orégano", 50, "Pizza vegana com tempero, orégano e tomate natural", 3),
("Quatro queijos", "Muçarela, requeijão, provolone", 53, "Pizza ovolactovegetariana com muçarela e requeijão", 4),
("Broccoli", "Queijo vegano, Molho de tomate natural, brócolis", 55, "Pizza vegana com queijo vegano, tomate natural e brócolis", 3),
("Frango com catupiry", "Frango e catupiry", 38, "Pizza salgada com frango e catupiry", 1),
("Portuguesa", "Queijo, ovo e presunto", 30, "Pizza com calabresa, azeitona e cebola", 1);

SELECT nome, ingredientes, valor FROM tb_pizzas WHERE valor > 45;
SELECT nome, ingredientes, valor FROM tb_pizzas WHERE valor > 50 AND valor < 100;

SELECT nome, ingredientes, valor FROM tb_pizzas WHERE nome LIKE "%M%";

SELECT tb_pizzas.id, nome, ingredientes, valor, tb_pizzas.descricao, categoria_id, tb_categorias.categoria, tb_categorias.descricao 
FROM tb_pizzas INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id;

SELECT tb_pizzas.id, nome, ingredientes, valor, tb_pizzas.descricao, categoria_id, tb_categorias.categoria, tb_categorias.descricao 
FROM tb_pizzas INNER JOIN tb_categorias 
ON categoria_id = tb_categorias.id
WHERE tb_categorias.id = 1;

