package poly.ex1;

public class AnimalSountMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        //방법2 배열
//        Caw[] cawArr = {dog, cat, caw}; 이거도 서로 다른 타입이라 불가...
        //타입을 Cat, Dog, Caw 중에 하나로 지정해야 함

        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 테스트 종료");

        soundCaw(caw);//해결 되었다고 보기 힘듦 Dog, Cat 인수사용 불가
//        soundCaw(cat);//안에 다른걸 못넣어서 Cat Dog 메서드를 다 만들어 줘야됨 동물이 추가될때 마다 메서드 무한 생성

//        System.out.println("동물소리 테스트 시작");
//        cat.sound();
//        System.out.println("동물소리 테스트 종료");


    }

    //방법1 메서드
    private static void soundCaw(Caw caw) {
        System.out.println("동물소리 테스트 시작");
        caw.sound();
        System.out.println("동물소리 테스트 종료");

    }
}
//기존에 Caw가 없었으면 클래스를 하나 만들고 코드도 추가해야됨->중복
//Cat, Caw, Dog  부분은 중복이 증가 하게 됨
//중복을 제거하려면 배열이나 for문 사용 근데 지금 완전 서로 다른 클래스임...

//방법1,2모두 타입이 달라서 안된다는 문제가 있음->모두 같은 타입을 사용하게 하면 메서드와 배열 사용 가능!
//다형성의 핵심은 다형적 참조와 오버라이딩->이 둘 사용으로 Cat Dog Caw가 같은 타입을 사용하고 자신의 메서드 호출 가능


