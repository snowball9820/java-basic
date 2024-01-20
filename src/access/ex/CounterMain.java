package access.ex;

public class CounterMain {

    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter(3); //MaxCounter의 max값에 3을 넣어줌
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        int count = maxCounter.getCount();
        System.out.println(count);


    }
}
