package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();//자기 자신
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }


}//모든 곳에서 public 이니까 사용 가능
class DefaultClass1 {

}//같은 패키지 안에서 사용

class DefaultClass2 {

}//같은 패키지 안에서 사용


//클래스 레벨의 접근 제어자 규칙
//public, default만 사용 가능
//public 클래스는 반드시 파일명과 이름이 같아야 함
//하나의 자바 파일 안에 public 클래스는 하나만 등장
//default 접근 제어자를 사용하는 클래스는 무한정 생성 가능
