package extends1.super2;

//상속관계의 인스턴스를 생성하면 결국 메모리 내부에는 자식 부모 클래스 모두 만들어짐
//따라서 각각의 생성자도 모두 호출되어야 함
//상속관계를 사용하면 자식클래스의 생성자에서 부모클래스의 생성자를 반드시 호출(규칙)
//상속관계에서 부모 생성자를 호출할 때 super를 사용하면 됨

public class ClassA {
    public ClassA() {
        System.out.println("ClassA 생성자");
    }
}
