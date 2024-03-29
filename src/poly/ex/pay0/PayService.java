package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {

        boolean result;

        System.out.println("결제를 시작합니다: option= " + option + " , amount= " + amount);
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay(); //객체를 계속 만들고 있음 추가할 때마다 이걸 인터페이스로 빼야지
            result = kakaoPay.pay(amount);//중복이 발생
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }

    }
}
