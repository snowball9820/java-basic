package construct;

public class MemberDefault {
    String name;

    //기본 생성자
    public MemberDefault() {
        System.out.println("생성자 호출");

    }

    //기본 생성자를 왜 자동으로 만들까?
    //자바에서 기본 생성자를 만들어주지 않으면 생성자 기능이 필요하지 않은 상황에서도 개발자가 직접 정의해야 함
    //생성자는 반드시 호출되어야 함
    //생성자가 없으면 기본 생성자 제공
    //생성자가 하나라도 있으면 기본 생성자 제공 X, 이 경우 개발자가 정의한 생성자를 직접 호출

}
