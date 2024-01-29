package extends1.overriding;
//부모 클래스
public class Car {
    public void move() {
        System.out.println("차를 이동함");
    }

    //추가 문열기 기능, 자식 모두에게 물려줌
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }

}
