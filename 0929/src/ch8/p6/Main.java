package ch8.p6;

public class Main {
    public static void main(String[] args) {
        Calculator plus = (a, b) -> System.out.println("덧셈: " + (a + b));
        Calculator minus = (a,b) -> System.out.println("뺄셈: "+ (a-b));
        Calculator multiple =  (a,b) -> System.out.println("곱셈: "+ (a*b));
        Calculator divisor = (a,b) -> System.out.println("나눗셈: "+ (a/b));
        Calculator square = (a,b) -> System.out.println("나눗셈: "+ Math.pow(a,b));
        Calculator max = (a,b) -> System.out.println("최댓값: "+ Math.max(a,b));

        plus.calculate(10,5);
        minus.calculate(10,5);
        multiple.calculate(10,5);
        divisor.calculate(10,5);
        square.calculate(10,5);
        max.calculate(10,5);
    }
}
