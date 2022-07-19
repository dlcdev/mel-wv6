-- 1. como é chamado um JOIN em um banco de dados e para que é usado
-- R: é chamado de combinação de tabelas ou interserção,
-- È usado para obter várias tabelas relacionadas

-- 2. Explique os tipos de Join
-- r:.
-- inner join/interserção combina dados de duas tabelas
-- left join/diferença de a-b, ele combina os dados da tabela mais a esquerda
-- right join/diferença de b-a ele combina os dados da tabela mais a direira
-- union combina os todos os dados da tabela a e b

-- 2. Para que serve o GOUP BY:
-- R:. agrupamento de resultados de acordo com as colunas indicadas

-- 3. Para que serve o having?
-- R:. são condições em grupos de registros, muito semelhante ao where
-- é usado para incluir condições com funções SQL

use movies_db;

select *
from movies
         join actors on actors.favorite_movie_id;

select m.id, m.title, a.first_name
from movies m
         left join actors a on a.favorite_movie_id;

select m.id, m.title, a.first_name
from movies m
         right join actors a on a.favorite_movie_id;


-- Segunda parte
-- 1. Mostrar o título e o nome do gênero de todas as séries

select s.title Titulo, g.name Gênero
from series s
         join genres g on s.genre_id = g.id;

-- 2. Mostrar o título dos episódios, o nome e sobrenome dos atores que trabalhaem em
-- cada delas possui

select e.title Titulos, a.first_name Name, a.last_name Last_name
from episodes e
         join actors a
         join actor_episode ae on a.id = ae.actor_id;

-- 3. Mostrar o título de todas as séries e o número total de temporadas que cada uma
-- delas possui.

select s.title Titulo, max(s2.number) Total_Seasons
from series s
         join seasons s2 on s.id = s2.serie_id
group by s.title
order by max(s2.number);

-- 4. Mostrar o nome de todos os gêneros e o número total de filmes de cada um,
-- desde que seja maior ou igal a 3.

select g.name, sum(m.title) from genres g
    inner join movies m on g.id = m.id
group by g.name, m.title