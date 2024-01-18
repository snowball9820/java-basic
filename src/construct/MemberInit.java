package construct;

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

        //this.name=name; 오른쪽 name은 매개변수 접근
        //this.name="user"; name 매개변수의 값 사용
        //x001.name="user"; this. 은 인스턴스 자신의 참조값을 뜻함, 따라서 인스턴스의 멤버 변수에 접근
        //this를 빼면 값이 세팅이 안됨
        //매개변수 이름과 멤버 변수 이름이 같은 경우 this를 통해 구분해줌

    }

}
