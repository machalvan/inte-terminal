package commands;

import java.io.File;

public class CdCommand extends Command{
	private String data;

	public CdCommand(File workingDir, String data) {
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
