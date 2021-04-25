package com.stark.purchase_order;

public class PurchaseOrderRequest {
    private String partCode;
    private Integer quantity;

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[PurchaseOrderRequest]: partCode: " + partCode + ", quantity: " + quantity;
    }
}
