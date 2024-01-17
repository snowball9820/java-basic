package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("volumn = " + data.volume);

    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("volumn = " + data.volume);

    }

    static void showStatus(MusicPlayerData data) {

        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 on, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 off");
        }

    }

    //중복제거
    //변경 영향 범위 - 수정할 때 메서드 내부만 변경하면 됨
    ///메서드 이름 추가 - 이름을 통해 코드를 더 쉽게 이해

    //모듈화 - 레고블럭과 비슷, 필요한 블럭을 가져와서 꼽음, 음악 플레이어의 기능이 필요하면 해당 메서드를 호출하면 됨(블럭==메서드)

}
