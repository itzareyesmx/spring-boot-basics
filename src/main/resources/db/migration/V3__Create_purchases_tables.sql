-- -----------------------------------------------------
-- Table "purchases"
-- -----------------------------------------------------
CREATE TABLE  purchases (
  "id" SERIAL NOT NULL,
  "date" TIMESTAMP NULL,
  "payment" CHAR(1) NULL,
  "comment" VARCHAR(300) NULL,
  PRIMARY KEY ("id"));


-- -----------------------------------------------------
-- Table "purchases_products"
-- -----------------------------------------------------
CREATE TABLE  purchases_products (
  "id_purchase" INT NOT NULL,
  "id_product" INT NOT NULL,
  "quantity" INT NULL,
  "total" DECIMAL(16,2) NULL,
  PRIMARY KEY ("id_purchase", "id_product"),
  CONSTRAINT "fk_purchases_products_prod"
    FOREIGN KEY ("id_purchase")
    REFERENCES products ("id")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT "fk_purchases_products_purch"
    FOREIGN KEY ("id_purchase")
    REFERENCES purchases ("id")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);