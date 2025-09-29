package ch7.activity.p2;

public class CreditCardPayment extends Payment {

    CreditCardPayment(int amount) {
        super(amount);
    }

    @Override
    void processPayment(){
        System.out.println(STR."신용카드로 $\{amount} 결제가 진행됩니다. (수수료: $\{amount * 1.5})");
    }


}
