package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001 BigData class
        bigData.data = new Data(); //x002 Data class

        //BigData 인스턴스는 x001의 참조값을 가짐
        //x001 참조 값 인스턴스 안에 data도 객체생성을 해주면 x002라는 참조값을 가짐
        //Data 인스턴스의 value는 0임
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value);






    }

}
