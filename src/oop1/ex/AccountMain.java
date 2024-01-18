package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고 : " + account.balance);
    }
}

//객체 지향 프로그래밍은 모든 사물을 속성과 기능을 가진 객체로 생각하는 것
//객체에는 속성과 기능만 존재
//이렇게 단순화하면 세상에 있는 모든 객체들을 컴퓨터 프로그램으로 쉽게 설계 가능
//객체지향의 특징은 속성과 기능을 하나로 묶는 것 뿐만 아니라 캡슐화, 상속, 다형성, 추상화, 메시지 전달과 같은 다양한 특징이 있음