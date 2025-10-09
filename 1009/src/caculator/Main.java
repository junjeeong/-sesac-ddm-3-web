package caculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Caculator caculator = new Caculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n1. 조회");
        System.out.println("2. 계산");
        System.out.println("q. 종료");

        while(true) {
            System.out.print("선택 : ");
            String input = sc.nextLine();

            if(input.equals("q")) {
                System.out.println("종료합니다.");
                break;
            }

            if(input.equals("1")) {
                caculator.printHistory();
            }

            if(input.equals("2")) {
                System.out.print("식 입력 : ");
                String expression = sc.nextLine();
                caculator.calculate(expression);
            }
        }

    }
}
