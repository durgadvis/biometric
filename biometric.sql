-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema biometric
-- -----------------------------------------------------
-- new schema for biometric project

-- -----------------------------------------------------
-- Schema biometric
--
-- new schema for biometric project
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `biometric` ;
USE `biometric` ;

-- -----------------------------------------------------
-- Table `biometric`.`UserDetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biometric`.`UserDetails` (
  `User_Id` INT NOT NULL,
  `User_name` VARCHAR(45) NOT NULL,
  `FingerPrint` BLOB NOT NULL,
  `Phonenumber` DECIMAL(10,0) NOT NULL,
  PRIMARY KEY (`User_Id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
