package com.course.springbootbasics.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "productos")
data class Producto (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_producto")
  private val idProducto: Int? = null,

  private val nombre: String,

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_categoria")
  private val categoria: Categoria? = null,

  @Column(name = "codigo_barras")
  private val codigoBarras: String? = null,

  @Column(name = "precio_venta")
  private val precioVenta: Double? = null,

  @Column(name = "cantidad_stock")
  private val cantidadStock: Int? = null
)