-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema db_ngeeeng
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_ngeeeng
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_ngeeeng` DEFAULT CHARACTER SET utf8 ;
USE `db_ngeeeng` ;

-- -----------------------------------------------------
-- Table `db_ngeeeng`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_ngeeeng`.`user` ;

CREATE TABLE IF NOT EXISTS `db_ngeeeng`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `isDriver` TINYINT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_ngeeeng`.`driver`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_ngeeeng`.`driver` ;

CREATE TABLE IF NOT EXISTS `db_ngeeeng`.`driver` (
  `id` INT NOT NULL,
  `rating` INT NULL,
  `votes` INT NULL,
  `status` VARCHAR(255) NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `id_user`
    FOREIGN KEY (`id`)
    REFERENCES `db_ngeeeng`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_ngeeeng`.`preferred_loc`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_ngeeeng`.`preferred_loc` ;

CREATE TABLE IF NOT EXISTS `db_ngeeeng`.`preferred_loc` (
  `id` INT NOT NULL,
  `place` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`, `place`),
  CONSTRAINT `id_driver`
    FOREIGN KEY (`id`)
    REFERENCES `db_ngeeeng`.`driver` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_ngeeeng`.`order`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_ngeeeng`.`order` ;

CREATE TABLE IF NOT EXISTS `db_ngeeeng`.`order` (
  `order_id` INT NOT NULL AUTO_INCREMENT,
  `date` DATE NOT NULL,
  `origin` VARCHAR(255) NOT NULL,
  `destination` VARCHAR(255) NOT NULL,
  `rating` INT NULL,
  `comment` VARCHAR(255) NULL,
  `id_user` INT NOT NULL,
  `id_driver` INT NOT NULL,
  PRIMARY KEY (`order_id`),
  INDEX `id_driver_idx` (`id_driver` ASC),
  INDEX `id_user_idx` (`id_user` ASC),
  CONSTRAINT `id_driver_fk`
    FOREIGN KEY (`id_driver`)
    REFERENCES `db_ngeeeng`.`driver` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_user_fk`
    FOREIGN KEY (`id_user`)
    REFERENCES `db_ngeeeng`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
