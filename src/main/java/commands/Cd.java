package commands;

import java.io.File;
import java.util.Arrays;


public class Cd extends Command {
	private String data;

	public Cd(File workingDir, String data) {
		super (workingDir);
		this.data = data;
	}

	public File execute() {
		File file = addFileStringToWorkingDir(data);

		if (!file.exists()) {
			System.out.println("No such directory exists");
			return workingDir;
		}  else if (data.equalsIgnoreCase("..")) {
			String[] dir = workingDir.getAbsolutePath().split("\\\\");
			String[] newDir = Arrays.copyOf(dir, dir.length - 1);
			String newWorkingDir = String.join("\\", newDir);
			File newFile = new File(newWorkingDir);
			return newFile;
		} else {
			return file;
		}
	}

}
