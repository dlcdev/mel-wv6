select * from actors;

create temporary table actors_names_temp
select first_name, last_name
from actors
where rating > 5;

select * from actors_names_temp