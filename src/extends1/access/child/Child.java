package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1;//상속관계 또는 같은 패키지 여기서는 상속관계니까 가능
//        defaultValue=1; 서로 다른패키지라 불가
//        privateValue=1; 접근 불가 컴파일 오류

        publicMethod();
        protectedMethod();//상속관계라 가능
//        defaultMethod();
//        privateMethod();

        printParent();//일단 public으로 만들었고 안에 있는건 실행 가능

    }
}
