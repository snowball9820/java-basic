package class1;

public class ClassStart3 {
    //Student Class 사용
    public static void main(String[] args) {
        //int형 타입처럼 학생이라는 타입을 만들면 되는거 아닐까???
        //클래스를 사용해서 int String과 같은 타입을 만들 수 있게 된다.
        //사용자 정의 타입을 만드려면 설계도가 필요한데 이게 바로 클래스
        //설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
        Student student1; //변수 선언 student 타입의 인스턴스를 받을 수 있음
        student1=new Student(); //student1을 만들고 메모리 공간을 만든다 객체 만들기 참조값이 반환되어 student1에 들어감
        student1.name = "학생1";
        student1.age = 15;
        student1.grade=90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age=16;
        student2.grade = 80;

        System.out.println("이름 :"+student1.name+" 나이 :"+student1.age+" 성적 :"+student1.grade);
        System.out.println("이름 :"+student2.name+" 나이 :"+student2.age+" 성적 :"+student2.grade);

    }
}
