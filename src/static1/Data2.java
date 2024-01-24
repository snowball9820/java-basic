package static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++; //밖에서 넘어온 카운터의 값을 하나씩 증가
    }

}
