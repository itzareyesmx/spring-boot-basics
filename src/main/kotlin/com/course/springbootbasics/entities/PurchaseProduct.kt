package com.course.springbootbasics.entities

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "purchases_products")
class PurchaseProduct {
  @EmbeddedId
  var id: PurchaseProductPK? = null
  var quantity: Int? = null
  var total: Double? = null
}