package extends1.overriding;

public class ElectricCar extends Car {
    //새로 재정의
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동함");
    }

    public void charge() {
        System.out.println("차를 충전함");
    }
}

//부모의 기능을 새로 재정의하는 것을 메서드 오버랑딩이라고 함
//ElecticCar의 move()를 호출하면 Car의 move가 아니라 ElectricCar move가 호출됨

//@Override
//애노테이션은 주석과 비슷한데 프로그램이 읽을 수 있는 특별한 주석
//상위 클래스의 메서드를 오버라이드하는 것을 나타냄
//오버라이딩한 메서드 위에 붙임
//없어도 동작하는데 문제 없지만... 안붙이면 오타냈을 때 그냥 문제없이 실행되는 것 처럼 보임
//애노테이션을 붙이면 컴파일 오류 에러 메세지가 뜸 실수를 잡기 좋음

//메서드 오버로딩
//메서드 이름이 같고 매개변수(파라미터)가 다른 메서드를 여러개 정의하는 것을 의미
//과적이라는 뜻으로 같은 이름의 메서드를 여러개 정의했다고 이해

//메서드 오버라이딩
//하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정 의미
//상속관계에서 사용
//부모의 기능을 자식이 다시 정의
//무언가를 넘어서 타는 것을 의미
//부모의 기존 기능을 넘어 타서 기존 기능을 새로운 기능으로 덮어버린다고 이해
//실행할 메서드를 이미 찾았기 때문에 인스턴스에서 부모타입을 찾지 않아도 됨

