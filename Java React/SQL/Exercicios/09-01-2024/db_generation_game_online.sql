CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes (
	id BIGINT AUTO_INCREMENT,
    classe VARCHAR(22) NOT NULL,
    arma VARCHAR(22) NOT NULL,
    PRIMARY KEY(id)
);

drop table tb_classes;

CREATE TABLE tb_personagens (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    raca VARCHAR(22) NOT NULL,
    classe_id BIGINT NOT NULL,
    nivel BIGINT NOT NULL, 
    poder DECIMAL(7,1) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(classe_id) REFERENCES tb_classes(id)
);

SELECT * FROM tb_classes;
SELECT * FROM tb_personagens;

INSERT INTO tb_classes (classe, arma) VALUES 
("Bruxo(a)", "Varinha"),
("Cavaleiro(a)", "Espada"),
("Monge", "Bastão"),
("Mago", "Livro"),
("Arqueiro(a)", "Arco e flecha");

INSERT INTO tb_personagens (nome, raca, classe_id, nivel, poder) VALUES
("Siegh Hart", "Demonio", 2, 18, 450),
("Lupus", "Haros", 5, 30, 600),
("Sirius Black", "Humano", 1, 60, 1000),
("Aang", "Humano", 3, 25, 300),
("Robin Hood", "Humano", 5, 50, 420),
("Garen", "Humano", 2, 100, 1500),
("Dumbledore", "Humano", 4, 80, 3000),
("Lass", "Mestiço", 2, 35, 270);

SELECT nome, poder FROM tb_personagens WHERE poder > 2000;
SELECT nome, poder FROM tb_personagens WHERE poder > 1000 AND poder < 2000;
SELECT nome, poder FROM tb_personagens WHERE nome LIKE "%C%";

SELECT id, nome, raca, classe_id, tb_classes.classe, tb_classes.arma, nivel, poder 
FROM tb_personagens INNER JOIN tb_classes 
ON classe_id = tb_classes.id;

SELECT id, nome, raca, classe_id, tb_classes.classe, tb_classes.arma, nivel, poder 
FROM tb_personagens INNER JOIN tb_classes 
ON classe_id = tb_classes.id
WHERE tb_classes.id = 2;

