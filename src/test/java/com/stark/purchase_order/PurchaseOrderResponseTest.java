package com.stark.purchase_order;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PurchaseOrderResponseTest {
    @Test
    public void testPurchaseOrderReceiverId() {

        PurchaseOrderResponse purchaseOrderResponse = new PurchaseOrderResponse();
        String receiverId = "A";
        purchaseOrderResponse.setPurchaseOrderReceiverId(receiverId);

        assertEquals(receiverId, purchaseOrderResponse.getPurchaseOrderReceiverId());
    }
}
