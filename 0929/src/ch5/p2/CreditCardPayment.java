package ch5.p2;

public class CreditCardPayment extends Payment {
    double charge;
    double totalPayment;

    CreditCardPayment(double amount) {
        super(amount);
        this.charge = amount * 0.15;
        this.totalPayment = amount + this.charge;
    }

    @Override
    void processPayment() {
        System.out.println(String.format("신용카드로 $%.0f결제가 진행됩니다.(수수료 : $%.0f)", this.amount, this.charge));
    }
}
