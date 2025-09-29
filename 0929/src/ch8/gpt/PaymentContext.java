package ch8.gpt;

public class PaymentContext {
    private DiscountStrategy strategy; // Context는 동적으로 변하는 전략(데이터)을 field로 갖고 있음

    public void setStrategy(DiscountStrategy strategy){ // 구현체 클래스를 매개변수로 받아서 field인 전략을 바꾸는 메서드가 필요해
        this.strategy = strategy;
    }

    public void pay(double price){
        double finalPrice = price - strategy.getDiscountPrice(price);
        System.out.println(String.format("최종 결제 금액: %.0f원", finalPrice));
    }
}
