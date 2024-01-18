package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1,"user1",15,90);


        MemberInit member2 = new MemberInit();
        initMember(member2,"user2",16,80);


        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);

        }

    }
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age=age;
        member.grade = grade;

    }

}
//initMember() 메서드를 통해 반복 제거
//그런데 이 메서드 대부분은 MemberInit 객체의 멤버 변수를 사용
//객체지향에서는 속성과 기능을 한 곳에 두는 것이 더 나은 방법
//MemberInit이 자기자신의 데이터를 변경하는 기능(메서드)}를 제공하는 것이 좋음
