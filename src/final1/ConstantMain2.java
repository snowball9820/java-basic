package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 = "+Constant.MAX_USERS); //2000으로 고치면? 그냥 Constant로 가서 2000으로 하나만 수정
        int currentUserCount=999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 = "+currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) { //Constant.MAX_USERS 변수명만 봐도 어떤 수를 의미하는지 바로 파악
            System.out.println("대기자 등록");
        } else {
            System.out.println("게임에 참여가능");
        }
    }
}
