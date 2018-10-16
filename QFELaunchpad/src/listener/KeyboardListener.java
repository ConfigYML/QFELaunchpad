package listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Main;
import windows.MainWindow;

public class KeyboardListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == MainWindow.getFrame()) {
			if(e.getKeyCode() >= 48 && e.getKeyCode() <= 57) {
				String keyCode = String.valueOf(e.getKeyChar());
				Main.getBinding().setLayer(Integer.valueOf(keyCode));
			} else if(e.getKeyCode() >= 96 && e.getKeyCode() <= 105) {
				Main.getMusicManager().playMusic(Main.getBinding().getFileByKey(e.getKeyCode()));
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
