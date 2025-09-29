package ch5.p2;

public class BankTransferPayment extends Payment{
    int charge = 500;
    double resultPayment = charge + amount;

    BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println(String.format("계좌 이체로 $%.0f 결제가 진행됩니다(수수료:%d원)", this.amount, this.charge));
    }
}
