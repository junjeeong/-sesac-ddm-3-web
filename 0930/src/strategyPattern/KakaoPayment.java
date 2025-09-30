package strategyPattern;

public class KakaoPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.printf("카카오페이로 %d원 결제했습니다.\n", amount);
    }
}
