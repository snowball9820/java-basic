package construct;

public class MemberDefaultMain {
    //기본 생성자
    //매개변수가 없는 생성자
    //클래스에 생성자가 하나도 없으면 자바 컴파일러가 매개변수오 작동하는 코드가 없는 기본생성자를 자동으로 생성
    //그러나 생성자가 하나라도 존재하면 기본생성자를 만들지 않음

    //MemberInit 클래스가 자동으로 기본생성자 만든거

    public static void main(String[] args) {
        MemberDefault memberDefault = new MemberDefault();
    }
}
