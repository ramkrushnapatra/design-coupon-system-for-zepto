import enums.ProductType;
import enums.UserType;
import model.*;
import service.CouponValidator;
import service.RuleManager;

public class CouponSystemApp {
    public static void main(String[]args){
        User user = new User(1, "ram","ram@yopmail.com", UserType.REGULAR);
        Rule rule = new Rule(1,"ramRule", ProductType.VEGETABLE,UserType.REGULAR);
        Coupon coupon = new Coupon(1,"ramCoupon",100.0);
        coupon.addCouponRule(rule);

        CartItem cartItem = new CartItem(1, "fish",ProductType.VEGETABLE,2);
        Cart cart = new Cart(1);
        cart.addItemToCart(cartItem);


        Order order = new Order(1, cart,100, new CouponValidator());
        order.applyCoupon(coupon,user);


    }
}
