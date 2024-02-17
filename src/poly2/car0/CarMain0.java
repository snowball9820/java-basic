package poly2.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3car(k3Car); //이 시점에 k3 인스턴스를 가지게 됨
        driver.drive();

    }
}
