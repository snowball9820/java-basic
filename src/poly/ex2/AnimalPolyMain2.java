package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();

        //배열,for문 이용
        Animal[] animalArr = {dog, cat, caw};
//        Animal index1=dog;
//        Animal index2=cat;
//        Animal index3=caw;

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");


        }



    }

}

//animal 변수 타입은 Animal 이므로 Dog 인스턴스에 있는 Animal 부분을 찾아 sound() 메서드를 실행함
//그런데 하위 클래스 Dog에서 sound() 메서드를 오버라이딩 함
//따라서 오버라이딩한 메서드가 우선권을 가짐
//Dog,Cat,Caw 클래스에 있는 sound() 메서드가 호출됨

//여기서 코드 핵심은 Animal animal 부분
//다형적 참조 덕분에 animal.sound()를 호출해도 Dog.sound Cat.sound Caw.sound와 같이 각 인스턴스의 메서드 호출 가능
//만약 자바에 메서드 오버라이딩이 없으면 Animal클래스의 sound()가 호출되었을 것임

//다형적 참조로 타입을 하나로 맞출 수 있음
