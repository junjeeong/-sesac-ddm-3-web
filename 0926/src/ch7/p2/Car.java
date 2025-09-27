package ch7.p2;

public class Car extends Vehicle {
    int doors;

    Car(String brand, int year, int doors ) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    void start() {
        super.start();
        System.out.println(this.year + "년" + this.brand + " " + this.doors+ "문 자동차");
    }
}
