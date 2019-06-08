package commands;

import java.io.File;

public class Ls extends Command {
	public Ls(File workingDir) {
		super(workingDir);
	}

	public File execute() {
		File[] pathnames = workingDir.listFiles();

		if (pathnames != null) {
			for (File pathname : pathnames) {
				System.out.println(pathname.getName());
			}
		}

		return workingDir;
	}
}
