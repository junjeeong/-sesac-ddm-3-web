package ch6.p2;

public class BankAccount {
    // 필드 선언 -> 모두 인스턴스 필드임 -> 객체마다 다르게 입력되어야 하는 값 -> 생성자에서 초기화 되어야 함
    String accountNumber;
    double balance = 0;
    String ownerName;

    BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    void deposit(double amount){
        this.balance += amount;
    }

    void withdraw(double amount){
        this.balance -= amount;
    }

    double getBalance(){
        if(this.balance <= 0){
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
        return this.balance;
    }
}
