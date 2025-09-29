package ch8.p1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle retangle = new Rectangle(5, 5);

        System.out.println("원의 넓이: " + circle.calculateArea());
        System.out.println("원의 둘례: " + circle.calculatePerimeter());
        System.out.println("직사각형의 넓이: " + retangle.calculateArea());
        System.out.println("직사각형의 둘레: " + retangle.calculatePerimeter());
    }
}
