package commands;

import java.io.File;

public class CdCommand extends Command{

	String data;
	public CdCommand(File workingDir, String data) {
		super (workingDir);
		this.data = data;
	}
	public File execute() {
		File test = addStringToFilename(workingDir, data);
		if (!test.exists()) {
			System.out.println("No such directory exists");
			return workingDir;
		}
		else {

			return test;
		}
	}

}
