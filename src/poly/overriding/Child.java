package poly.overriding;

public class Child extends Parent {
    public String value = "child";

    //ctrl+o -> overriding 자동완성
    @Override
    public void method() {
        System.out.println("Child.method");//재정의
    }
}
