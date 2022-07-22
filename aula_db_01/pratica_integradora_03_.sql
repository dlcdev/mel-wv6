# use biblioteca_db;
#
# -- MySQL Workbench Forward Engineering
#
# SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0;
# SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0;
# SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE =
#         'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
#
# -- -----------------------------------------------------
# -- Schema biblioteca_db
# -- -----------------------------------------------------
#
# -- -----------------------------------------------------
# -- Schema biblioteca_db
# -- -----------------------------------------------------
# CREATE SCHEMA IF NOT EXISTS `biblioteca_db` DEFAULT CHARACTER SET utf8;
# -- -----------------------------------------------------
# -- Schema biblioteca_db
# -- -----------------------------------------------------
# USE `biblioteca_db`;
#
# -- -----------------------------------------------------
# -- Table `Livro`
# -- -----------------------------------------------------
# CREATE TABLE IF NOT EXISTS `Livro`
# (
#     `id_livro` INT         NOT NULL AUTO_INCREMENT,
#     `titulo`   VARCHAR(45) NULL,
#     `editora`  VARCHAR(45) NULL,
#     `area`     VARCHAR(45) NULL,
#     PRIMARY KEY (`id_livro`)
# )
#     ENGINE = InnoDB;
#
#
# -- -----------------------------------------------------
# -- Table `Aluno`
# -- -----------------------------------------------------
# CREATE TABLE IF NOT EXISTS `Aluno`
# (
#     `id_aluno`   INT         NOT NULL AUTO_INCREMENT,
#     `nome`       VARCHAR(45) NULL,
#     `sobre_nome` VARCHAR(45) NULL,
#     `endereco`   VARCHAR(45) NULL,
#     `carreira`   VARCHAR(45) NULL,
#     `idade`      INT         NULL,
#     PRIMARY KEY (`id_aluno`)
# )
#     ENGINE = InnoDB;
#
#
# -- -----------------------------------------------------
# -- Table `Emprestimo`
# -- -----------------------------------------------------
# CREATE TABLE IF NOT EXISTS `Emprestimo`
# (
#     `id_leitor`       INT         NOT NULL AUTO_INCREMENT,
#     `data_emprestimo` VARCHAR(45) NULL,
#     `data_devolucao`  VARCHAR(45) NULL,
#     `retornou`        TINYINT     NULL,
#     `Livro_id_livro`  INT         NOT NULL,
#     `Aluno_id_aluno`  INT         NOT NULL,
#     PRIMARY KEY (`id_leitor`, `Livro_id_livro`, `Aluno_id_aluno`),
#     INDEX `fk_Emprestimo_Livro_idx` (`Livro_id_livro` ASC) VISIBLE,
#     INDEX `fk_Emprestimo_Aluno1_idx` (`Aluno_id_aluno` ASC) VISIBLE,
#     CONSTRAINT `fk_Emprestimo_Livro`
#         FOREIGN KEY (`Livro_id_livro`)
#             REFERENCES `Livro` (`id_livro`)
#             ON DELETE NO ACTION
#             ON UPDATE NO ACTION,
#     CONSTRAINT `fk_Emprestimo_Aluno1`
#         FOREIGN KEY (`Aluno_id_aluno`)
#             REFERENCES `Aluno` (`id_aluno`)
#             ON DELETE NO ACTION
#             ON UPDATE NO ACTION
# )
#     ENGINE = InnoDB;
#
#
# -- -----------------------------------------------------
# -- Table `Autor`
# -- -----------------------------------------------------
# CREATE TABLE IF NOT EXISTS `Autor`
# (
#     `idAutor`       INT         NOT NULL AUTO_INCREMENT,
#     `nome`          VARCHAR(45) NULL,
#     `nacionalidade` VARCHAR(45) NULL,
#     PRIMARY KEY (`idAutor`)
# )
#     ENGINE = InnoDB;
#
#
# -- -----------------------------------------------------
# -- Table `LivroAutor`
# -- -----------------------------------------------------
# CREATE TABLE IF NOT EXISTS `LivroAutor`
# (
#     `Livro_id_livro` INT NOT NULL,
#     `Autor_idAutor`  INT NOT NULL,
#     PRIMARY KEY (`Livro_id_livro`, `Autor_idAutor`),
#     INDEX `fk_LivroAutor_Autor1_idx` (`Autor_idAutor` ASC) VISIBLE,
#     CONSTRAINT `fk_LivroAutor_Livro1`
#         FOREIGN KEY (`Livro_id_livro`)
#             REFERENCES `Livro` (`id_livro`)
#             ON DELETE NO ACTION
#             ON UPDATE NO ACTION,
#     CONSTRAINT `fk_LivroAutor_Autor1`
#         FOREIGN KEY (`Autor_idAutor`)
#             REFERENCES `Autor` (`idAutor`)
#             ON DELETE NO ACTION
#             ON UPDATE NO ACTION
# )
#     ENGINE = InnoDB;
#
#
# SET SQL_MODE = @OLD_SQL_MODE;
# SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS;
# SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS;

# auto {
#
#
# }

# INSERT INTO aluno
# VALUES (1, 'joão', 'silva', 'Rua das Flores', 'arquitetura', 23);
# INSERT INTO aluno
# VALUES (2, 'Joana', 'herrera', 'Rua das Flores', 'ciência da computação', 20);
# INSERT INTO aluno
# VALUES (3, 'Jose', 'vasconcelos', 'Rua das Flores', 'ciência da computação', 21);
# INSERT INTO aluno
# VALUES (4, 'Pedro', 'flores', 'Rua das Flores', 'ciência da computação', 21);
# INSERT INTO aluno
# VALUES (5, 'Ana', 'souza', 'Rua das Flores', 'ciência da computação', 18);
# INSERT INTO aluno
# VALUES (6, 'Victor', 'cruz', 'Rua das Flores', 'arquitetura', 25);
# INSERT INTO aluno
# VALUES (7, 'Andrea', 'leal', 'Rua das Flores', 'arquitetura', 29);
# INSERT INTO aluno
# VALUES (8, 'Carlos', 'valin', 'Rua das Flores', 'astronomia', 25);
# INSERT INTO aluno
# VALUES (9, 'Maria', 'almeida', 'Rua das Flores', 'astronomia', 19);
# INSERT INTO aluno
# VALUES (10, 'Bruno', 'oliveira', 'Rua das Flores', 'astronomia', 19);
# INSERT INTO autor
# VALUES (1, 'Victor cruz', 'brasileiro');
# INSERT INTO autor
# VALUES (2, 'Andrea leal', 'brasileiro');
# INSERT INTO autor
# VALUES (3, 'Carlos valin', 'argentino');
# INSERT INTO autor
# VALUES (4, 'Maria almeida', 'argentino');
# INSERT INTO autor
# VALUES (5, 'Bruno oliveira', 'brasileiro');
# INSERT INTO livro
# VALUES (1, 'Arquitetura da informação pervasiva', 'UNESP', 'informática');
# INSERT INTO livro
# VALUES (2, 'Scan for MARC', 'UNESP', 'informática');
# INSERT INTO livro
# VALUES (3, 'O arquivo e a informação arquivística', 'UNESP', 'informática');
# INSERT INTO livro
# VALUES (4, 'Tecnologia e gestão pública municipal', 'UNESP', 'informática');
# INSERT INTO livro
# VALUES (5, 'Encontrabilidade da informação', 'UNESP', 'informática');
# INSERT INTO emprestimo (Aluno_id_aluno, Livro_id_livro, data_emprestimo, data_devolucao, retornou)
# VALUES (1, 1, '2022-01-07', '2022-01-17', true);
# INSERT INTO emprestimo (Aluno_id_aluno, Livro_id_livro, data_emprestimo, data_devolucao, retornou)
# VALUES (8, 2, '2022-07-01', '2022-01-17', true);
# INSERT INTO emprestimo (Aluno_id_aluno, Livro_id_livro, data_emprestimo, data_devolucao, retornou)
# VALUES (7, 5, '2022-07-11', '2022-01-17', true);
# INSERT INTO emprestimo (Aluno_id_aluno, Livro_id_livro, data_emprestimo, data_devolucao, retornou)
# VALUES (4, 2, '2022-07-07', '2022-01-17', true);
# INSERT INTO emprestimo (Aluno_id_aluno, Livro_id_livro, data_emprestimo, data_devolucao, retornou)
# VALUES (3, 1, '2022-06-14', '2022-01-17', true);
# INSERT INTO livroautor
# VALUES (1, 1);
# INSERT INTO livroautor
# VALUES (1, 2);
# INSERT INTO livroautor
# VALUES (1, 3);
# INSERT INTO livroautor
# VALUES (2, 4);
# INSERT INTO livroautor
# VALUES (2, 5);

-- 1. Listar os dados dos autores

select *
from autor;

-- 2. Listar nome e didade dos alunos

select nome, idade
from aluno;

-- 3. Quais alunos pertencem à carreira de informática

select *
from aluno
where carreira = 'ciência da computação';

-- 4. Quais autores são de nacionalidade francesa ou italiana
select *
from Autor
where nacionalidade in ('francesa', 'italiana');

-- 5. Que livros não são da área da internet

select *
from livro
where area not like ('internet');


-- 6. Listar os livros da editora Salamadra.
select *
from Livro
where editora in ('salamandra');

-- 7. Listar os dados dos alunos cuja idade é maior que a média.
select nome, sobre_nome, avg(idade) Media
from Aluno
group by nome, sobre_nome, idade;



select *
from aluno/;

-- 8. Listar os nomes dos alunos cujo sobrenome começa com a letra G.
select nome, sobre_nome
from Aluno

where sobre_nome like ('g%')




