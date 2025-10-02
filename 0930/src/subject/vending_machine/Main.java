package subject.vending_machine;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        // 1. VendingMachine 객체를 생성하고, 3가지 상품(예: 콜라, 사이다, 물)의 가격과 초기 재고를 설정합니다.
        VendingMachine vendingMachine = new VendingMachine();

        Map<String, Integer> items = new HashMap<>();
        items.put("콜라", 10);
        items.put("사이다", 10);
        items.put("물", 10);
        items.put("수건", 0);

        Map<String, Integer> prices = new HashMap<>();
        prices.put("콜라", 800);
        prices.put("사이다", 1200);
        prices.put("물", 300);
        prices.put("수건", 1000);

        vendingMachine.setItems(items);
        vendingMachine.setPrices(prices);

        // 2. 사용자가 1000원을 투입합니다.
        vendingMachine.insertMoney(1000);

        // 3. 800원짜리 콜라를 선택합니다. (성공! 재고가 1 줄고, 거스름돈 200원이 반환되어야 합니다.)
        vendingMachine.selectItem("콜라");

        // 4. (거스름돈을 받았으므로 현재 금액은 0원) 다시 콜라를 선택합니다. (금액 부족 메시지가 출력되어야 합니다.)
        vendingMachine.selectItem("콜라");

        // 5. 500원을 투입합니다.
        vendingMachine.insertMoney(500);

        // 6. 1200원짜리 사이다를 선택합니다. (금액 부족 메시지가 출력되어야 합니다.)
        vendingMachine.selectItem("사이다");

        // 7. 재고를 0으로 만든 상품을 선택해 봅니다. (재고 없음 메시지가 출력되어야 합니다.)
        vendingMachine.selectItem("수건");

        // 8. 남은 돈(500원)을 반환받습니다.
        vendingMachine.returnChange();
    }
}
