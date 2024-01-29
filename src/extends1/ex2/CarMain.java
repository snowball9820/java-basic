package extends1.ex2;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();


    }
}

//extends로 부모 코드를 자식코드가 물려받을 수 있음 그 반대는 불가 부모코드에는 자식코드에 대한 정보 X
//단일 상속
//자바는 다중상속X
//extend 대상은 하나만 선택==부모를 하나만 선택할 수 있다는 의미
//그러나 부모가 또 다른 부모를 가질 순 있음 부모 위에 부모
