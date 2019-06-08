package commands;

import java.io.File;

public class Exit extends Command {

	public Exit(File workingDir) {
		super(workingDir);
	}

	public File execute() {
		System.exit(0);
		return workingDir;
	}
	
}
