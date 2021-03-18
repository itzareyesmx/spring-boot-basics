-- -----------------------------------------------------
-- Table "products"
-- -----------------------------------------------------
CREATE TABLE  products (
  "id" SERIAL NOT NULL,
  "name" VARCHAR(45) NULL,
  "code" VARCHAR(150) NULL,
  "price" DECIMAL(16,2) NULL,
  "quantity" INT NOT NULL,
  "id_category" INT NOT NULL,
  PRIMARY KEY ("id"),
  CONSTRAINT "fk_products_categories"
    FOREIGN KEY ("id_category")
    REFERENCES categories ("id")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);