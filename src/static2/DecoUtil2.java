package static2;

public class DecoUtil2 {
    //특정 문자열을 꾸며주는 간단한 기능 예제
    //hello라는 문자를 꾸민다면 *hello* 이렇게

    public static String deco(String str) { //static추가 정적 메서드를 만들 수 있음, 이 정적 메서드는 정적 변수 처럼 인스턴스 생성 없이 클래스명으로 호출 가능
        String result = "*" + str + "*";
        return result;

        //return  "*" + str + "*"; 그냥 바로 이렇게 해도 됨
    }
}

//멤버 변수도 없고 단순히 기능만 제공 인스턴스가 필요한 이유는? 인스턴스를 사용하는 목적이 큰데
//여기는 메서드는 사용하는 변수도 없고 기능만 제공