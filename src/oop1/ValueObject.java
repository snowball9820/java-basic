package oop1;

public class ValueObject {
    int value;
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }

    //데이터인 value와 해당 데이터를 사용하는 기능인 add() 메서드를 함께 정의
    //메서드는 객체를 생성해야 호출 가능, static이 붙으면 객체를 생성하지 않고도 메서드 호출 가능
    //여기서는 static 키워드를 사용하지 않았음
}
