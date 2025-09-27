package ch7.p3;

public class Circle extends Shape {
    String name;
    double area;

    Circle(String name){
        super(name);
    }

    @Override
    void calculateArea() {
        this.area = x * y;
        System.out.println(name + "넓이: " + area);
    }
}
