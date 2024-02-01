package poly.basic;

//upcasting downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1=(Parent) child; //업캐스팅은 생략 가능, 생략 권장 원래 다른 타입을 넣을 땐 무조건 캐스팅해야함
        Parent parent2=child;//생략 버전, 자바가 넣어줌 이렇게 쓰는게 기본

        parent1.parentMethod();
        parent2.parentMethod();


    }



}
