package main;

import window.WindowManager;
import windows.MainWindow;

public class Main {

	private static WindowManager wm;
	
	public Main() {
		wm = new WindowManager();
		
		wm.openWindow(new MainWindow());
	}

	public static void main(String[] args) {
		new Main();
	}
	public static WindowManager getWindowManager() {
		return wm;
	}
}
