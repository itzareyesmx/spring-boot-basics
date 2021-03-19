package com.course.springbootbasics.entities

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "products")
data class Product(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int? = null,

  val name: String,

  val code: String? = null,

  val price: Double? = null,

  val quantity: Int? = null,

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_category")
  val category: Category? = null,
)