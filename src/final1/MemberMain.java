package final1;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "moon");
        member.print();
        member.changeData("hee");
        member.print();

//        id : myId, name : moon
//        id : myId, name : hee
        //id 못바꿈

    }
}
