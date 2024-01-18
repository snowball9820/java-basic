package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //객체를 만들고 바로 생성자 호출
        //인스턴스를 생성하고 나서 즉시 호출됨
        //생성자 이름은 무조건 클래스와 같게 만들어줌
        //그러나 생성자는 값을 안넣어주면 컴파일 오류 발생 >메서드는 실행은 됨 그러나 나중에 값이 없는 유령회원이 만들어질 수가 있는거임

        //생성자의 진짜 장점
        //객체를 정의할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야함
        //유령 회원이 시스템 내부에 등장할 가능성을 완전히 차단함 무조건 생성자를 호출해야해서
        //참고로 생성자를 메서드 오버로딩처럼 여러개 정의할 수 있는데 이 경우에는 하나만 호출하면 됨

        //생성자를 사용하면 필수값 입력을 보장할 수 있음
        //좋은 프로그램은 무한한 자유도 보다는 적절한 제약이 있어야 함

        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);

        }
    }
}
