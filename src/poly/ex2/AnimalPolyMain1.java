package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Caw caw = new Caw();

        //Animal로 바꿔도 됨 부모라서 다 담기 가능
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();

        //마지막으로 오버라이드 된 것들이 호출 됨
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);


    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료" );
    }
}
