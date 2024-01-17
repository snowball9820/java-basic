package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        //여긴 클라이언트 코드 (사용자 입장)

        MusicPlayer player = new MusicPlayer();

        //음악 플레이어 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();

        //MusicPlayer에서 모든 기능을 만들고
        //여기서는 필요한 기능을 실행함 필요한 메서드만 호출해도 똑같이 나옴
        //MusicPlayer를 사용하는 입장에서는 MusicPlayer인 volume, isOn 같은 데이터는 전혀 사용하지 않음
        //내부에 어떤 속성(데이터)가 있는지 전혀 몰라도 됨
        //사용하는 입장에서는 제공하는 기능 중에 필요한 기능을 호출해서 "사용"만 하면 됨

        //캡슐화 MusicPlayer
        //음악플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것과같음
        //속성과 기능을 하나로 묶어 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화 라고 함

        //객체지향 프로그램으로 코드를 짜면 객체를 사용하는 입장에서 진짜 음악 플레이어를 만들고 사용하는 것 처럼 친숙하게 느껴짐
        //속성(멤버변수)과 기능이 한 곳에 있어서 변경도 더욱 수월
        //-> MusicPlayer의 volume이라는 필드 이름을 다른 이름으로 변경할 때 MusicPlayer 내부만 변경하면 됨

        //절차는 순서가 중요했으나 객체지향은 어떻게 기능을 만들것인지가 더 중요함
        //모든 사물은 속성과 기능으로 이루어져 있음
        //프로그래밍을 할 때 사람에게 친숙한 방식이 객체지향
    }
}
