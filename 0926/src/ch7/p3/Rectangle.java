package ch7.p3;

public class Rectangle extends Shape {
    String name;
    double area;

    Rectangle(String name){
        super(name);
    }

    @Override
    void calculateArea() {
        this.area = x * y;
        System.out.println(name + "넓이: " + area);
    }
}
