package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //말 그대로 끝 이라는 뜻
        //변수에 final 키워드가 붙으면 값 변경 불가
        //class method 포함 여러 곳에 붙을 수 있음

        //final 지역변수1
        final int data1;
        data1 = 10;//최초 한번만 할당 가능
//        data1 = 20;//컴파일 오류

        //final 지역변수2
        final int data2 = 10;
//        data2=20;
    }

    static void method(final int parameter) {
//        parameter=20; 컴파일 오류 한번 값이 들어오면 끝 이후 변경 불가니까

    }

}
