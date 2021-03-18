package com.course.springbootbasics.entities
import javax.persistence.*

@Entity
@Table(name = "categories")
data class Category (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Int? = null,
  var description: String? = null,
  var state: Boolean? = null
)
