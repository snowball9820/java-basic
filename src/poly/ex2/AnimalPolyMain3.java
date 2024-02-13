package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        //배열,for문 이용
        //Animal타입의 배열을 만들고 다형적 참조를 사용하면 됨
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};  //변수 선언 하나로 합치기 ctrl+alt+N
//        Animal index1=dog;
//        Animal index2=cat;
//        Animal index3=caw;

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }
    //메서드를 자동으로 추출해주는 단축키 ctrl+alt+M
    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
//새로운 기능이 추가되었을 때 변하는 부분을 최소화 하는 것이 잘 작성된 코드임
//코드가 변하는 부분과 변하지 않는 부분을 명확하게 구분하는 연습하기