package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //객체를 만들고 바로 생성자 호출
        //인스턴스를 생성하고 나서 즉시 호출됨
        //생성자 이름은 무조건 클래스와 같게 만들어줌

        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);

        }
    }
}
