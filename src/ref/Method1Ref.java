package ref;

public class Method1Ref {
    public static void main(String[] args) {
        Student student1 = new Student(); //객체1
        initStudent(student1,"학생1",15,90);//지금 참조값을 통해 인스턴스를 이렇게 저장해둠

        Student student2 = new Student(); //객체2
        initStudent(student2,"학생2",16,80);//지금 참조값을 통해 인스턴스를 이렇게 저장해둠

        printStudent(student1);
        printStudent(student2);


    }

    //대입하는 부분도 메서드로 만들기
    //참조형은 메서드를 호출할 때 참조값을 저장함, 따라서 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나 값을 읽어서 사용 가능
    //initStudent는 전달한 학생 객체의 필드 값을 설정함
    static void initStudent(Student student, String name, int age, int grade) {
        student.name=name; //참조값을 통해서 student.name에 접근하는데 매개변수 name에 들어온 값을 넣어주게 된다.
        student.age=age; //참조값을 통해서 student.age에 접근하는데 매개변수 age에 들어온 값을 넣어주게 된다.
        student.grade = grade; //참조값을 통해서 student.grade에 접근하는데 매개변수 grade에 들어온 값을 넣어주게 된다.
    }


    //이제 student1, student2 인스턴스에 저장된 값들을 대입하고 결과가 출력되도록 해줌
    //printStudent는 전달한 학생 객체의 필드 값을 읽어서 출력함
    static void printStudent(Student student) {
        System.out.println("이름 : "+student.name+", 나이 : "+student.age+", 성적 : "+student.grade);
    }
}
