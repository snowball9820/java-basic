package poly2.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정함: "+car);
        this.car = car;
    }

    public void driver() {
        System.out.println("자동차를 운전함");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}

/*
Driver 클래스가 Car 객체를 직접적으로 생성하지 않고, 대신 외부에서 setCar 메서드를 통해 Car 객체를 주입.
이것은 의존성 주입(Dependency Injection)이라는 디자인 패턴의 한 예시
*/

/*
의존성 주입은 클래스간의 결합도를 낮추고 유연성을 높이는 데 도움이 됨.
이 패턴을 사용하면 Driver 클래스가 특정 유형의 Car에 종속되지 않고 어떤 종류의 Car 객체라도 사용할 수 있습니다. 따라서 코드의 재사용성과 유지보수성이 향상
*/