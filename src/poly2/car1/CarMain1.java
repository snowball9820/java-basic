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

        //OCP원칙 확인-새로운 차량 추가(model3->newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);//의존관계주입 객체의존관계/ newCar를 호출, Driver의 Car car 필드가 newCar의 인스턴스를 참조하도록 변경
        driver.driver();//호출하면 x003를 참조/ Car 필드가 Car 타입이므로 Car타입을 찾아서 실행하지만 메서드 오버라이딩에 의해 newCar 기능 호출
    }
}

//지금 새로운 차량을 계속 추가해도 Driver의 코드는 전혀 변경하지 않음
//운전할 수 있는 차 종류가 늘어나도 Car를 사용하는 Driver의 코드는 변경X
//main() 일부를 제외한 프로그램의 핵심 부분의 코드는 전혀 수정X
//Driver->Car 클래스 의존관계
//1.확장에 열려있다는 의미
//Car 인터페이스를 사용해 새로운 차량 자유롭게 추가, 인터페이스를 구현해서 기능을 추가할 수 있음
//Car 인터페이스를 사용하는 클라이언트 코드인 Driver도 Car 인터페이스를 통해 새롭게 추가된 차량을 자유롭게 호출 가능
//2.코드 수정은 닫혀 있다는 의미
//새로운 차를 추가하게 되면 기능이 추가되기 때문에 기존 코드의 수정을 불가피->당연히 어딘가의 코드는 수정해야함(변하는 부분과 변하지 않는 부분 정확히 구분)
//-"변하지 않는 부분"
//새로운 자동차를 추가할 때가장 영향을 받는 중요한 클라이언트는 바로 Car기능을 사용하는 Driver 임
//***핵심은 Car 인터페이스를 사용하는 클라이언트인 Driver의 코드를 수정하지 않아도 된다는 의미
//-"
