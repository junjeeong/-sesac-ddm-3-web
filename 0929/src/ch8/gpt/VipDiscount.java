package ch8.gpt;

public class VipDiscount implements DiscountStrategy {
    @Override
    public double getDiscountPrice(double price) {
        return price *  0.2;
    }
}
