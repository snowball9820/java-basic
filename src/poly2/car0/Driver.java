package poly2.car0;

public class Driver {
    private K3Car k3car;//참조형의 경우 기본형이 Null

    public void setK3car(K3Car k3car) {
        this.k3car = k3car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        k3car.startEngine();
        k3car.pressAccelerator();
        k3car.offEngine();
    }

}
