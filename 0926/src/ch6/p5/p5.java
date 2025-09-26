package ch6.p5;

public class p5 {
    public static void main(String[] args) {
        Car car = new Car("현대", "아반떼", 2022);

        car.printCarInfo();
        car.drive(150);
        car.printCarInfo();
        car.refuel(20);
        car.printCarInfo();
    }
}
