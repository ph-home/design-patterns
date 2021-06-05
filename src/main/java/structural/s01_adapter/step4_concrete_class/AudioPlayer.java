package structural.s01_adapter.step4_concrete_class;

import structural.s01_adapter.step1_interfaces.MediaPlayer;
import structural.s01_adapter.step3_adapter_class.MediaAdapter;

import java.util.logging.Logger;

public class AudioPlayer implements MediaPlayer {
	private static final Logger LOGGER = Logger.getGlobal();
	MediaAdapter mediaAdapter;

	@Override
	public void play(int audioType, String filename) {
		// inbuilt support
		if (audioType == MediaPlayer.MP3) {
			LOGGER.fine(() -> "playMp3 <" + filename + ">");
		}

		// mediaAdapter supported formats
		else if (audioType == MediaPlayer.MP4 || audioType == MediaPlayer.VLC) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, filename);
		}

		// unsupported type
		else {
			LOGGER.fine(() -> "invalid media <" + filename + ">");
		}
	}
}
