package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 생성자 초기화
        System.out.println("생성자 초기화");
        //생성자가 final이라서 딱 한번만 값 세팅 가능 이후에는 못바꿈
        //인스턴스 마다 값이 다름
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 필드 초기화
        //모든 인스턴스의 값은 같음 처음부터 설정되어있어서
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

    }
}
