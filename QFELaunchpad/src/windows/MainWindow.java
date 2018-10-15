package windows;

import java.awt.Container;

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
		frame.addKeyListener(new KeyboardListener());
		
		Container cp = frame.getContentPane();
		cp.setLayout(null);
		
		
		
		frame.setVisible(true);
	}

	@Override
	public void close() {
		frame.dispose();
	}

	public static JFrame getFrame() {
		return frame;
	}
}
