package practice.ch2;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("10진수 입력: ");
        int input = sc.nextInt();

        System.out.println();

        System.out.printf("10진수: %d\n", input);
        System.out.printf("2진수: %s\n", Integer.toBinaryString(input));
        System.out.printf("8진수: %o\n", input);
        System.out.printf("16진수: %x\n", input);

    }
}
