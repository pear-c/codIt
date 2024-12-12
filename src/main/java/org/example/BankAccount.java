package org.example;

public class BankAccount {
    private int balance;
    private Person owner;

    // Getter, Setter
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // 생성자 1
    public BankAccount(int pBalance) {
        if(pBalance < 0) {
            this.balance = 0;
        } else {
            this.balance = pBalance;
        }
    }
    // 생성자 2
    public BankAccount(Person pOwner) {
        this.owner = pOwner;
        this.balance = 0;
    }
    // 생성자 3
    public BankAccount(int pBalance, Person pOwner) {
        if(pBalance < 0) {
            this.balance = 0;
        } else {
            this.balance = pBalance;
        }
        this.owner = pOwner;
    }

    // 입금 메소드
    public boolean deposit(int amount) {
        if(amount < 0 || amount > owner.getCashAmount()) {
            System.out.println("입금 실패입니다. 잔고: " + balance + ", 현금: " + owner.getCashAmount() + "원");
            return false;
        }
        else {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }
    // 출금 메소드
    public boolean withdraw(int amount) {
        if(amount < 0 || amount > balance) {
            System.out.println("출금 실패입니다. 잔고: " + balance + ", 현금: " + owner.getCashAmount() + "원");
            return false;
        }
        else {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }
    // 송금 메소드 1
    public boolean transfer(Person to, int amount) {
        if(amount < 0 || amount > balance) {
            System.out.println("false - from: " + owner.getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + balance);
            return false;
        }
        else {
            balance -= amount;
            to.getAccount().setBalance(to.getAccount().getBalance() + amount);
            System.out.println("true - from: " + owner.getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + balance);
            return true;
        }
    }
    // 송금 메소드 2
    public boolean transfer(BankAccount to, int amount) {
        if(amount < 0 || amount > balance) {
            System.out.println("false - from: " + owner.getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + balance);
            return false;
        }
        else {
            balance -= amount;
            to.setBalance(to.getBalance() + amount);
            System.out.println("true - from: " + owner.getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + balance);
            return true;
        }
    }
}
