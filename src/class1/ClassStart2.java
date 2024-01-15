package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3", "학생"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrade = {90, 100, 80, 70};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i]);

        }
    }
}
