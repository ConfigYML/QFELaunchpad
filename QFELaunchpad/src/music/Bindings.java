package music;

import java.io.File;
import java.util.ArrayList;

public class Bindings {
	
	private int layer = 0;
	
	public int getLayer() {
		return layer;
	}
	public void setLayer(int newLayer) {
		layer = newLayer;
	}
	public File getFileByKey(int keycode) {
		return null;
	}
	public ArrayList<File> getFilesFromLayer(int layer) {
		return null;
	}
}
