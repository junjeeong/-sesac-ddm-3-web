package ch6.p8;

public class Calculator {
    static int result;

    static int add (int x, int y) {
        result = x + y;
        return result;
    }

    static int subtract(int x, int y) {
        result = x - y;
        return result;
    }

    static int multiply(int x, int y) {
        result = x * y;
        return result;
    }

    static int divide(int x, int y) {
        if(y == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }

        result = x / y;
        return result;
    }

    static void printResult () {
        System.out.println("계산기 결과: " + (double)result);
    }
}
