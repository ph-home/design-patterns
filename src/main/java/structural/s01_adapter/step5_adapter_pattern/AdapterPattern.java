package structural.s01_adapter.step5_adapter_pattern;

import structural.s01_adapter.step1_interfaces.MediaPlayer;
import structural.s01_adapter.step4_concrete_class.AudioPlayer;

public class AdapterPattern {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play(MediaPlayer.MP3, "MediaPlayer.MP3");
		audioPlayer.play(MediaPlayer.MP4, "MediaPlayer.MP4");
		audioPlayer.play(MediaPlayer.VLC, "MediaPlayer.VLC");
		audioPlayer.play(MediaPlayer.NO_MEDIA, "MediaPlayer.NO_MEDIA");
	}
}
