package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        super();//기본 생성자 생략 가능
        System.out.println("Class B 생성자 a= " + a);
    }

    public ClassB(int a, int b) {
        super();//기본 생성자 생략 가능
        System.out.println("Class B 생성자 = " + a + " b= " + b);
    }
}

//this를 쓸 수도 있는데 언젠가는 마지막에 한번 super를 써줘야 함 생성자가 여러개 있다면
//Parent Child 가 만들어지고 초기화해야하는데 생성자를 만들어줘야 함
//상속관계의 생성자 호출은 부모에서 자식 순으로 실행, 부모의 데이터 먼저 초기화 그 다음 자식의 데이터 초기화
//자식 클래스의 첫줄에 반드시 super를 호출, 그러나 기본 생성자 super인 경우 생략 가능...
