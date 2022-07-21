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