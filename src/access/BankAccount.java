package access;

public class BankAccount {
    private int balance;

    //생성자 alt+insert 단축키 누르면 자동 생성(getter setter도 자동생성)
    public BankAccount() {
        balance = 0;
    }

    //public 메서드:deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;

        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //public 메서드:withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않거나 잔액이 부족합니다.");
        }
    }

    //public 메서드 :getBalance
    public int getBalance() {
        return balance;
    }


    //검증 메서드 private
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }

}


//데이터를 숨겨라
//객체에는 속성(데이터)과 기능(메서드)이 있음
//캡슐화에서 가장 필수로 숨겨야 하는 것이 속성(데이터)
//예시로 음악플레이어의 기능을 통해 사용하는 것이지 내부 데이터까지 사용하는건 아님
//***객체의 데이터는 객체가 제공하는 기능인 메서드를 통해 접근

//기능을 숨겨라
//객체의 기능 중 외부에서 사용하지 않고 내부에서만 사용하는 기능도 있음
//예시로 자동차를 운전하기 위해 자동차가 제공하는 복잡한 엔진조절기능, 배기기능까지 알필요가 없음
//사용자가 알아야 하는 꼭 필요한 기능 빼고는 모두 내부로 숨겨야 함
//***정리하면 데이터는 모두 숨기고 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화


