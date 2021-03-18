package com.course.springbootbasics.entities
import javax.persistence.*

@Entity
@Table(name = "categorias")
data class Categoria (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_categoria")
  var idCategoria: Int? = null,
  var descripcion: String? = null,
  var estado: Boolean? = null
)
