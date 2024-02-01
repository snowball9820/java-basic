package poly.basic;

//다운 캐스킹 너무 번거로움
//일시적으로 다운캐스팅해서 인스턴스에 있는 하위 클래스의 기능 바로 호출 가능
public class CastingMain2 {
    //일시적 다운 캐스팅

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //단 자식의 기능은 호출할 수 없음, 컴파일 오류 발생
        //poly.childMethod();

        //해결방법: 다운캐스팅(부모타입->자식타입)
//        Child child = (Child) poly;//x001
//        child.childMethod();
//
        //일시적 다운 캐스팅-해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();


    }

}
