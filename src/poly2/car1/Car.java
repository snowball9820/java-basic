package poly2.car1;
//다형성을 활용해서 역할과 구분을 분리
//Driver: 운전자는 자동차(Car)역할에만 의존 /구현인 K3, Model3 자동차에 의존하지 않음
//인터페이스를 구현한 K3Car, Model3Car에 의존X, Car 인터페이스 참조
//Car는 자동차 역할이고 인터페이스, K3Car, Model3Car 클래스가 인터페이스를 구현함
public interface Car {
    void startEngine();

    void offEngine();

    void pressAccelerator();

}
