package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a=10;
        int b=a; //a값을 복사해서 대입

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a 변경
        a=20;
        System.out.println("변경 a=20");
        System.out.println("a = " + a); //20
        System.out.println("b = " + b); //10 a값이 변경되어도 아무런 영향을 받지 않음

        //b변경
        b=30;
        System.out.println("변경 b=30");
        System.out.println("a = " + a); //20
        System.out.println("b = " + b); //30 본인의 값만 변경

    }
}
