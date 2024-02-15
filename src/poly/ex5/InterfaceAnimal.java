package poly.ex5;

//인터페이스는 순수 추상클래스에서 편의기능이 더해진 것과 같음
//인터페이스의 메서드는 모두 public abstract->그래서 생략 권장
//인터페이스는 다중구현(다중상속)지원

//인터페이스에서 멤버 변수는 public static final이 모두 포함되었다고 간주

public interface InterfaceAnimal {
    void sound(); //public abstract 생략
    void move(); //public abstract 생략


}
