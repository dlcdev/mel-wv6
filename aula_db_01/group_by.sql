use movies_db;
-- group by

select count(*)
from series;

-- quantas temporadas estão cadastradas
select count(*)
from seasons;

-- quantas temporadas existem para cada série
select series.title, count(*) as Temporadas
from seasons
         inner join series on series.id = seasons.serie_id
group by series.id;

# select s.title Titulo, max(s2.number) Total_Seasons
# from series s
#          join seasons s2 on s.id = s2.serie_id
# group by s.title
# order by max(s2.number);

-- quantas temporadas existem para a série The Walking Dead""
select series.title, count(*) as Temporadas
from seasons
         inner join series on series.id = seasons.serie_id
where series.title = 'The Walking Dead'
group by series.id;

-- quais séries tem mais que 5 temporadas
select series.title, count(*) as Temporadas
from seasons
         inner join series on series.id = seasons.serie_id
group by series.id
having Temporadas > 5;

-- quais as 3 sereis com maior número de temporadas
select series.title, count(*) as Temporadas
from seasons
         inner join series on series.id = seasons.serie_id
group by series.id
order by Temporadas desc
limit 3;

-- subconsultas

-- quais os nomes dos atores que trabalham em filmes com avaliação maior
-- que 9.1
-- 1. consulta inter: selecionar os id´s dos atores que trabalharam em filmes com avaliação maior que 9.1
-- 2. a partir da respota anterior, listar os atores cujo id esta na lista gerada no passo 1
select *
from actors
where id in
      (select actor_movie.actor_id
       from movies
                inner join actor_movie on movies.id = actor_movie.id
       where rating > 9.1)
order by first_name;

-- outra forma de resolver usando join

select first_name, last_name, actors.rating
from movies
         inner join actor_movie on movies.id = actor_movie.movie_id
         inner join actors on actors.id = actor_movie.actor_id
where movies.rating > 9.1
order by first_name;

-- outra forma de resolver usando join ordenador por avaliação do ator

select first_name, last_name, actors.rating as 'Nota do ator'
from movies
         inner join actor_movie on movies.id = actor_movie.movie_id
         inner join actors on actors.id = actor_movie.actor_id
where movies.rating > 9.1
order by actors.rating desc

-- quais são os filmes que não é o filme preferido de nenhum ator
select movies.title
from movies
where not exists
    (select actors.first_name from actors where favorite_movie_id = movies.id);