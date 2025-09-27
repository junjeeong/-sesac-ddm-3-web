package ch7.p3;

public abstract class Shape {
    String shapeName;
    protected static int x = 0 ;
    protected static int y = 0;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    protected static void move(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }

    abstract void calculateArea();

}
