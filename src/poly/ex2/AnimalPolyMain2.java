package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();

        //배열,for문 이용
        //Animal타입의 배열을 만들고 다형적 참조를 사용하면 됨
        Animal[] animalArr = {dog, cat, caw};
//        Animal index1=dog;
//        Animal index2=cat;
//        Animal index3=caw;

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");


        }



    }

}

//배열은 같은 타입의 데이터를 나열할 수 있음
//Dog,Cat,Caw는 모두 Animal의 자식이므로 Animal 타입임
//