package static2;

import oop1.ValueData;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);

    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("valueData.value = " + valueData.value);

    }
}
//인스턴스 없이 실행하는 가장 대표적인 메서드는 main() 메서드
//객체를 생성하지 않아도 작동, 그 이유는 static이기 때문에
//정적 메서드는 정적메서드만 호출 가능->main()이 호출하는 메서드는 정적 메서드 사용
