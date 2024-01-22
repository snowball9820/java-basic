package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicField 호출= " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultField = " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateField = " + privateField);
    }

    //innderAccess 메서드는 내부호출을 보여줌, 자기자신에게 접근, 따라서 private를 포함한 모든 곳에 접근 가능
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField=100;
        defaultField=200;
        privateField=300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
