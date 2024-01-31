package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);//this 생략 가능
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();

    }
}
//this는 자기 자신을 참조 생략 가능
//super는 부모 클래스에 대한 참조
//필드이름과 메서드 이름이 같지만 super를 사용해서 부모 클래스에 있는 기능 사용
