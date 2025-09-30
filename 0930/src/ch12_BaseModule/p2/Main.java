package ch12_BaseModule.p2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("입력 예시: ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String 공백제거 = input.trim(); // 왜 안되지??
        String 대문자변환 = 공백제거.toUpperCase();
        String 소문자변환 = 공백제거.toLowerCase();
        String 단어분할 = Arrays.toString(공백제거.split(" "));
        boolean Java포함여부 = input.contains("Java");

        System.out.println(String.format("원본: %s", input));
        System.out.println(String.format("공백 제거: %s", 공백제거));
        System.out.println(String.format("대문자 변환: %s", 대문자변환));
        System.out.println(String.format("소문자 변환: %s", 소문자변환));
        System.out.println(String.format("단어 분할: %s", 단어분할));
        System.out.println("'Java' 포함 여부: " + Java포함여부);
    }
}
