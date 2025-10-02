package practice.ch11_Exception.p1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[10]); // 배열 인덱스 초과
        } catch(ArrayIndexOutOfBoundsException e) { //extends RuntimeException -> unChecked Exception
            System.out.println("배열 인덱스가 범위를 벗어났습니다.");
            System.out.println("프로그램을 계속 실행합니다.");
        }
    }
}
