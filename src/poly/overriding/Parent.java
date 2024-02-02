package poly.overriding;

//다형성을 이루는 중요한 핵심 *메서드 오버라이딩
//메서드 오버라이딩에서 기억할 점: 오버라이딩 된 메서드가 항상 우선권을 가짐
//기존 기능을 덮어 새로운 기능을 재정의 한다는 뜻의 오버라이딩
//메서드 오버라이딩은 다형성과 함께 사용할 때 힘이 나타남(그동안은 반쪽짜리)


public class Parent {
    public String value = "parent";

    public void method() {
        System.out.println("Parent.method");
    }
}
