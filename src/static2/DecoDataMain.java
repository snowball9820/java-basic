package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.staticCall();

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

//1.정적 호출
//staticValue = 1
//2.인스턴스 호출1
//instanceValue = 1
//staticValue = 2 //원래부터 있던 static 변수라 2가 됨

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
//2.인스턴스 호출2
//instanceValue = 1 //새롭게 생성되어서 1
//staticValue = 3 //static 변수라 3으로 증가

        DecoData.staticCall(data1);

        //추가
        //인스터스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); //인스턴스로 먼저 접근하고 이건 클래스에 있어 하고 보냄


        //클래스를 통한 접근
        DecoData.staticCall();

    }
}

//정적 메서드가 인스턴스기능을 사용할 수 없는 이유
//정적메서드는 클래스 이름을 통해 바로 호출 가능, 인스턴스처럼 참조값의 개념이 없음
//특정 인스턴스의 기능을 이용하려면 참조값을 알아야하는데 정적 메서드는 참조값 없이 호출
//따라서 정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드 사용 불가