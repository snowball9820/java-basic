package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("메서드 호출 전: a = "+a);
        changePrimitive(a); //자바는 변수의 값을 복사해서 대입할 뿐
        System.out.println("메서드 호출 후: a = "+a);
    }

    public static void changePrimitive(int x) {
        x=20; //x의 값만 20으로 변경됨 메서드 사용이 끝나면 메모리 삭제
    }
}
