package poly.overriding;

public class Child extends Parent {
    public String value = "child";

    //ctrl+o -> overriding 자동완성
    //지금 Parent의 method를 오버라이딩했기 때문에 우선권을 가진 상태
    @Override
    public void method() {
        System.out.println("Child.method");//재정의
    }
}
