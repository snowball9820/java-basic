package poly2.car0;

public class Driver {
    private K3Car k3car;//참조형의 경우 기본형이 Null
    private Model3Car model3Car;//model3Car 추가

    public void setK3car(K3Car k3car) {
        this.k3car = k3car;
    }

    //추가/사실 set만 입력해도 자동완성
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
//        k3car.startEngine();
//        k3car.pressAccelerator();
//        k3car.offEngine();
        if (k3car != null) {
            k3car.startEngine();
            k3car.pressAccelerator();
            k3car.offEngine();
        } else if (model3Car!=null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }

}
