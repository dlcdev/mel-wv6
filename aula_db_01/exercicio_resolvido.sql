-- Adicione um filme á tabela de filmes
use movies_db;
insert into movies
values (null, now(), null, 'A busca do Soldado Ryan', 10, 5, '1999-04-23', 144, 4);

-- Adicione um gênero à tabela de gênero
insert into genres values (null, now(), null, 'Classico', 13, 1);

-- Associe o filme inserido ao item 1. com gênero criado item 2
update movies set genre_id = 13, updated_at = now()
where movies.id = 22;

-- Modifique a tablea de atores para que pelo menos um ator tenha o filme adicionado
-- item 1 como favorito

-- crie uma tabela temporária da tabela filmes.

create temporary table filmes
select title, rating, awards, release_date
from movies;

select * from filmes;


-- Elimine da tabela temporária da tabela filme.

drop temporary table filmes2;
create temporary table filmes2
select title, rating, awards, release_date
from movies
where movies.awards < 5;


select * from filmes2;

-- Obtenha a lista de todos os gêneros que possuem pelo menos um filme.

select distinct name
from genres inner join movies on genres.id = movies.genre_id;


-- Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios

select first_name, last_name, movies.title from actors
inner join movies on actors.favorite_movie_id = movies.id
where movies.awards > 3;

-- crie um inddice no nome na tabela de filmes. Verifique se o indice foi criado corretamente.
create index indx_movies_title on movies(title)