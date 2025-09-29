package ch8.gpt;

public class Main {
    public static void main(String[] args) {
        // 상품 가격
        double price = 10000;

        // Context 생성
        PaymentContext context = new PaymentContext();

        // 1. 일반 고객 결제
        context.setStrategy(new NormalDiscount());
        context.pay(price);   // "최종 결제 금액: 9000.0원"

        // 2. VIP 고객 결제
        context.setStrategy(new VipDiscount());
        context.pay(price);   // "최종 결제 금액: 8000.0원"

        // 3. 학생 고객 결제
        context.setStrategy(new StudentDiscount());
        context.pay(price);   // "최종 결제 금액: 8500.0원"
    }
}
