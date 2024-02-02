package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2호출");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {//new Child();이면 실행
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;//다운캐스팅
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
//참고로 instanceof 키워드는 오른쪽 대상의 자식타입을 왼쪽에서 참조하는 경우에도 true 반환
//new Parent instanceof Parent -> parent가 Parent의 인스턴스를 참조하는 경우 true
//new Child instanceof Parent ->parent가 Child의 인스턴스를 참조하는 경우 true
//쉽게 말해 오른쪽에 있는 타입이 왼쪽에 있는 인스턴스의 타입이 들어갈 수 있는지 대입해보면 됨 대입가능하면 true, 불가능 false

//new Parent() instanceof Parent
//Parent p=new Parent() 같은 타입 true

//new Child() instanceof Parent
//Parent p=new Child() 부모는 자식타입 담을 수 있어서 true

//new Child() instanceof Child
//Child p=new Child() 같은 타입 true

//new Parent() instanceof Child
//Child p=new Parent() 자식은 부모타입 못담음 false
