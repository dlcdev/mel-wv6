use bd_meli01

-- Mostrar todos os registros da tabela de filmes.
select * from movies_db;

-- Mostrar o nome, sobrenome e classificação de todos os atores.

select first_name, last_name, rating from actors;

-- Mostrar o titulo de todas as séries e use alias para que tanto o nome da tabela quanto o campo estejam em Portugês

select séries.title Título
from series as séries;

-- Mostrar o nome e sobrenome dos atores cuja classificação é superior a 7,5.

select first_name, last_name, rating from actors
where rating > 7.5

-- Mostrar o título dos filmes, a classificação e os prêmios dos filmes com classificação
-- superior a 7,5 e com mais de dois prêmios.

select title, rating, awards from movies
where rating > 7.5 and awards > 2;

-- Mostrar o título dos filmes e a classificação ordenados por classificação em ordem
-- crescente.

SELECT title, rating
FROM movies
order by rating;

SELECT title, rating
FROM movies
order by rating desc;

-- Mostrar os títulos dos três primeiros filmes no banco de dados.

select title from movies
limit 3;

-- Mostrar os 5 melhores filmes com a classificação mais alta.
select title, rating
from movies
order by rating desc
limit 5

-- Listar os 10 primeiros atores.
select first_name, last_name
from actors
limit 10;

-- Mostrar o título e a classificação de todos os filmes cujo título é Toy Story.
select title, rating
from movies
where title like 'Toy Story';

-- Mostrar todos os atores cujos nomes começam com Sam.

select first_name, last_name from actors
where first_name like '%sam%';

-- Mostrar o título dos filmes que saíram entre 2004 e 2008.
select title, release_date
from movies
# where year(release_date) >= 2004 and year(release_date) <= 2008;
where year(release_date) between 2004 and 2008;

-- Mostrar o título dos filmes com classificação superior a 3, com mais de 1 prêmio e
-- com data de lançamento entre 1988 e 2009. Ordenar os resultados por
-- classificação.

select title, rating, awards
from movies
where rating > 3
and awards > 1
and year(release_date) between 1988 and 2009
order by rating

-- insere registro
insert into actors values(null, null, null, 'Armando', 'Santos', 5.7, 1);

-- atualiza sobrenome do ator
update actors
set last_name = 'Ferreira'
where id = 50;

-- deleta ator
delete from actors
where id = 51;
