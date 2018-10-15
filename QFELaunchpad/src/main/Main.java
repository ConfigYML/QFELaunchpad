package main;

import music.Bindings;
import music.MusicManager;
import window.WindowManager;
import windows.MainWindow;

public class Main {

	private static WindowManager wm;
	private static Bindings bind;
	private static MusicManager mm;
	
	public Main() {
		wm = new WindowManager();
		bind = new Bindings();
		mm = new MusicManager();
		
		wm.openWindow(new MainWindow());
	}

	public static void main(String[] args) {
		new Main();
	}
	public static WindowManager getWindowManager() {
		return wm;
	}
	public static Bindings getBinding() {
		return bind;
	}
	public static MusicManager getMusicManager() {
		return mm;
	}
}
