package pattern.strategyPattern;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.printf("계좌이체로 %d원 결제했습니다.\n", amount);
    }
}
