package ch6.p10;

public class p10 {
    public static void main(String[] args) {
        Product p1 = new Product("노트북", 1200000, 10);

        p1.sellProduct(5);   // 5개 판매
        p1.sellProduct(8);   // 재고 부족
        p1.restockProduct(3);// 재입고
        p1.applyDiscount(10);// 10% 할인

        System.out.println("전체 등록 상품 수: " + Product.getTotalProducts());
    }
}