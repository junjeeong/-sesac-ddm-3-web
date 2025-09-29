package ch9.p1;

public class Computer {
    String brand;
    String model;

    Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }


    static public class CPU {
        int cores;
        double speed;

        CPU(int cores, double speed) {
            this.cores = cores;
            this.speed = speed;
        }

        String getSpecification() {
            return String.format("%d코어, %.1fGHz", cores, speed);
        };

    }
}
