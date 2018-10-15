package window;

import java.util.ArrayList;

public class WindowManager {
	
	private ArrayList<Window> openWindows = new ArrayList<>();
	
	public void openWindow(Window w) {
		if(!isOpen(w)) {
			w.open();
			openWindows.add(w);
		}
	}
	public void closeWindow(Window w) {
		if(isOpen(w)) {
			w.close();
			openWindows.remove(w);
		}
	}
	public ArrayList<Window> getOpenWindows() {
		return openWindows;
	}
	public boolean isOpen(Window w) {
		return openWindows.contains(w);
	}
}
