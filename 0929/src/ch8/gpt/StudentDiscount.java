package ch8.gpt;

public class StudentDiscount implements DiscountStrategy{

    @Override
    public double getDiscountPrice(double price) {
        return price *  0.15;
    }
}
