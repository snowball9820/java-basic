package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data=new InitData();
        System.out.println("value1 = "+data.value1); //초기값을 지정하지 않았으나 0으로 자동 초기화
        System.out.println("value2 = "+data.value2); //10으로 초기값을 지정해서 10 출력
    }
}
