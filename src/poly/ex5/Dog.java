package poly.ex5;

public class Dog implements InterfaceAnimal{ //interface를 상속받을 때는 implements 사용
    @Override
    public void sound() {
        System.out.println("멍멍");

    }
    @Override
    public void move() {
        System.out.println("강아지 폴짝");

    }
}
