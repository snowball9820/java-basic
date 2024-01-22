package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField=1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField=2;
        data.defaultMethod();

//        //private 호출 불가
//        data.privateField=3;
//        dat.privateMethod();

        //외부에서 innerAccess는 public이니까 접근 가능
        //innerAccess() 메서드는 AccessData에 포함되어있음
        //그래서 자신의 private 필드와 메서드에 모두 접근 가능
        data.innerAccess();

    }

}
