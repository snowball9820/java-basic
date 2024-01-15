package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data=null;
        System.out.println("1. data = " + data);
        //이제 새로운 인스턴스를 생성하면 참조값을 변수에 할당
        data = new Data();
        System.out.println("2. data = " + data);
        //참조값을 가르키는 걸 다 지워버림 더 이상 인스턴스를 참조하지 않음
        data=null;
        System.out.println("3. data = " + data);
    }

}
