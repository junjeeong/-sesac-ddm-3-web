package ch8.p3;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        if(validateAmount(amount)) {
            System.out.printf("신용카드로 %.0f원 결제했습니다.\n", amount);
            System.out.println("=== 신용카드 영수증 ===");
            this.printReceipt(amount);
        } else {
            System.out.println("결제 실패, 잔액이 부족합니다.");
        }
    }
}
