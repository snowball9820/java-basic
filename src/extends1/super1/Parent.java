package extends1.super1;
//부모와 자식의 필드명이 같거나 메서드가 오버라이딩 되어 있으면 자식에서 부모의 필드나 메서드 호출 불가
//이때 super 키워드를 사용하면 부모 참조 가능
public class Parent {
    public String value = "parent";

    public void hello() {
        System.out.println("Parent.hello");
    }

}
