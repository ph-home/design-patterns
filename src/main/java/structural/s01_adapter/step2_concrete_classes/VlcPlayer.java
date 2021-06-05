package structural.s01_adapter.step2_concrete_classes;

import structural.s01_adapter.step1_interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.printf("playVlc <%s>%n", filename);
    }

    @Override
    public void playMp4(String filename) {
        System.out.printf("playMp4 <%s>%n", filename);
    }
}
