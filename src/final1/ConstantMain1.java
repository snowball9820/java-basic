package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 = "+1000); //2000으로 고치면?
        int currentUserCount=999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 = "+currentUserCount);
        if (currentUserCount > 1000) { //1000명 초과하면 대기자로등록 //여기도 2000으로 고쳐야됨
            System.out.println("대기자 등록");
        } else {
            System.out.println("게임에 참여가능");
        }
    }
}
