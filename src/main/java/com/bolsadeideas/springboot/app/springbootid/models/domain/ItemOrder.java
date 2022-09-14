package com.bolsadeideas.springboot.app.springbootid.models.domain;

public class ItemOrder {
    private Product product;
    private Integer amount;

    public ItemOrder(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer calculateSubtotal() {
        return amount * product.getPrice();
    }
}
