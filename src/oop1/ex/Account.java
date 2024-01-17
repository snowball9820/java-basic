package oop1.ex;

public class Account {
    int balance;


    void deposit(int amount) {
        balance += amount;

    }

    void withdraw(int amount) {
        //잔고가 있어야지 출금 가능
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
