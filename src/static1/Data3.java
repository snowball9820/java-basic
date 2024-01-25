package static1;

public class Data3 {

    public String name;
    public static int count;//static 키워드를 사용하면 공용으로 함께 사용하는 변수를 만들 수 있음

    public Data3(String name) {
        this.name = name;
        count++; //붕어빵 틀에 접근을 해서 바로 증가시키는 것과 같음 메서드 영역이니까
        //Data3의 생성자와 같이 자신의 클래스에 있는 정적 변수라면 클래스명 생략 가능 Data3.count->count
    }
}
//멤버 변수에 static을 붙이게 되면 static 변수, 정적 변수, 클래스 변수라고 함
//객체가 생성되면 생성자에서 정적 변수 count의 값을 하나 증가 시킴

