package window;

import java.util.ArrayList;

public class WindowManager {
	
	private ArrayList<Window> openWindows = new ArrayList<>();
	
	public void openWindow(Window w) {
		if(!w.isOpen()) {
			w.open();
			openWindows.add(w);
		}
	}
	public void closeWindow(Window w) {
		if(w.isOpen()) {
			w.close();
			openWindows.remove(w);
		}
	}
	public ArrayList<Window> getOpenWindows() {
		return openWindows;
	}
}
