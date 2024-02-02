package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식변수가 자식인스턴스 참조
        Child child = new Child();
        System.out.println("Child->Child");
        System.out.println("value = " + child.value);
        child.method();
        //child 변수는 Child타입 따라서 child.value, child.method() 모두 Child타입에서 기능을 찾고 실행

        //부모변수가 부모인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent->Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        //parend 변수는 Parent타입 따라서 parent.value, parent.method()를 호출하면 모두 Parent타입에서 기능을 찾고 실행

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //인스턴스는 자식, 참조는 부모
        System.out.println("Parent->Child");
        System.out.println("value = "+poly.value); //변수는 오버라이딩 불가
        poly.method();//메서드는 오버라이딩 가능 왜 Child.method???


    }
}
