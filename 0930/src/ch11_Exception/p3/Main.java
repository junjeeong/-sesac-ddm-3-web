package ch11_Exception.p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===나눗셈 계산기 ===");
        System.out.print("첫 번째 숫자: ");
        int x = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int y = sc.nextInt();

        divisor(x,y);
    }

    private static void divisor(int x, int y) {
        try {
            if(y == 0) throw new ArithmeticException();
            int result = x/y;
            System.out.println(String.format("%d 나누기 %d는 %d입니다.", x,y, result));
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}


