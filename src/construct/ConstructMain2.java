package construct;

public class ConstructMain2 {
    //생성자 오버로딩 확인
    //생성자 오버로딩을 통해 여러개 중에 원하는 생성자를 호출할 수 있음
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);//grade에 50이 자동으로 들어감

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);

        }
    }
}
