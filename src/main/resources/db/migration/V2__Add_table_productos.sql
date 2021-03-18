-- -----------------------------------------------------
-- Table "PRODUCTOS"
-- -----------------------------------------------------
CREATE TABLE  PRODUCTOS (
  "id_producto" SERIAL NOT NULL,
  "nombre" VARCHAR(45) NULL,
  "id_categoria" INT NOT NULL,
  "codigo_barras" VARCHAR(150) NULL,
  "precio_venta" DECIMAL(16,2) NULL,
  "cantidad_stock" INT NOT NULL,
  "estado" BOOLEAN NULL,
  PRIMARY KEY ("id_producto"),
  CONSTRAINT "fk_PRODUCTOS_CATEGORIAS"
    FOREIGN KEY ("id_categoria")
    REFERENCES CATEGORIAS ("id_categoria")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
