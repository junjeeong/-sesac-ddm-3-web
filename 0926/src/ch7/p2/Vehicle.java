package ch7.p2;

public class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start(){
        System.out.println("차량 시동이 켜집니다.");
        System.out.println(this.brand + "가 출발합니다.");
    }
}
