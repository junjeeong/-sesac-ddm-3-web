package strategyPattern;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.printf("신용카드로 %d원을 결제했습니다.\n", amount);
    }
}
