package final1;
//상수는 변하지 않고 일정한 값을 갖는 수를 의미
//자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값을 상수라고 함
//static final 키워드 사용

//자바 상수 특징
//static final
//대문자 사용, 구분은 _ (언더스코어) 로 함(관례) 일반적인 변수와 구분을 위함
//필드를 직접 접근해서 사용
//상수는 기능이 아니라 고정된 값 자체를 사용하는 목적
//상수는 값을 변경 가능, 필드에 직접 접근해도 데이터가 변하는 문제 발생 X
public class Constant {
    //수학 상수
    public static final double PI = 3.14;
    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTE_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;
    //애플리케이션 설정 상수
    public static final int MAX_USERS = 1000; //중앙에서 한번에 관리 가능 여기서 변경하면 됨 ConstantMain1/2

}
//애플리케이션 안에는 다양한 상수 존재, 수학/시간 등 실생활에서 사용하는 상수부터 애플리케이션 설정을 위한 상수 존재
//애플리케이션 전반에서 사용하므로 public/ 특정 위치에서 사용하면 다른 접근 제어자 사용하면 됨
//상수는 중앙에서 값을 하나로 관리할 수 있다는 장점
//상수는 런타임에 변경할 수 없음 상수를 변경하려면 프로그램 종류 후 코드를 변경한 다음 다시 실행해야 함