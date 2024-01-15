package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value);//NullPointerException -> data=null이니까 참조할 수가 없음
//        System.out.println("bigData.data.value = " + bigData.nul.value); null이므로 참조값이 없어서 value를 찾을 수 없음



    }

}
