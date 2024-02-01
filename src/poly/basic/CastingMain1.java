package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //단 자식의 기능은 호출할 수 없음, 컴파일 오류 발생
        //poly.childMethod();
        //->poly.childMethod(); 호출하면 참조값을 사용해서 인스턴스를 찾음
        //poly는 Parent 타입
        //Parent는 최상위 부모, 상속관계는 부모로만 찾아 올라갈 수 있음 childMethod는 자식 타입에 있으므로 호출 할 수 없음

        //해결방법: 다운캐스팅(부모타입->자식타입)
        Child child = (Child) poly;//x001
        child.childMethod();

        //부모타입을 Child라는 자식타입으로 변경, 다운캐스팅
        //부모타입으로 변경하는 것을 업캐스팅

        //다운캐스팅 덕분에 child.childMethod()를 호출 할 수 있었음
        //childMethod()를 호출하기 위해 해당 인스턴스를 찾아간 다음 Child 타입을 찾음

    }
}
