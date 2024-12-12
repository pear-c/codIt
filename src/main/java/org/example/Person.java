package org.example;

public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    // Getter, Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCashAmount() {
        return cashAmount;
    }
    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }
    public BankAccount getAccount() {
        return account;
    }
    public void setAccount(BankAccount account) {
        this.account = account;
    }

    // 생성자 1
    public Person(String pName, int pAge) {
        this.name = pName;
        if(pAge < 0) {
            this.age = 12;
        }
        else {
            this.age = pAge;
        }
        this.cashAmount = 0;
    }
    // 생성자 2
    public Person(String pName, int pAge, int pCashAmount) {
        this.name = pName;
        if(pAge < 0) {
            this.age = 12;
        }
        else {
            this.age = pAge;
        }
        if(pCashAmount < 0) {
            this.cashAmount = 0;
        }
        else {
            this.cashAmount = pCashAmount;
        }
    }

    // 송금 메소드 1
    public boolean transfer(Person to, int amount) {
        if(amount < 0 || amount > account.getBalance()) {
            System.out.println("false - from: " + name + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + account.getBalance());
            return false;
        }
        else {
            account.setBalance(account.getBalance() - amount);
            to.getAccount().setBalance(to.getAccount().getBalance() + amount);
            System.out.println("true - from: " + name + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + account.getBalance());
            return true;
        }
    }
    // 송금 메소드 2
    public boolean transfer(BankAccount to, int amount) {
        if(amount < 0 || amount > account.getBalance()) {
            System.out.println("false - from: " + name + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + account.getBalance());
            return false;
        }
        else {
            account.setBalance(account.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            System.out.println("true - from: " + name + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + account.getBalance());
            return true;
        }
    }
}
