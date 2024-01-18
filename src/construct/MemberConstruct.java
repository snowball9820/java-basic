package construct;

public class MemberConstruct {
    //대부분의 객체지향 언어는 객체를 생성하자마자 즉시 필요한 기능을 편리학 수행할 수 있도록
    //생성자라는 기능을 제공함
    //생성자를 사용하면 객체를 생성하는 시점에서 즉시 필요한 기능을 수행할 수 있음
    //생성자는 initMemeber() 메서드와 유사하지만 몇가지 다른 점이 있음

    String name;
    int age;
    int grade;

    //추가 (생성자 오버로딩)
    MemberConstruct(String name, int age) {
//        this.name=name;
//        this.age = age;
//        this.grade=50; //name과 age 값만 들어오면 grade는 자동으로 50
        //코드 변경
        this(name, age, 50);//이 코드는 첫번째 생성자 내부에서 두번째 생성자를 호출
        //this()를 사용하면 생성자 배부에서 다른 생성자를 호출가능 -> 중복제거
        //this()는 무조건 생성자에서 첫번째 문장에 해당해야 함 두번째 줄 이상이면 오류 남
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = "+name+", age = "+age+", grade = "+grade);
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    //위가 바로 생성자
    //생성자 이름은 클래스 이름과 같아야 함
    //그래서 생성자는 첫글자가 대문자로 시작
    //생성자는 반환 타입이 없음
    //나머지는 메서드와 동일

}
