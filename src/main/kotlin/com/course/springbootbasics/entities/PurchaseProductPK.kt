package com.course.springbootbasics.entities

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class PurchaseProductPK : Serializable {
  @Column(name = "id_purchase")
  var idPurchase: Int? = null

  @Column(name = "id_product")
  var idProduct: Int? = null
}
