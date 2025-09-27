package ch7.activity.p1;

public class Grocery extends Item {
    Grocery(String name, int price) {
        super(name, price);
        this.deliveryFee =  5000;
    }
}
