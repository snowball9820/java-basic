package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
        //자신과 가까운 매개변수를 찾음 nameParameter는 nameField는 지역변수에 없어서 가까운 멤버변수에서 찾음
        //nameField는 this 생략
        //멤버변수 접근 할 때에는 무조건 this를 쓰자고 하는 코딩 스타일도 있음(과거에 이런 식으로 함)
        //IDE가 발전해서 굳이... 최근 개발자들은 잘 안씀 어차피 알아서 멤버변수는 같은 색으로 구분해줌


    }

}
