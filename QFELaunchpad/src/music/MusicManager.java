package music;

import java.io.File;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class MusicManager {

	public void playMusic(File f) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				BasicPlayer player = new BasicPlayer();
				try {
					player.open(f);
					player.play();
				} catch (BasicPlayerException e) {
					e.printStackTrace();
				}
			}
		});
		t.start();
	}
}
