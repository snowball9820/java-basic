package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    //여기 코드는 새로운 결제수단이 추가되면 PayStore 부분만 수정하면 됨
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("결제 수단을 입력하세요: ");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.println("결제금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);

        }


    }
}
