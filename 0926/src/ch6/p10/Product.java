package ch6.p10;

public class Product {
    private static int nextId = 1;         // 자동 증가용 ID
    private static int totalProducts = 0;  // 전체 등록된 상품 수

    private String productId; // "P001" 같은 형식
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.productId = generateProductId();
        this.name = name;
        this.price = price;
        this.stock = stock;
        totalProducts++;
        System.out.println("상품 등록: " + productId + " - " + name
                + " (" + (int)price + "원, 재고: " + stock + "개)");
    }

    public void sellProduct(int quantity) {
        if (stock < quantity) {
            System.out.println("재고가 부족합니다. (요청: " + quantity + "개, 재고: " + stock + "개)");
            return;
        }
        stock -= quantity;
        System.out.println(quantity + "개 판매 완료. 남은 재고: " + stock + "개");
    }

    public void restockProduct(int quantity) {
        stock += quantity;
        System.out.println(quantity + "개 재입고 완료. 현재 재고: " + stock + "개");
    }

    public void applyDiscount(double percentage) {
        double discountAmount = price * (percentage / 100);
        price -= discountAmount;
        System.out.println((int)percentage + "% 할인 적용. 새 가격: " + (int)price + "원");
    }

    private static String generateProductId() {
        return String.format("P%03d", nextId++);
    }

    public static int getTotalProducts() {
        return totalProducts;
    }
}