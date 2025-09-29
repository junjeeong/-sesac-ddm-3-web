package ch8.p1;

public class Circle implements Shape {
    int radius;
    static final double PIE = 3.14159;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.radius * this.radius * PIE;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PIE * this.radius;
    }
}
