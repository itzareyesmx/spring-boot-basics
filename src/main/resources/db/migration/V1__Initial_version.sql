-- -----------------------------------------------------
-- Table "CATEGORIAS"
-- -----------------------------------------------------
CREATE TABLE  CATEGORIAS (
  "id_categoria" SERIAL NOT NULL,
  "descripcion" VARCHAR(45) NOT NULL,
  "estado" BOOLEAN NOT NULL,
  PRIMARY KEY ("id_categoria"));
