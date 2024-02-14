package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        //Animal 클래스를 생성할 수 있는 문제
        Animal animal1 = new Animal();
        animal1.sound();
        //개 고양이 소가 실제 존재하는 것은 당연, 동물이라는 추상적인 개념이 실제로 존재하는 것은 이상
        //사실 이 클래스는 다형성을 위해 필요, 직접 인스턴스를 생성하고 사용할 일 없음
        //그러나 Animal도 클래스이기 때문에 인스턴스를 생성하고 사용하는데 아무 제약X
        //제대로된 기능은 수행하진 않음


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

//Pig클래스를 만든다고 가정
//Pig 클래스가 sound()메서드를 오버라이딩해서 꿀꿀 소리가 나와야 됨
//근데 개발자가 실수로 오버라이딩 하는 걸 잊음->부모기능을 상속받으니까 코드상 아무런 문제는 없음
//->추상클래스와 추상메서드를 사용하면 한번에 해결 가능!!