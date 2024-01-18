package contruct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //MethodInitMain3에 사용하려고 추가
    //initMember는 Member에 초기값 설정 기능을 제공하는 메서드
    //   member1.initMember("user1", 15, 90);와 같이 메서드를 호출하면
    //객체의 멤버 변수 인자로 넘어온 값을 채움
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age=age;
        this.grade = grade;

    }

}
