package commands;

import java.io.File;


public class LsCommand extends Command {

	public LsCommand(File workingDir) {
		super(workingDir);
	}
	public File execute() {
		for (int i = 0; i < workingDir.listFiles().length; i++) {
			System.out.println(workingDir.listFiles()[i]);
		}
		return workingDir;
	}
}
