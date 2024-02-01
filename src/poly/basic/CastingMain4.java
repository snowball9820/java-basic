package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;//캐스팅
        child1.childMethod();//문제 없음

        Parent parent2 = new Parent();
        Child child2=(Child) parent2;//java.lang.ClassCastException 오류 (런타임오류)
        child2.childMethod();//실행불가

        //new Parent를 만들었음 메모리 상에 Parent만 생성됨 Child 없음
        //parent2를 Child타입으로 다운캐스팅함
        //그런데 parent2는 Parent로 생성됨->Child가 존재하지 않아서 사용할 수 없음
        //자바에서는 이렇게 사용할 수 없는 타입으로 다운캐스팅하면 ClassCastException 예외 발생

    }
}

//업캐스팅이 안전하고 다운 캐스팅이 위험한 이유
//업캐스팅의 경우 이런 문제 발생X-> 업캐스팅은 메모리상에 인스턴스가 모두 존재(상위에 있는 것들을 모두 인스턴스로 만들기 때문)
//다운캐스팅은 인스턴스에 존재하지 않는 하위 타입 때문에 캐스팅 문제 발생
//객체를 생성하면 부모타입은 모두 생성 자식 타입은 생성X->개발자가 인지하고 명시적으로 캐스팅해주어야 함

//*컴파일 오류vs런타임 오류
//컴파일 오류:변수명 오타, 잘못된 클래스 이름 사용 등 자바 프로그램 실행 전 발생하는 오류 IDE에서 즉시 확인 가능(오히려 좋음)
//런타임 오류:프로그램이 실행되고 있는 시점에서 발생하는 오류, 고객이 해당 프로그램을 실행하는 도중에 발생(매우 안좋은 오류)



