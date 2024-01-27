package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data; //참조형 딱 한번만 담을 수 있음
        data = new Data();
//        data = new Data(); //compile error

        //참조 대상의 객체의 값은 변경 가능 //value가 final이 아니기 때문에 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }

}
