package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance= " + account.getBalance());
    }
}

//은행계좌 기능
//private
//balance 데이터 필드는 외부에 직접 노출X BankAccount가 제공하는 메서드를 통해서만 접근 가능
//isAmountValid() 입력 금액을 검증하는 기능은 내부에서만 필요한 기능

//public
//deposit() 입금
//withdraw() 출금
//getBalance() 잔고