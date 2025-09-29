package ch8.p3;

public class CashPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        if(validateAmount(amount)) {
            System.out.println("=== 현금 영수증 ===");
            this.printReceipt(amount);
            System.out.println("거스름돈 : 없음");
        } else {
            System.out.println("결제 실패, 잔액이 부족합니다.");
        }
    }
}
