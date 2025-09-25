package practice.ch2;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("생년월일 입력 (YYYY-MM-DD): ");
        String birthdayInput = sc.nextLine(); // 1997-12-05

        String[] birthdayArray = birthdayInput.split("-"); // ["1997", "12", "5"]
        int year = Integer.parseInt(birthdayArray[0]);
        int month = Integer.parseInt(birthdayArray[1]);
        int day = Integer.parseInt(birthdayArray[2]);
        int age = 2025 - year;

        String[] 년도자릿수배열 = birthdayArray[0].split(""); // ["1", "9", "9", "7"]

        int sum = 0;
        for(int i = 0 ; i < 년도자릿수배열.length; i++){
            sum += Integer.parseInt(년도자릿수배열[i]);
        }


        System.out.printf("=== 생년월일 분석 ===\n" +
                "생년: %d년\n" +
                "생월: %d월\n" +
                "생일: %d일\n" +
                "나이: %d세", year, month, day, age);

        System.out.printf("=== 생년 진법 변환 ===\n" +
                "10진수: %d\n" +
                "2진수: %s\n" +
                "8진수: %o\n" +
                "16진수: %x\n", year, Integer.toBinaryString(year), year, year);
        System.out.printf("=== 생년 자릿수 분석 ===\n" +
                "각 자릿수: %s, %s, %s, %s\n" +
                "자릿수 합: %d", 년도자릿수배열[0], 년도자릿수배열[1], 년도자릿수배열[2], 년도자릿수배열[3], sum);
    }

}
