package ch3;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("상품의 원가를 입력하세요: ");
        int originalPrice = sc.nextInt();

        System.out.println("할인율(%)을 입력하세요:  ");
        double discountRate = sc.nextDouble();

        int payment = (int)(originalPrice * (1 - discountRate / 100));
        double point = payment > 30000 ? payment * 0.05 : payment * 0.01;

        System.out.println("=== 결제 정보 ===");
        System.out.println("상품 원가:" + originalPrice + "원");
        System.out.println("할인율: " + discountRate + "%");
        System.out.println("--------------------");
        System.out.println("최종 결제 금액 :" + (payment/10)*10 + "원");
        System.out.println("적립 포인트 : " + (int)point + "점");
    }
}
