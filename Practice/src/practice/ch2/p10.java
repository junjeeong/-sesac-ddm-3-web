package practice.ch2;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";

        System.out.println("키를 입력해주세요");
        float height = sc.nextFloat();

        System.out.println("몸무게를 입력해주세요");
        float weight = sc.nextFloat();

        float BMI = weight / (height * height);

        if(BMI < 18.5) {
            result = "저체중";
        }
        if(BMI >= 18.5 && BMI < 25) {
            result = "정상체중";
        }
        if(BMI >= 25 && BMI <30){
            result = "과체중";
        }
        if(BMI >= 30){
            result = "비만";
        }

        System.out.println("키:" + height);
        System.out.println("몸무게:" + weight);
        System.out.printf("BMI: %.1f\n", BMI);
        System.out.println("판정:" +  result);

    }
}
