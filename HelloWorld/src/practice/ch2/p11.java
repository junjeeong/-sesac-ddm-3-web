package practice.ch2;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int second = 0;
        int minute = 0;
        int hours = 0;

        System.out.println("초 단위:");
        int inputSecond = sc.nextInt();

        hours = inputSecond / 3600;
        minute = (inputSecond / 60) % 60;
        second = inputSecond % 60 ;

        if(hours >= 1){
            System.out.printf("%d초는 %d시 %d분 %d초입니다.", inputSecond, hours, minute, second);
        } else {
            System.out.printf("%d초는 %d분 %d초입니다.", inputSecond, minute, second);
        }

    }
}
