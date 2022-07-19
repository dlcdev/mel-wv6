use bd_meli_01;

select * from user;
drop table user;

create table user(
    id integer,
    nome varchar(100)
);


insert into user values (2 , 'Fabiana', 'e');

alter table user
add constraint primary key (id);

alter table user
add email varchar(50)

update user set email = 'marcos@email.com'
where id = 1;

update user set email = 'marcos@email.com'
where id = 2;

alter table user
add constraint unique (email);