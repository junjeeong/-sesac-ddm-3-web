package ch8.p3;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment card = new CreditCardPayment();
        CashPayment cash = new CashPayment();

        card.processPayment(50000);
        cash.processPayment(30000);
    }
}
