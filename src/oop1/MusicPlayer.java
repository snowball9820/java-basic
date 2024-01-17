package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;


    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("volumn = " + volume);

    }

    void volumeDown() {
        volume--;
        System.out.println("volumn = " + volume);

    }

    void showStatus() {

        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 on, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 off");
        }

    }

    //MusicPlayerMain4에서 사용


    //캡슐화 MusicPlayer
    //음악플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것과같음
    //속성과 기능을 하나로 묶어 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화 라고 함


}
