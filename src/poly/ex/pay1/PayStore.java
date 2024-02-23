package poly.ex.pay1;

//결제수단을 관리하고 보관
public abstract class PayStore {
    //*코드 변경이 있는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}

