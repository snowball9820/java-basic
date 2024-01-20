package access.ex;

public class MaxCounter {

    private int count=0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증로직 검증 로직을 통과 못하면 return으로 빼고 검증완료되면 실행로직 실행
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }count++;//실행로직
//        if (count >= max) {
//            System.out.println("최대값을 초과할 수 없습니다.");
//        } else {
//            count++;
//        }***이렇게 짜도 됨
    }

    public int getCount() {
        return count;
    }


}
