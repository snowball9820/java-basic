package poly.ex4;


public class AbstractMain {
    public static void main(String[] args) {
        //추상 클래스 생성 불가
//        AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);


        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

}

//순수 추상클래스는 코드를 실행할 바디부분이 전혀 없음
//단지 다형성을 위한 부모역할로써 껍데기만을 제공
//**특징**
//인스턴스를 생성할 수 없음
//상속시 자식은 모든 메서드를 오버라이딩해야함
//주로 다형성을 위해 사용됨

//상속하는 클래스는 모든 메서드를 구현해야 함
//순수 추상 클래스는 마치 어떤 규격을 지켜서 구현해야 하는 것처럼 느껴짐
//인터페이스와 같이 느껴짐...ex)USB규격에 맞게 마우스 키보드를 만드는 것 처럼



