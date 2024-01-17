package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume=0;
        boolean isOn=false;

        //음악 플레이어 켜기
        isOn=true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        volume++;
        System.out.println("volumn = " + volume);
        //볼륨 증가
        volume++;
        System.out.println("volumn = " + volume);
        //볼륨 감소
        volume--;
        System.out.println("volumn = " + volume);
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 on, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 off");
        }
        //음악 플레이어 끄기
        isOn=false;
        System.out.println("음악 플레이어를 종료");
    }
    //순서대로 코딩을 하는 절차지향 프로그래밍

}
