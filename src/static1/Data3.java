package static1;

public class Data3 {

    public String name;
    public static int count;//static 키워드를 사용하면 공용으로 함께 사용하는 변수를 만들 수 있음

    public Data3(String name) {
        this.name = name;
        count++; //붕어빵 틀에 접근을 해서 바로 증가시키는 것과 같음 메서드 영역이니까
        //Data3의 생성자와 같이 자신의 클래스에 있는 정적 변수라면 클래스명 생략 가능 Data3.count->count
    }
}
//멤버 변수에 static을 붙이게 되면 static 변수, 정적 변수, 클래스 변수라고 함
//객체가 생성되면 생성자에서 정적 변수 count의 값을 하나 증가 시킴

//멤버 변수(필드)의 종류
//1.인스턴스 변수
//static이 붙지 않은 멤버 변수 ex)name
//static이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고 인스턴스에 소속
//인스턴스 변수는 인스턴스를 만들 때 마다 새로 만들어짐

//2.클래스 변수
//static이 붙은 변수 ex)count
//static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용 가능, 클래스 자체에 소속
//클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어짐
//인스턴스와 다르게 보통 여러곳에서 공유하는 목적으로 사용

//변수와 생명주기

//*지역 변수(매개변수 포함)
// 지역변수는 스택 영역에 있는 스택 프레임 안에 보관
//메서드가 종료되면 스택프레임도 제거됨
//스택 프레임에 포함된 지역 변수도 함께 제거
//지역 변수는 생명주기가 짧음

//*인스턴스 변수
//인스턴스에 있는 멤버 변수를 인스턴스 변수라고 함
//인스턴스 변수는 힙 영역을 사용
//힙 영역은 GC(가비지 컬렌션) 발생 전까지 생존, 지역변수보다 생존주기 김

//*클래스 변수
//클래스 변수는 메서드 영여의 static 영역에 보관됨
//메서드 영역은 프로그램 전체에서 사용하는 공용 공간
//클래스 변수는 해당 JVM에 로딩되는 순간 생성
//JVM이 종료될 때까지 생명주기 이어짐 가장 긴 생명주기

//왜 static?
//힙 영역에 있는 인스턴스 변수는 동적으로 생성
//static은 프로그램 실행하면 만들어지고 종료시점에 제거.. 말 그대로 정적


