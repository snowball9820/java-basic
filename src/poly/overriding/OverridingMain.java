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
        System.out.println("value = "+poly.value); //변수는 오버라이딩 불가 value = parent
        poly.method();//메서드는 오버라이딩 가능 왜 Child.method???

        //poly변수는 Parent타입 따라서 poly.value, poly.method()를 찾아 호출하면 인스턴스의 Parent타입에서 기능을 찾음
        //poly.value:Parent타입에 있는 value값을 읽음
        //poly.method():Parent타입에 있는 method()를 실행하려고 함 but
        //하위타입인 Child.method()가 오버라이딩 되어 있음!!!!
        //***오버라이딩 된 메서드는 항상* 언제나* 우선권을 가짐 따라서 Parent에서 내려와 Child.method()가 실행됨
        //오버라이딩은 부모타입에서 정의한 기능을 자식 타입에서 재정의 하는 것임
        //만약 자식에서도 오버라이딩, 손자에서도 같은 메서드를 오버라이딩하면 **손자의 오버라이딩 메서드가 최우선!
        //더 하위 자식의 오버라이딩 된 메서드가 절대적 우선권을 쥠
        //마지막에 오버라이딩 된 곳까지 내려가서 method를 찾음
    }
}

//다형적 참조 & 메서드 오버라이딩
//다형적 참조: 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능
//메서드 오버라이딩: 기존 기능을 하위 타입에서 새로운 기능으로 재정의

