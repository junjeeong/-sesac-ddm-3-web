package ch8.p3;

public interface Payment {

    // 추상 클래스 -> 구현 객체에서 @Override 해주어야 함.
    void processPayment(double amount);

    // 디폴트 메소드 (선언부 앞에 default가 있어야 하며, 인터페이스에서 실행부가 정의된 메서드, 그럼에도 구현 객체가 필요함)
    default void printReceipt(double amount) {
        System.out.println(String.format("결제 금액: %.0f원", amount));
        System.out.println("결제 완료");
    }

    default boolean validateAmount(double amount) {
        if(amount < 0) {
            System.out.printf("금액 유효성 검사 실패: %.0f원\n", amount);
            return false;
        } else {
            System.out.printf("금액 유효성 검사 통과: %.0f원\n", amount);
            return true;
        }
    }
}
