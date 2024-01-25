package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);//Data2에서 counter의 값을 하나 증가시켜줌 0->1
        System.out.println("A count = " + counter.count);
        //Data("A") 인스턴스를 생성하면 생성자를 통해 Counter 인스턴스에 있는 count값을 하나 증가시킴


        Data2 data2 = new Data2("B", counter);//Data2에서 counter의 값을 하나 증가시켜줌 1->2
        System.out.println("B count = " + counter.count);
        //Data("B") 인스턴스를 생성하면 생성자를 통해 Counter 인스턴스에 있는 count값을 하나 증가시킴


        Data2 data3 = new Data2("C", counter);//Data2에서 counter의 값을 하나 증가시켜줌 2->3
        System.out.println("C count = " + counter.count);
        //Data("C") 인스턴스를 생성하면 생성자를 통해 Counter 인스턴스에 있는 count값을 하나 증가시킴

        //Counter 인스턴스를 공용으로 사용한 덕분에 객체를 생성할 때마다 값을 정확하게 증가시킬 수 있었음

        //Counter 인스턴스는 하나가 생성이 되는 것임
        //Data2 인스턴스는 A,B,C 3개가 생성되는데 하나의 Counter 인스턴스를 공유함

        //여기서 불편한 점
        //Data2와 관련된 일인데 Counter라는 별도의 클래스를 추가 사용
        //생성자의 매개변수도 추가됨, 생성자가 복잡해지고 생성자를 호출하는 부분도 복잡해짐


    }
}
