# USE company_db;
#
# create table `company` (
#     `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
#     `cod_func` varchar(100) NOT NULL,
#     `nome` varchar(100) NOT NULL,
#     `sobrenome` varchar(100) NOT NULL,
#     `cargo` varchar(100) NOT NULL,
#     `data_alta` varchar(100) NOT NULL,
#     `salario` decimal,
#     `comissao` decimal,
#     `depto_nro` varchar(100) NOT NULL,
#     primary key (`id`),
#     KEY `departamento_foreing` (`depto_nro`)
#
#  ) AUTO_INCREMENT=1;
# #
create table `departamento`
(
    `id`          int(10) unsigned NOT NULL AUTO_INCREMENT,
    `depto_nro`   varchar(100)     NOT NULL,
    `nome_depto`  varchar(100)     NOT NULL,
    `localizacao` varchar(100)     NOT NULL,
    primary key (`id`)
) AUTO_INCREMENT = 1;
#
# LOCK TABLES `company` WRITE;
# insert into `company` values
# (1, 'E-0001', 'César', 'Piñero', 'Vendedor', 12/05/2018, 80000, 15000 , 'D-000-4'),
# (2, 'E-0002', 'Yosep', 'Kowaleski', 'Analista', 14/07/2015, 140000, 0 , 'D-000-2'),
# (3, 'E-0003', 'Mariela', 'Barrios', 'Diretor', 05/06/2014, 185000, 0 , 'D-000-3'),
# (4, 'E-0004', 'Jonathan', 'Aguilera', 'Vendedor', 03/06/2015, 85000, 10000 , 'D-000-4'),
# (5, 'E-0005', 'Daniel', 'Brezezicki', 'Vendedor', 03/03/2018, 83000, 10000 , 'D-000-4'),
# (6, 'E-0006', 'Mito', 'Barchuk', 'Presidente', 05/06/2014, 190000, 0 , 'D-000-3'),
# (7, 'E-0007', 'Emilio', 'Galarza', 'Desenvolvedor', 02/08/2014, 60000, 0 , 'D-000-1');
#
insert into `departamento`
values (1, 'D-000-1', 'Software', 'Los Tigres'),
       (2, 'D-000-2', 'Sistemas', 'Guadalupe'),
       (3, 'D-000-3', 'Contabilidade', 'La Roca'),
       (4, 'D-000-4', 'Vendas', 'Plata');


-- 1. Selecione o nome, cargo e localização dos departamentos onde os vendedores trabalham.
select c.nome, c.cargo, d.localizacao
from company c
         inner join departamento d on c.depto_nro = d.depto_nro

-- 2. Vizualize departamntos com mais de cinco funcionarios

alter table company
    add constraint unique (cod_func);

insert into `company`
values (default, 'E-0010', 'Paulinho', 'Andre', 'Vendedor', 12 / 05 / 2018, 80000, 15000, 'D-000-4');


select d.nome_depto, count(*) as 'Total de Trabalhadores'
from departamento d
         inner join company c on d.depto_nro = c.depto_nro
group by d.nome_depto
having `Total de Trabalhadores` > 5;

-- 3. Exiba o nome, salário e nome do departamento dos funcionários
-- que têm o mesmo cargo que
-- "Mito Barchuck"


select c.nome, c.salario, d.nome_depto
from company c
         inner join departamento d on c.depto_nro = d.depto_nro
where c.depto_nro like (select depto_nro
                        from company
                        where nome = 'Mito');

-- 4 Mostre os dados dos funcionarios que trabalham no departamento de contabilidade
-- ordenados por nome

select c.nome, c.sobrenome, c.salario, c.cargo, d.nome_depto
from company c
         inner join departamento d on c.depto_nro = d.depto_nro
where d.nome_depto = 'Contabilidade'
order by c.nome;

-- 5. Mostre o nome do funcionário que tem o menor salário.
select c.nome, c.sobrenome, c.salario, c.cargo
from company c
        inner join departamento d on c.depto_nro = d.depto_nro
order by c.salario
limit 1;

-- 6. Mostre os dados do funcionário que tem o maior salário no departamento 'Vendas.'

select c.nome, c.sobrenome, c.salario, c.cargo
from company c
        inner join departamento d on c.depto_nro = d.depto_nro
where d.nome_depto like 'Vendas'
order by c.salario desc
limit 1;