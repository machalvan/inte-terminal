package commands;

import java.io.File;

public class ExitCommand extends Command {

	public ExitCommand(File workingDir) {
		super(workingDir);
	}
	public File execute() {
		System.exit(0);
		return workingDir;
	}
	
}
