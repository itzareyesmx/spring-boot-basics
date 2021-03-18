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
data class Product(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private val id: Int? = null,

  private val name: String,

  private val code: String? = null,

  private val price: Double? = null,

  private val quantity: Int? = null,

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_category")
  private val category: Category? = null,
)