package access;

public class SpeakerMain1 {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        for (int i = 0; i <10; i++) {
            speaker.volumeDown();
        }
        speaker.showVolume();
        //업그레이드 버전의 스피커-> 스피커 음량 최대가 100이었는데 200으로 올리고 싶음
        //필드에 직접 접근
        System.out.println("volume 필드에 직접 접근&수정 불가");
//        speaker.volume=200;e
        speaker.showVolume();

        //speaker 객체를 사용하는 사용자가 Speaker의 volume 필드와 메서드에 모두 접근할 수 있음->문제
        //volumeUp()과 같은 메서드를 만들어서 음량이 100을 넘지 못하게 개발했지만 소용X->Speaker를 사용하는 이장에서 volume필드에 직접 접근 가능
        //이러한 문제를 막기 위해 외부 접근을 막아야 함
        //좋은 프로그램은 무한한 자유가 아닌 적절한 제한이 있는 프로그램임
    }

}
