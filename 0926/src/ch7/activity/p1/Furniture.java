package ch7.activity.p1;

public class Furniture extends Item {
    Furniture(String name, int price) {
        super(name, price);
        this.deliveryFee =  this.deliveryFee + (int)(this.price * 0.05);
    }
}
