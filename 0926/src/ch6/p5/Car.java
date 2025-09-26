package ch6.p5;

public class Car {
    // 필드 선언 -> 객체 고유의 데이터
    String brand;
    String model;
    int year;
    double mileage = 0;
    double fuel = 50;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void drive(int distance) {
        // distance가 1km당 0.1L씩 감소
        int flag = distance;

        while (flag > 0) {
            if (fuel > 0) {
                this.fuel -= 0.1;
                mileage += 1;
                flag = flag - 1;
            } else {
                System.out.println("연료 부족, 주행 불가");
                return;
            }
        }

        System.out.println(distance + "km 주행 완료");
    }

    void refuel (int amount) {
        if(this.fuel == 100) {
            System.out.println("연료가 꽉 차 더이상 채울 수 없습니다.");
            return;
        }
        double result = this.fuel + amount;
        if(result > 100) {
            this.fuel = 100;
            System.out.println(amount + "L 연료 충전 완료, 연료가 100L로 완전히 충전되었습니다.");
            return;
        }
        this.fuel += amount;
        System.out.println(amount + "L 연료 충전 완료");
    }

    void printCarInfo(){
        System.out.println(this.year + " " + this.brand + " " + this.model);
        System.out.println("주행거리: " + (int)this.mileage + "km," + "연료: " + (int)this.fuel + "L");
    }
}
