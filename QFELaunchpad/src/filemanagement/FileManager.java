package filemanagement;

import java.io.File;
import java.util.ArrayList;

public class FileManager {

	private static File dataDir = new File(System.getProperty("user.home") + "/AppData/Roaming/QFELaunchpad");

	public FileManager() {
		if (!dataDir.exists()) {
			dataDir.mkdir();
		}
		repairFolder();
	}

	public void createFolder() {
		for (int i = 0; i < 9; i++) {
			File f = new File(dataDir.getPath() + "/Layer" + i);
			f.mkdir();
		}
	}

	public void repairFolder() {
		ArrayList<Integer> layersMissing = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			File f = new File(dataDir.getPath() + "/Layer" + i);
			if (!f.exists()) {
				layersMissing.add(i);
			}
		}
		for (Integer i : layersMissing) {
			File f = new File(dataDir.getPath() + "/Layer" + i);
			f.mkdir();
		}
	}
}
