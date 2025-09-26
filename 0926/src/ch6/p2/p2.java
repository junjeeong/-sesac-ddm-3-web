package ch6.p2;

public class p2 {
    public static void main(String[] args) {
        BankAccount junyeongBank = new BankAccount("123-456-789", "정준영");

        junyeongBank.deposit(10000);
        junyeongBank.withdraw(5000);

        double balance = junyeongBank.getBalance();
        System.out.println("현재 잔액: "+ (int)balance);

        junyeongBank.withdraw(5000);
        balance = junyeongBank.getBalance();
        System.out.println("현재 잔액: " + (int)balance);

    }
}
