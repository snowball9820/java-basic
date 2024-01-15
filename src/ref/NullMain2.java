package ref;

public class NullMain2 {
    //NullPointerException -> null을 가르키다 이 때 발생하는 예외=null은 없다, 주소가 없는 곳을 찾아감
    //주소지 없이 택배를 보내면 어떤 문제-> 참조값 없이 객체를 찾아가면 어떤 문제 발생?

    public static void main(String[] args) {
        Data data=null;
        data.value=10; //NullPointerException 예외 발생
        System.out.println("data = " + data.value);
//
//        Data data=null;
//        null.value=10; 지금 data가 null인데 참조값이 없는데 어떻게 찾아감... .을 찍으면 그 참조값을 찾아간다는 의미인데
//        System.out.println("data = " + data.value);
    }
}
