package ch11_Exception.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== 정수 변환기 ====");
        StringToNumber();
    }

    private static void StringToNumber() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("숫자를 입력하세요.: ");
            String input = sc.nextLine();
            int num =  Integer.parseInt(input);
            System.out.printf("입력하신 숫자는 %d입니다.\n", num);
        } catch (NumberFormatException e) {
            System.out.println("올바른 숫자을 입력해주세요.");
            StringToNumber();
        }
    }


}
