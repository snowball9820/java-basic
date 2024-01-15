package class1;

import java.rmi.StubNotFoundException;

public class ClassStart5 {
    //Student Class 사용
    public static void main(String[] args) {
        //int형 타입처럼 학생이라는 타입을 만들면 되는거 아닐까???
        //클래스를 사용해서 int String과 같은 타입을 만들 수 있게 된다.
        //사용자 정의 타입을 만드려면 설계도가 필요한데 이게 바로 클래스
        //설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
        Student student1 = new Student(); //student1을 만들고 메모리 공간을 만든다 객체 만들기 참조값이 반환되어 student1에 들어감
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

//        Student[] students = new Student[]{student1, student2};
        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 :" +students[i].name + " 나이 :" + students[i].age + " 성적 :" + students[i].grade);

        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름 :" +s.name + " 나이 :" + s.age + " 성적 :" + s.grade);

        }

        for (Student s : students) {
            System.out.println("이름 :" + s.name + " 나이 :" + s.age + " 성적 :" + s.grade);

        }

//        System.out.println("이름 :" +students[0].name + " 나이 :" + students[0].age + " 성적 :" + students[0].grade);
//        System.out.println("이름 :" +students[1].name + " 나이 :" + students[1].age + " 성적 :" + students[1].grade);

    }
}
