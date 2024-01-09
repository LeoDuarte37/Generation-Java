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
INSERT INTO tb_produtos (nome, quantidade, datavalidade, preco) VALUES ("maçã", 20, "2023-12-15", 5.00);
INSERT INTO tb_produtos (nome, quantidade, datavalidade, preco) VALUES ("laranja", 50, "2023-12-15", 10.00);
INSERT INTO tb_produtos (nome, quantidade, datavalidade, preco) VALUES ("pêra", 500, "2023-12-15", 2.99);

-- Visualizar registros de todas as colunas da tabela 
SELECT * FROM tb_produtos;

-- Visualizar registros das colunas nome e preco da tabela 
SELECT nome, preco FROM tb_produtos;

-- Visualizar registros mais especificos da tabela 
SELECT * FROM tb_produtos WHERE id = 3;
SELECT * FROM tb_produtos WHERE preco < 8.00;
SELECT * FROM tb_produtos WHERE preco < 8.00 AND quantidade < 80;

-- Deletando registros 
DELETE FROM tb_produtos WHERE id = 2;

-- Modificando e adicionando colunas a tabela produtos
ALTER TABLE tb_produtos MODIFY preco DECIMAL(6,2);
ALTER TABLE tb_produtos ADD descricao VARCHAR(255);

-- Trava de segurança para o WHERE
SET SQL_SAFE_UPDATES = 1;

-- Atualizações de registros 
UPDATE tb_produtos SET preco = 5.99 WHERE id = 4;
UPDATE tb_produtos SET descricao = "Tomate cereja" WHERE id = 1;
UPDATE tb_produtos SET descricao = "Uva verde" WHERE id = 3;
UPDATE tb_produtos SET descricao = "Banana prata" WHERE id = 4;
UPDATE tb_produtos SET descricao = "Maça vermelha" WHERE id = 5;
UPDATE tb_produtos SET descricao = "Laranja doce" WHERE id = 6;
UPDATE tb_produtos SET descricao = "Pêra verde" WHERE id = 7;

-- Criando tabela categorias 
CREATE TABLE tb_categorias(
	id bigint AUTO_INCREMENT PRIMARY KEY,
	descricao VARCHAR(255) NOT NULL
);

-- Inserindo registros em categorias
INSERT INTO tb_categorias (descricao) VALUES ("Frutas");
INSERT INTO tb_categorias (descricao) VALUES ("Verduras");
INSERT INTO tb_categorias (descricao) VALUES ("Legumes");
INSERT INTO tb_categorias (descricao) VALUES ("Temperos");
INSERT INTO tb_categorias (descricao) VALUES ("Ovos");
INSERT INTO tb_categorias (descricao) VALUES ('Outros');

-- Visualizando registros de categorias
SELECT * FROM tb_categorias;

-- Adicionando coluna para FK à tabela produtos
ALTER TABLE tb_produtos ADD categoriaid BIGINT;

-- Adicionando a chave estrangeira a coluna nova
ALTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_categorias 
FOREIGN KEY (categoriaid) REFERENCES tb_categorias (id);

-- Atualizando com novos registros a coluna nova
UPDATE tb_produtos SET categoriaid = 3 WHERE id = 1;
UPDATE tb_produtos SET categoriaid = 1 WHERE id = 7;
UPDATE tb_produtos SET categoriaid = 1 WHERE id = 3;
UPDATE tb_produtos SET categoriaid = 1 WHERE id = 4;
UPDATE tb_produtos SET categoriaid = 1 WHERE id = 5;
UPDATE tb_produtos SET categoriaid = 1 WHERE id = 6;

-- SELECT em ordem crescente
SELECT * FROM tb_produtos ORDER BY nome ASC;

-- SELECT em ordem decrescente
SELECT * FROM tb_produtos ORDER BY nome DESC;

-- SELECT com IN para consultar valores iguais a 5, 10, e 15 reais
SELECT * FROM tb_produtos WHERE preco IN (5.00, 10.00, 15.00);

-- SELECT com BETWEEN para procurar valores entre 5 e 15 reais
SELECT * FROM tb_produtos WHERE preco BETWEEN 5.00 AND 15.00;


## Operações matemáticas
SELECT AVG(Preco) AS Media FROM tb_produtos;

-- COUNT(atributo)	Conta quantas linhas não nulas um atributo possui. COUNT(*) indica o número de linhas da tabela.
-- AVG(atributo)	Calcula a média dos valores de um atributo.
-- SUM(atributo)	Calcula a soma dos valores de um atributo.
-- MAX(atributo)	Encontra o maior valor nas linhas de um atributo.
-- MIN(atributo)	Encontra o menor valor nas linhas de um atributo.


## Relacionamento entre tabelas: JOIN

-- INNER JOIN		Trará só as linhas que sejam comuns nas 2 tabelas, associadas pelas Chaves Primária e Estrangeira
SELECT nome, preco, quantidade, tb_categorias.descricao
FROM tb_produtos INNER JOIN tb_categorias 
ON tb_produtos.categoriaid = tb_categorias.id;

## OBS: SE HOUVER COLUNAS COM NOMES IGUAIS, TERÁ QUE ESPECIFICAR COM O NOME DA TABELA E O NOME DA COLUNA!!
## Exemplo: tb_produtos.nome, tb_categorias.nome...

-- LEFT JOIN 		Além das linhas que são comuns nas 2 tabelas, também trará os dados não associados da tabela do lado esquerdo
SELECT nome, preco, quantidade, tb_categorias.descricao
FROM tb_produtos LEFT JOIN tb_categorias 
ON tb_produtos.categoriaid = tb_categorias.id;

-- RIGHT JOIN 		Além das linhas que são comuns nas 2 tabelas, também trará os dados não associados da tabela do lado direito
SELECT nome, preco, quantidade, tb_categorias.descricao
FROM tb_produtos RIGHT JOIN tb_categorias 
ON tb_produtos.categoriaid = tb_categorias.id;

## INNER JOIN com agrupamento
## Exemplo: pesquisar a média dos preços por categoria de produto
SELECT tb_categorias.descricao AVG (preco) Preço_Médio
FROM tb_produtos INNER JOIN tb_categorias 
ON tb_categorias.id = tb_produtos.categoriaid
GROUP BY tb_categorias.descricao;	-- Clausula GROUP BY, indicamos por qual atributo queremos agrupar os dados.

## INNER JOIN com filtros WHERE e AND
## Exemplo: filtrar produtos da categoria frutas com o valor menor que 6 reais
SELECT nome, preco, quantidade, tb_categorias.descricao
FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.categoriaid = tb_categorias.id
WHERE categoriaid = 1 AND preco < 6;
