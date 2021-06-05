package structural.s01_adapter.step1_interfaces;

public interface MediaPlayer {
	int NO_MEDIA = 0;
	int VLC = 1;
	int MP4 = 2;
	int MP3 = 3;

	void play(int audioType, String filename);
}
