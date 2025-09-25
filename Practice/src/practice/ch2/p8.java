package practice.ch2;

public class p8 {
    static int globalVar = 100;  // 전역 변수

    public static void main(String[] args) {
        int localVar = 10;       // 지역 변수

        System.out.println("메인 메소드에서:");
        System.out.printf("globalVar = %d, localVar = %d\n", globalVar, localVar);

        {
            int blockVar = 20;   // 블록 변수
            System.out.printf("globalVar = %d, localVar = %d, blockVar = %d\n",  globalVar, localVar, blockVar);
        }

    }
}
