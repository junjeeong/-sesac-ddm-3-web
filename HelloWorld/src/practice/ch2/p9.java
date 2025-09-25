package practice.ch2;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        System.out.print("변환 방식을 선택하세요 (1: 섭씨→화씨, 2: 화씨→섭씨): ");
        int input = sc.nextInt();

        if(input == 1 ) {
            System.out.print("섭씨온도: ");
            float inputFloat = sc.nextFloat();
            System.out.printf("섭씨 온도 %.1f는 화씨 %.1f도입니다.", inputFloat, inputFloat * (9.0/5.0) + 32);
        } else {
            System.out.print("화씨온도: ");
            float inputFloat = sc.nextFloat();
            System.out.printf("화씨 온도 %.1f는 섭씨 %.1f도입니다.", inputFloat, (inputFloat - 32) * (5.0/9.0));
        }
    }
}
