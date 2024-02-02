package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식변수가 자식인스턴스 참조
        Child child = new Child();
        System.out.println("Child->Child");
        System.out.println("value = " + child.value);
        child.method();
    }
}
