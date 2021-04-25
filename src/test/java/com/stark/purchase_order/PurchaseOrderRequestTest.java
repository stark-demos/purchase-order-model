package com.stark.purchase_order;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PurchaseOrderRequestTest {

   @Test
   public void testPartCode() {
      PurchaseOrderRequest purchaseOrderRequest = new PurchaseOrderRequest();
      String partCode = "A";
      purchaseOrderRequest.setPartCode(partCode);

      assertEquals(partCode, purchaseOrderRequest.getPartCode());
   }

   @Test
   public void testQuantity() {
      PurchaseOrderRequest purchaseOrderRequest = new PurchaseOrderRequest();
      Integer quantity = 1;
      purchaseOrderRequest.setQuantity(quantity);

      assertEquals(quantity, purchaseOrderRequest.getQuantity());
   }

}
