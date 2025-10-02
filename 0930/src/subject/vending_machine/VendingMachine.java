package subject.vending_machine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    Map<String, Integer> items; // 상품명과 재고 수량
    Map<String, Integer> prices; // 상품명과 가격
    int currentMoney; // 현재 투입된 금액

    public VendingMachine() {
        items = new HashMap<>();
        prices = new HashMap<>();
    }

    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }

    public void setPrices(Map<String, Integer> prices) {
        this.prices = prices;
    }


    void insertMoney(int money) {
        this.currentMoney += money;
        System.out.printf("%d원 투입, 현재 금액: %d원\n", money, this.currentMoney);
    }

    void selectItem(String itemName){
        if(!isItemExist(itemName)) {
            System.out.println("해당 상품은 재고가 없습니다.");
            return;
        }

        if(!isPurchasable(itemName)) {
            System.out.println("금액이 부족합니다.");
            return;
        }


        if (isPurchasable(itemName) && isItemExist(itemName)) {
            reduceItemQuantity(itemName, 1);
            System.out.printf("%s 제공! 거스름돈 %d원을 받으세요.\n", itemName, getChange(itemName));
            this.currentMoney = 0;
        }

    }

    void returnChange(){
        System.out.printf("%d원 반환\n", this.currentMoney);
        this.currentMoney = 0;
    }

    int getPrice(String itemName) {
        for(String storedItemName : items.keySet()){
            if(storedItemName == itemName ){
                return prices.get(storedItemName);
            }
        }
        return -1;
    }

    boolean isItemExist(String itemName) {
        for(String storedItemName : items.keySet()){
            if(storedItemName == itemName ){
                int quantity = items.get(storedItemName);
                return quantity > 0;
            }
        }
        return false;
    }

    boolean isPurchasable(String itemName) {
        for(String storedItemName : items.keySet()){
            if(storedItemName == itemName ){
                int targetItemPrice = prices.get(storedItemName);
                return this.currentMoney > targetItemPrice;
            }
        }
        return false;
    }

    int getChange(String itemName){
        for(String storedItemName : items.keySet()){
            if(storedItemName == itemName ){
                int price = prices.get(storedItemName);
                return currentMoney - price;
            }
        }
        return -1;
    }

    void reduceItemQuantity(String itemName, int reduceAmount){
        for(String storedItemName : items.keySet()){
            if(storedItemName == itemName ){
                int quantity = items.get(storedItemName);
                items.put(itemName, quantity - reduceAmount);
                break;
            }
        }
    }

    void increaseItemQuantity(String itemName, int increaseAmount) {
        for(String storedItemName : items.keySet()){
            if(storedItemName == itemName ){
                int quantity = items.get(storedItemName);
                items.put(itemName, quantity + increaseAmount);
                break;
            }
        }
    }
}
