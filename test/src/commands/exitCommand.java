package commands;

import java.io.File;

public class exitCommand extends Command {

	public exitCommand(File workingDir) {
		super(workingDir);
	}
	public File execute() {
		System.exit(0);
		return workingDir;
	}
	
}
