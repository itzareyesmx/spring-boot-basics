package com.course.springbootbasics.entities
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.OneToMany

@Entity
@Table(name = "categories")
data class Category (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Int? = null,
  var description: String? = null,
  var state: Boolean? = null,

  @OneToMany(mappedBy = "category")
  var products: List<Product> = emptyList()
)
