package poly2.car1;
//새로운 Car 추가
//OCP (open-closed principle)
//좋은 객체 지향 설계 원칙 중 하나
//open for extension: 새로운 기능의 추가나 변경 사항이 생겼을 때 코드 확장 가능
//closed for modification 기존 코드는 수정되지 않아야 함
//확장에는 열려있고 변경에는 닫혀있다는 의미
//앞서 개발한 코드는 OCP 원칙을 잘 지키고 있음
public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}
