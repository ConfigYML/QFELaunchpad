package listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import windows.MainWindow;

public class KeyboardListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource() == MainWindow.getFrame())
			System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
