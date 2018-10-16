package music;

import java.io.File;
import java.util.ArrayList;

import main.Main;

public class Bindings {

	private int layer = 0;

	public int getLayer() {
		return layer;
	}

	public void setLayer(int newLayer) {
		layer = newLayer;
	}

	public File getFileByKey(int keycode) {
		File dir = new File(Main.getFileManager().getDataDir().getPath() + "/Layer" + layer);
		if (dir.exists()) {
			switch (keycode) {
			case 96:
				return new File(dir.getPath() + "/Music00.mp3");
			case 97:
				return new File(dir.getPath() + "/Music01.mp3");
			case 98:
				return new File(dir.getPath() + "/Music02.mp3");
			case 99:
				return new File(dir.getPath() + "/Music03.mp3");
			case 100:
				return new File(dir.getPath() + "/Music04.mp3");
			case 101:
				return new File(dir.getPath() + "/Music05.mp3");
			case 102:
				return new File(dir.getPath() + "/Music06.mp3");
			case 103:
				return new File(dir.getPath() + "/Music07.mp3");
			case 104:
				return new File(dir.getPath() + "/Music08.mp3");
			case 105:
				return new File(dir.getPath() + "/Music09.mp3");
			default:
				break;
			}
		} else {
			return null;
		}
		return null;
	}

	public ArrayList<File> getFilesFromLayer(int layer) {
		ArrayList<File> files = new ArrayList<>();
		File dir = new File(Main.getFileManager().getDataDir().getPath() + "/Layer" + layer);
		if (dir.exists()) {
			for (int i = 0; i < 10; i++) {
				File f = new File(dir.getPath() + "/Music0" + i + ".mp3");
				if (f.exists()) {
					files.add(f);
				}
			}
		}
		return files;
	}
}
