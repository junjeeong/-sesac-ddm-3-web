package ch7.activity.p2;

public abstract class Payment {
    protected int amount;

    Payment(int amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}
