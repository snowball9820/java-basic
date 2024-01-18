package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); //PackageMain1과 Data는 같은 위치에 있음 -> 패키지 경로 생략 가능
        pack.a.User user = new pack.a.User(); //PackageMain1과 User는 다른 패키지에 위치 -> pack.a.User와 같이 전체 경로 포함해서 사용

    }
}
