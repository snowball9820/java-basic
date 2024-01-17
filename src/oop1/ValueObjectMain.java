package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {

        ValueObject valueObject = new ValueObject();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자 : " + valueObject.value);

    }

    //valueObject라는 객체를 생성
    //이 객체는 멤버 변수 뿐만 아니라 내부에 기능을 수행하는 add() 메서드도 함께 존재

    //valueObject.add(); //1
    //x002.add(); //2
    //add()메서드를 호출하면 메서드 내부에서 value++을 호출
    //이때 value에 접근해야 하는데 기본으로 본인 인스턴스에 있는 멤버 변수에 접근
    //본인 인스턴스가 x002 참조값을 사용하기에 자기자신 x002.value로 접근
    //정리
    //클래스는 속성(데이터, 멤버변수)와 기능(메서드)를 정의할 수 있음
    //객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근 가능
    //객체의 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수임



}
