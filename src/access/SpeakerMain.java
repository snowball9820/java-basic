package access;

public class SpeakerMain {
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
    }

}
