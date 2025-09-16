package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Integer cartId;
    private List<CartItem> cartItemList;
    private Integer totalProduct;

    public Cart(Integer cartId) {
        this.cartId = cartId;
        this.cartItemList = new ArrayList<>();
        this.totalProduct = 0;
    }

    public void addItemToCart(CartItem cartItem){
        this.cartItemList.add(cartItem);
        this.totalProduct = totalProduct +1;
    }

    public void removeItemFromCart(CartItem cartItem){
        this.cartItemList.remove(cartItem);
        this.totalProduct = totalProduct -1;
    }
}
