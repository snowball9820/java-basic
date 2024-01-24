package static1;

public class Data1 {
    //생성된 객체 수를 세어야 함
    //객체가 생성될 때마다 생성자를 통해 인스턴스의 멤버 변수인 count 값을 증가
    //참고로 예제를 단순하게 만들기 위해 public 사용
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;
    }
}
