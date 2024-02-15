package poly.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가!!
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);

    }
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

}
//클래스, 추상클래스, 인터페이스는 메모리 구조상 모두 같음
//인터페이스는 순수 추상클래스와 비슷하다고 보면 됨

//자바에는 순수추상클래스라는 단어가 없음 그냥 인터페이스를 만들면 되니까
//모든 메서드를 추상화하려면 인터페이스를 만듦
//클래스는 상속받는다고 하지만, 인터페이스는 구현이라고 함
//클래스는 부모기능을 물려받기 때문에 상속, 그러나 인터페이스는 정의한 모든 메서드를 자식이 오버라이딩해서 기능구현!

//인터페이스를 만든 이유?
//1.제약 인터페이스를 구현하는 곳에서 인터페이스의 메서드를 반드시 구현하라는 규약(제약)을 줌->인터페이스는 모든 메서드가 추상
//>순수 추상클래스는 자식클래스에 구현 안해도 그냥 물려받을 수도 있으니까... (인터페이스와 목적이 다름)
//2.다중 구현
//자바에서 클래스 상속은 부모를 하나만 지정, 인터페이스는 부모를 여러명 두는 다중 구현(다중 상속 가능)

//제약이 있어야 좋은 프로그램...



