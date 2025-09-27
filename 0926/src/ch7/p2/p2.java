package ch7.p2;

public class p2 {
    public static void main(String[] args) {
        Vehicle parent = new Vehicle("현대", 2022);
        Car child = new Car("현대", 2022, 4);

        parent.start();
        child.start();
    }
}
