package poly.basic;

//자바 16부터 Pattern Matching for instanceof
//instanceof를 사용하면서 동시에 변수선언 가능
public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2호출");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //Child인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) {//여기에서 변수 선언
            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent;//다운 캐스팅을 따로 해줬는데 지워도 됨
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
