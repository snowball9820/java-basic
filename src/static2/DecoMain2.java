package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello Java";
        String deco = DecoUtil2.deco(s);//붕어빵 틀 클래스로 바로 가서 부름 , 인스턴스 생성X

        System.out.println("before = " + s);
        System.out.println("after = " + deco);
    }
}

//static이 붙은 정적 메서드는 객체 생성 없이 클래스명+.+메서드 명으로 바로 호출 가능

//1.클래스 메서드
//메서드 앞에 static붙음
//이것은 정적 메서드 혹은 클래스 메서드라고 함
//클래스 메서드라는 용어는 인스턴스 생성 없이 마치 클래스에 있는 메서드를 바로 호출하는 것 처럼 느껴짐

//2.인스턴스 메서드
//static이 붙지 않은 메서드는 인스턴스를 생성해야 호출 가능
