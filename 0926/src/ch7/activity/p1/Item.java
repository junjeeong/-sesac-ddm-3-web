package ch7.activity.p1;

public class Item {
    protected String name;
    protected int price;
    protected int deliveryFee = 3000;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("상품명: " + this.name + ", 가격: " + this.price + "원");
    }

    int getFinalPrice() {
        int finalPrice = price + deliveryFee;
        return finalPrice;
    }
}
