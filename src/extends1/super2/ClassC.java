package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10,20); //ClassB에서 생성자가 정의되어있으므로 직접 정의해줘야 함
        System.out.println("classC 생성자");

    }
}
