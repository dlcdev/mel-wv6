use movies_db;

select *
from movies;
-- 1. Adicione um filme à tablea de filmes
insert into movies (title, rating, awards, release_date, length, genre_id)
values ('Matrix 1', 9.5, 8,  DATE '1999-03-31', 190, 5);

-- 2 Adicione um gênero à tabela de gêneros
select * from genres;
insert into genres (created_at, name, ranking, active)
value (now(), 'Comédia romântica', 14, 1);

