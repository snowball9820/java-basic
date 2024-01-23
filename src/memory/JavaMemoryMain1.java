package memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");

    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");

    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");

    }
}
//마지막에 들어간게 먼저 나오는 stack 구조임
//    main start
//    method1 start
//    method2 start
//    method2 end
//    method1 end
//    main end

//처음 자바 프로그램을 실행하면 main1()을 실행
//이때 main()을 위한 스택 프레임이 생성됨
//main()은 method1()을 호출
//method1()스택 프레임 생성
//method1()은 m1,cal 지역변수(매개변수포함)을 가지므로 해당 지역 변수들이 스택프레임에 포함
//method1()은 method2()를 호출
//method2()스택 프레임 생성
//method2()는 m2 지역변수(매개변수포함)를 가지므로 해당 지역 변수가 스택 프레임에 포함

//method2가 종료되면 method2 스택프레임이 제거되고 매개면수 m2도 제거됨
//method1으로 돌아가는데 처음부터 시작하는 것이 아니라 method1에서 method2를 호출한 지점으로 돌아감
//method1이 종료되면 스택프레임 제거 후 지역변수 m1,cal도 제거되고 main으로 돌아감
//main이 종료됨
//더 이상 호출할 메서드도 없고 스택프레임도 비워지고 자바는 프로그램을 정리하고 종료함

//자바는 스택영역을 사용해서 메서드 호출고 지역변수(매개변수포함)를 관리
//메서드를 계속 호출하면 스택프레임에 쌓임
//지역변수(매개변수포함)는 스택영역에서 관리
//스택프레임이 종료되면 지역변수도 사라짐
//스택프레임이 모두 제거되면 프로그램 종룐