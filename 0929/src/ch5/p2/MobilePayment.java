package ch5.p2;

public class MobilePayment extends Payment{
    double charge = amount * 0.01;
    double resultPayment = amount + charge;

    public MobilePayment(double amount) {
        super(amount);
    }

    void processPayment() {
        System.out.println(String.format("모바일 페이로$%.0f 결제가 진행됩니다. (수수료:$%.0f원)", this.amount, this.charge));
    }
}
