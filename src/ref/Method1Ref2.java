package ref;

public class Method1Ref2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90); //이제 참조값을 통해 인스턴스에 접근하고 값을 초기화 한후 student1에 참조값 저장 (x001)
        System.out.println("student1 = " + student1); //createStudent에서 나오는 참조값과 비교
        Student student2 = createStudent("학생2", 16, 80); //이제 참조값을 통해 인스턴스에 접근하고 값을 초기화 한후 student2에 참조값 저장 (x002)
        System.out.println("student2 = " + student2); //createStudent에서 나오는 참조값과 비교
        //->객체 생성 초기화 한번에 가능

        printStudent(student1);
        printStudent(student2);

    }

    //createStudent라는 메서드를 만들고 객체를 생성하는 부분도 이 메서드 안에 함께 포함
    //메서드 하나로 객체의 생성과 초기값 설저을 모두 처리
    //그러나 메서드 안에서 객체 생성을 했기 때문에 메서드 밖에서도 사용할 수 있도록 돌려줘야 함
    //메서드 호출 결과를 return할 수 있음
    //메서드 return을 통해 만들어진 객체의 참조 값을 메서드 밖으로 반환
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); //x001
        System.out.println("student = " + student); //참조값이 같은지 찍어봄
        student.name=name;
        student.age=age;
        student.grade = grade;
        return student;//x001 참조 값이 담긴 변수 / 만들고 세팅이 다 끝난 후에 던져줌 
    }
    //이제 student1, student2 인스턴스에 저장된 값들을 대입하고 결과가 출력되도록 해줌
    //printStudent는 전달한 학생 객체의 필드 값을 읽어서 출력함
    static void printStudent(Student student) {
        System.out.println("이름 : "+student.name+", 나이 : "+student.age+", 성적 : "+student.grade);
    }
}
