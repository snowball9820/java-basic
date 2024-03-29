package poly.ex3;
//Animal과 같이 부모 클래스를 제공하지만 실제 생성되면 안되는 클래스를 추상클래스라고 함
//추상클래스는 이름 그대로 추상적인 개념을 제공->실체인 인스턴스가 존재하지 않음
//상속을 목적으로 사용되고 부모 클래스 역할을 담당
//추상 클래스는 기존 클래스와 같으나 new AbstractAnimal()과 같이 직접 인스턴스를 생성하지 못하는 제약있음

//추상메서드
//부모클래스를 상속받는 자식클래스가 반드시 오버라이딩 해야하는 메서드를 부모 클래스에 정의할 수 있음
//추상메서드는 이름 그대로 추상적인 개념 제공->실체 존재X, 메서드 바디가 없음

public abstract class AbstractAnimal {
    public abstract void sound();//추상메서드가 하나라도 있기 때문에 추상 클래스로 선언

    //상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 함
    //안하면 컴파일 오류, 반드시 오버라이딩 해야해서 바디부분이 없음, 바디부분 만들어도 컴파일 오류
    //오버라이딩 하지 않으면 자식도 추상클래스가 되어야 함
    //추상메서드는 기존메서드와 같으나 메서드 바디X, 자식 클래스가 해당 메서드를 반드시 오버라이딩 해야하는 제약 추가
    public void move() {
        System.out.println("동물이 움직임");
    }
    //abstract가 붙지 않아서 추상클래스가 아니므로 자식클래스가 오버라이딩 하지 않아도 됨

}

