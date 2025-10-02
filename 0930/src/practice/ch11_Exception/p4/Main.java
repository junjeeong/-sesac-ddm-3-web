package practice.ch11_Exception.p4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 크기를 입력하세요: ");
        String inputArraySize = sc.nextLine();
        System.out.print("인덱스를 입력하세요: ");

        try {
            String index = sc.nextLine();
            int parsedInt = Integer.parseInt(index);
            if (parsedInt >= Integer.parseInt(inputArraySize)) throw new ArrayIndexOutOfBoundsException();
            System.out.println("배열 접근 성공!");
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            if(e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("잘못된 배열 접근입니다.");
            }
            if (e instanceof NumberFormatException) {
                System.out.println("잘못된 숫자 형식입니다.");
            }
        } finally {
            System.out.println("정리 작업을 수행합니다.");
        }
    }
}
