package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User UserB = new pack.b.User(); //중복일 때는 어쩔 수 없이 전체 경로를 적어줘야 하는 것이 생김
        //자주 사용하는 클래스를 import하고 적게 쓰는건 그냥 전체경로를 적어주자 어쩔 수 엇음
    }
}
