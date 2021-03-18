-- -----------------------------------------------------
-- Table "Categories"
-- -----------------------------------------------------
CREATE TABLE  categories (
  "id" SERIAL NOT NULL,
  "description" VARCHAR(45) NOT NULL,
  "state" BOOLEAN NOT NULL,
  PRIMARY KEY ("id"));
