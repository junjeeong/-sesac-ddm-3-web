package ch3;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원금을 입력하세요: ");
        long principal =  sc.nextLong();

        System.out.print("연이율(%)을 입력하세요: ");
        double interestRate =  sc.nextDouble();

        System.out.print("예치 기간(년)을 입력하세요: ");
        int year = sc.nextInt();

        double interestIncome = principal * (interestRate / 100) * year;
        long finalAmount = principal + (long)interestIncome;

        System.out.println("=== 최종 계산 결과 ===");
        System.out.println("원급: " +  principal);
        System.out.println("연이율: " +  interestRate + "%");
        System.out.println("기간: " + year + "년");
        System.out.println("--------------------");
        System.out.println("총 이자 수익: " +  (int)interestIncome + "원");
        System.out.println("최종 수령액: " +  finalAmount + "원");
    }
}
