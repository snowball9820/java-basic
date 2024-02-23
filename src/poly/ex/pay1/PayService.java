package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {

        boolean result = false;
        System.out.println("결제를 시작합니다: option= " + option + " , amount= " + amount);
        //1.결제 수단 선택 -> 메서드로 빼기 전
//        Pay pay;
//        if (option.equals("kakao")) {
//            pay = new KakaoPay(); //객체를 계속 만들고 있음 추가할 때마다 이걸 인터페이스로 빼야지
//        } else if (option.equals("naver")) {
//            pay = new NaverPay();
//        } else {
//            pay = null;
//            System.out.println("결제 수단이 없습니다.");
//        }
        //1.결제 수단 선택 -> 메서드로 뽑은 결과물
        Pay pay = findPay(option);
        //2.실제결제
        //NullPointerException 처리
        if (pay != null) {
            result = pay.pay(amount);
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }

    }

    public Pay findPay(String option) {
        Pay pay;
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            System.out.println("결제 수단이 없습니다.");
            return null;
        }
    }
}
