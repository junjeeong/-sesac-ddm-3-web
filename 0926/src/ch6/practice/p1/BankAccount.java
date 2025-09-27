package ch6.practice.p1;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private long balance = 0;

    BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public void deposit(long amount) {
        try {
            validateAmount(amount);
            balance += amount;
            System.out.println("입금 후 잔액:" + "[" + this.balance + "]원");
        } catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public void withdraw(long amount) {
        try {
            validateCurrentBalance(amount);
            balance -= amount;
            System.out.println("출금 후 잔액:" + "[" + this.balance + "]" + "원");
        } catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getBalanceInfo() {
        System.out.println("게좌번호:" + "[" + this.accountNumber + "]," + "예금주:" + "[" + this.ownerName + "]," + "현재 잔액: " + "[" + this.balance + "]원");
    }

    private void validateAmount (long amount) {
        if (amount <= 0) {
            throw new InsufficientBalanceException("유효하지 않은 금액입니다.");
        }
    }

    private void validateCurrentBalance(long amount) {
        validateAmount(amount);
        if(amount > balance) {
            throw new InsufficientBalanceException("잔액이 부족합니다.");
        }
    }
}

// 예외 클래스 정의
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
