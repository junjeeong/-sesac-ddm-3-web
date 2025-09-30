package strategyPattern;

    public class Main {
        public static void main(String[] args) {
            PaymentContext context = new PaymentContext();

            // 신용카드 결제
            context.setPaymentStrategy(new CreditCardPayment());
            context.executePayment(10000);

            // 계좌이체 결제
            context.setPaymentStrategy(new BankTransferPayment());
            context.executePayment(20000);

            // 카카오페이 결제
            context.setPaymentStrategy(new KakaoPayment());
            context.executePayment(30000);
        }
    }
