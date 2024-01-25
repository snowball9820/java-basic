package static2;

public class DecoData {
//    static 메서드는 static만 사용 가능
//    클래스 내부 기능을 사용할 때 static 메서드는 static이 붙은 정적 메서드나 정적 변수만 사용 가능
//    인스턴스 변수나 메서드는 사용 불가
//    반대로 모든 곳에서 static 호출 가능
//    정적 메서드는 공용 기능 이기 때문에 접근제어자만 허락하면 클래스를 통해 모든 static 호출 가능

    private int instanceValue;
    private static int staticValue; //클래스 소속

    public static void staticCall() { //클래스 소속
//        instanceValue++; //인스턴스 변수에 접근 , compile error
//        instanceMethod(); //인스턴스 메서드에 접근, comile error


        staticValue++; //정적 변수에 접근  //클래스 소속 DecoData. 생략
        staticMethod(); //정적 메서드 접근 //클래스 소속 DecoData. 생략
    }

    //외부에서 참조값이 오면 다 호출할 수 있게 됨 static으로 선언해도 참조값이 생겼으니까
    public static void staticCall(DecoData data ) { //data=x001 참조값 생김
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수에 접근
        instanceMethod(); //인스턴스 메서드에 접근

        staticValue++; //정적 변수에 접근  //클래스 소속
        staticMethod(); //정적 메서드 접근 //클래스 소속

    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);

    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);

    }
}
