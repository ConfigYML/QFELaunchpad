package windows;

import javax.swing.JFrame;

import listener.KeyboardListener;
import window.Window;

public class MainWindow implements Window {

	private static JFrame frame;
	
	@Override
	public void open() {
		frame = new JFrame("QFELaunchpad");
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		frame.addKeyListener(new KeyboardListener());
	}

	@Override
	public void close() {
		frame.dispose();
	}

	public static JFrame getFrame() {
		return frame;
	}
}
