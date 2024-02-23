package poly.ex.pay0;
//결제 시스템 개발
//이 팀은 현재 2가지 결제 수단을 지원, 앞으로 5개의 결제 수단을 추가로 지원할 예정
//새로운 결제수단을 쉽게 추가할 수 있도록 기존 코드를 리펙토링 하시오

//요구 사항
//OCP원칙을 지킴
//메서드를 포함한 모든 코드 변경 가능, 클래스나 인터페이스 추가 가능
//단 프로그램을 실행하는 PayMain0코드는 변경X
//리펙토링 후에도 실행결과는 기존과 같아야 함

public class KakaoPay {
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount+"원 결제를 시도합니다.");
        return true;
    }
}
