package practice.ch2;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력:");
        int integerInput = scanner.nextInt();
        System.out.print("실수 입력:");
        float floatInput = scanner.nextFloat();
        System.out.print("논리 입력: ");
        boolean booleanInput = scanner.nextBoolean();

        System.out.println();

        System.out.println("문자열 \"123\"을 정수로: " + integerInput);
        System.out.println("문자열 \"45.67\"을 실수로: " + floatInput);
        System.out.println("문자열 \"true\"를 불린으로: " + booleanInput);

    }
}
