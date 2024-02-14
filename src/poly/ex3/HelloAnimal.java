package poly.ex3;

public class HelloAnimal extends AbstractAnimal {
    //구현을 안하면 클래스에 abstract 추가해야함

    @Override
    public void sound() {
        System.out.println("HelloAnimal.sound");
    }


}
