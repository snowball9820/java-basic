package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막아줌
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
