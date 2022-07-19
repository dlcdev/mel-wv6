use movies_db;


select * from genres;
select * from movies;

select count(*) from movies;
select count(*) from genres;

select * from movies, genres;

select count(*) from movies, genres
where movies.genre_id = genres.id;

select title from movies where genre_id = null;

select * from movies join genres
on movies.genre_id = genres.id;

-- liste os filmes (que possuem classificação) e seus nomes de classificação

select  *
from movies left join genres on movies.genre_id = genres.id;

-- liste todas as classificações e os filmes correspondentes

select  m.title, m.genre_id
from movies m right join genres on m.genre_id = genres.id;