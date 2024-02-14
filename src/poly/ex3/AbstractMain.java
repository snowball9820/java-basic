package poly.ex3;


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

    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}

//추상클래스는 제약이 추가된 클래스일 뿐임
//일반 클래스와 메모리 구조 실행결과 모두 동일
//추상 클래스 덕분에 Animal 인스턴스를 생성할 문제를 근본적으로 방지해줌
//자식 클래스에 구현을 안하면 오류가 뜨니까 개발자가 실수하는 것을 막아줌
//추상메서드 덕분에 새로운 동물 자식 클래스를 만들 때 sound()를 오버라이딩 하지 않을 문제를 근본적으로 방지
