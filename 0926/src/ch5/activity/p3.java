package ch5.activity;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetPage = (int)(Math.random() * 1000) + 1;

        System.out.println("두꺼운 책의 아무 페이지나 펼쳤습니다. 몇 페이지일까요? (1~1000, 기회: 10번)");
        // System.out.println("정답은 " + targetPage);
        for(int count = 0; count < 10; count++){
            int input =  sc.nextInt();

            System.out.println(count + "번째 시도 :" + input);

            if(input < targetPage){
                System.out.println("더 뒷장이에요!(Up!)");
            }
            if(input > targetPage){
                System.out.println("더 앞장이에요!(Down!)");
            }
            if(input == targetPage){
                System.out.println("정답입니다! 책을 찾았네요.!");
                System.out.println("축하합니다! " + count + "번 만에 페이지를 찾았습니다.");
                break;
            }
        }
        System.out.println("아쉽네요. 모든 페이지를 넘겨봤지만 찾지 못했습니다. 정답은 "+ targetPage + "쪽 입니다.");
    }
}
