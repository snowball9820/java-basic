package access;

public class Speaker {
    //접근 제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제어가능
    //ex 스피커에 들어가는 소프트웨어를 개발하는 개발자
    //스피커의 음량은 절대로 100을 넘으면 안됨
    //스피커 객체 만들기
    //스피커는 음량을 높이고,내리고,현재 음량 확인하는 단순 기능 제공
    //스피커 음량은 100까지만 증가 가능 넘기면 안됨

    int volume;

    //생성자
    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }

    }
    void volumeDown() {
        if (volume == 0) {
            System.out.println("음량을 더 이상 내릴 수 없습니다. 최소 음량입니다.");
        }else {
            volume -= 10;
            System.out.println("음량을 10 감소합니다.");
        }
    }

    void showVolume() {
        System.out.println("현재 음량 = " + volume);
    }
}
