package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모변수가 부모 인스턴스 참조
        System.out.println("Parent->Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식변수가 자식 인스턴스 참조
        System.out.println("Child->Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent->Child");
        Parent poly = new Child();
        poly.parentMethod();
//        Child child1=new Parent(); 컴파일 오류
        //poly.childMethod(); 이것도 안됨 자식 기능을 호출할 수 없음
        //부모 타입은 자식 타입을 담을 수 있음(자바에서 부모타입은 자식 타입 담기 가능)
        //반대로 자식 타입은 부모 타입 담을 수 없음 Child child1=new Parent() 컴파일 오류

    }
}

//다형적 참조
//지금까지는 항상 같은 타입에 참조를 대입
//Parent parent=new Parent()
//Child child=new Child()
//그런데 Parent타입의 변수는 자식 타입까지 참조 가능 손자가 있다면 손자도 그 하위타입도 참조 가능
//Parent poly=new Child()
//Parent poly=new Grandson()
//자바에서 부모는 물론, 자신의 기준으로 모든 자식타입을 참조 가능