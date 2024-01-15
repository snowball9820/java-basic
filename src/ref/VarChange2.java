package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value=10;
        Data dataB = dataA;  //실제 인스턴스는 하나고 같은 참조값을 가진다 인스턴스를 복사하는 것이 아니라 참조값만 복사해서 전달

        System.out.println("dataA 참조값 = "+dataA);
        System.out.println("dataB 참조값 = "+dataB);
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);

        System.out.println("=======================");

        dataA.value=20; ///참조값으로 이동해서 20으로 바꿈

        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);

        System.out.println("=======================");

        dataB.value=30; //dataB가 가르키는 인스턴스의 value값을 30으로 변경, 그런데 dataA,dataB 모두 같은 인스턴스를 참조하기에 같은 값을 출력하게 됨
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);




    }
}
