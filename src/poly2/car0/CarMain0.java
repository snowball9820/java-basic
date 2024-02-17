package poly2.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3car(k3Car); //이 시점에 k3 인스턴스를 가지게 됨
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3car(null);//K3car에 null을 넣어줘서 Model3Car로 바꿔탐
        driver.setModel3Car(model3Car);

        driver.drive();


    }
}
//지금 이 코드는 새로운 차량을 추가할 때 마다 Driver 코드를 많이 변경하게 됨
//차량의 종류가 늘어난다면 점점 더 변경 부분이 증가할 것임->고쳐야됨