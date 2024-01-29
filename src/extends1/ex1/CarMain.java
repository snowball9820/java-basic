package extends1.ex1;

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
//전기차(ElectricCar) 가솔린차(GasCar)를 만들었음
//두개 모두 이동 충전, 이동 주유 기능이 있음
//전기차와 가솔린차는 자동차보다 좀더 구체적인 개념
//반대로 자동차는 전기차와 가솔린차를 포함하는 추상적인 개념
//두개의 공통점은 바로 move()
//이럴 때 상속 관계를 사용하면 됨

