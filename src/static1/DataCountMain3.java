package static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count); //data1.count가 아님 정적 변수에 접근하는 방법은 다름
        //static에 있는 count1 증가

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);
        //static에 있는 count1 증가
        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);
        //static에 있는 count1 증가
    }
}
//정적 변수에 접근하기 위해 Data3.count와 같이 클래스명에 . 을 사용함, 클래스에 직접 접근하는 것 처럼 느껴짐
//A count = 1
//B count = 2
//C count = 3
//출력값은 제대로 나옴

//static이 붙은 멤버 변수는 메서드 영역에서 관리함, heap영역X
//static이 붙은 멤버 변수 count는 인스턴스 영역에 생서되지 않음 대신 메서드 영역에서 관리
//Data3("A")인스턴스를 생성하면 생성자가 호출 됨
//생성자에는 count++코드가 있음 count는 static이 붙은 정적 변수임, 정적 변수는 메서드 영역에서 관리함
//메서드 영역에 있는 count값이 하나 증가 함
//붕어빵 틀에서 관리하는 변수라고 보면 됩니당

//정리
//static변수는 쉽게 이야기해서 붕어빵 틀이 특별히 관리하는 변수! 붕어빵 틀은 1개니까 클래스 변수도 하나만 존재
//인스턴스는 붕어빵 인스턴스 수만큼 변수 존재...
