package poly.diamond;

public class Child implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");

    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");

    }
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");

    }

}

//클래스와 달리 인터페이스는 다중구현 가능
//어차피 자식에서 모두 구현을 해야하고 부모는 추상만 있기 때문에 상관 없어서 다중구현 가능
//클래스는 부모에서 구현된 것들도 있어서 다중구현 X

