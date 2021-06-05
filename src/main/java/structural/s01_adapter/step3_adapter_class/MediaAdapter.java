package structural.s01_adapter.step3_adapter_class;

import structural.s01_adapter.step1_interfaces.AdvancedMediaPlayer;
import structural.s01_adapter.step1_interfaces.MediaPlayer;
import structural.s01_adapter.step2_concrete_classes.Mp4Player;
import structural.s01_adapter.step2_concrete_classes.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(int audioType) {
		switch (audioType) {
			case MediaPlayer.VLC:
				advancedMediaPlayer = new VlcPlayer();
				break;
			case MediaPlayer.MP4:
				advancedMediaPlayer = new Mp4Player();
				break;
			default:
				break;
		}
	}
	
	@Override
	public void play(int audioType, String filename) {
		switch (audioType) {
			case MediaPlayer.VLC:
				advancedMediaPlayer.playVlc(filename);
				break;
			case MediaPlayer.MP4:
				advancedMediaPlayer.playMp4(filename);
				break;
			default:
				break;
		}
	}
}
