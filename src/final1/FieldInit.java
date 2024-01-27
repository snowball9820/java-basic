package final1;

public class FieldInit {
    static final int CONST_VALUE=10; //static final을 같이 쓰면 바뀌지 않은 공용변수가 되는 것임->중복과 메모리 낭비 문제 해결

    final int value=10; //여긴 초기값이 있기 때문에
//생성자 안됨
//    public FieldInit(int value) {
//        this.value=value;
//    }
}
