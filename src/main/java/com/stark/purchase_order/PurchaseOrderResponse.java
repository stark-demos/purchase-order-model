package com.stark.purchase_order;

public class PurchaseOrderResponse extends PurchaseOrderRequest {
    private String purchaseOrderReceiverId;

    public String getPurchaseOrderReceiverId() {
        return purchaseOrderReceiverId;
    }

    public void setPurchaseOrderReceiverId(String purchaseOrderReceiverId) {
        this.purchaseOrderReceiverId = purchaseOrderReceiverId;
    }

    @Override
    public String toString() {
        return "[PurchaseOrderRequest]: partCode: " + getPartCode() + ", quantity: " + getQuantity()
                + ", purchaseOrderReceiverId: " + purchaseOrderReceiverId;
    }
}
