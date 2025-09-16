package model;

import enums.ProductType;

public class CartItem {
    private Integer cartItemId;
    private String productName;
    private ProductType productType;
    private Integer quantity;

    public CartItem(Integer cartItemId, String productName, ProductType productType, Integer quantity) {
        this.cartItemId = cartItemId;
        this.productName = productName;
        this.productType = productType;
        this.quantity = quantity;
    }

    public Integer getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Integer cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
