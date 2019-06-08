package commands;

import java.io.File;

public class Cd extends Command{
	private String data;

	public Cd(File workingDir, String data) {
		super (workingDir);
		this.data = data;
	}

	public File execute() {
		File file = addStringToFilename(workingDir, data);

		if (!file.exists()) {
			System.out.println("No such directory exists");
			return workingDir;
		} else {
			return file;
		}
	}

}
