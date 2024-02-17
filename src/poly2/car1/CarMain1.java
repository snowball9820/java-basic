package poly2.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);//의존관계주입 객체의존관계
        driver.driver();

        //차량 변경(k->model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);//의존관계주입 객체의존관계/ model3Car를 호출, Driver의 Car car 필드가 Model3Car의 인스턴스를 참조하도록 변경
        driver.driver();//호출하면 x002를 참조/ Car 필드가 Car 타입이므로 Car타입을 찾아서 실행하지만 메서드 오버라이딩에 의해 Model3Car 기능 호출
    }
}
