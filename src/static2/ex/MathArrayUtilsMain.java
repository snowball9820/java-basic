package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    //배열용 수학 유틸리티 클래스를 만들자
    //sum(int[] array)  배열의 모든 요소를 더해 합계 반환
    //average(int[] array) 배열의 모든 요소의 평균값을 계산
    //min(int[] array) 배열에서 최소값을 찾음
    //max(int[] array) 배열에서 최대값을 찾음

//요구사항
    //MathArrayUtils는 객체 생성하지 말고 사용, 인스턴스를 생성하지 못하게 막기->static private
    //실행코드에 static import 사용 가능

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("sum = "+ sum(array));
        System.out.println("average = "+ average(array));
        System.out.println("min = "+ min(array));
        System.out.println("max = "+ max(array));

    }
}
