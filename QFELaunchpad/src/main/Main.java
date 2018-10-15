package main;

import window.WindowManager;

public class Main {

	private static WindowManager wm;
	
	public Main() {
		wm = new WindowManager();
	}

	public static void main(String[] args) {
		new Main();
	}
	public static WindowManager getWindowManager() {
		return wm;
	}
}
