package commands;

import java.io.File;

public class Command {
	protected File workingDir;
	
	public Command(File workingDir) {
		this.workingDir = workingDir;
	}
	
	public static Command getCommand(File workingDir, String input) {
		String cmd = "";
		String data = "";
		
		if (!input.contains(" ")) {
			cmd = input;
		} else {
			cmd = input.substring(0, input.indexOf(" "));
			data = input.substring(input.indexOf(" ") + 1);
		}
		
		switch (cmd) {
		case "exit":
			return new Exit(workingDir);
		case "ls":
			return new Ls(workingDir);
		case "cd":
			return new Cd(workingDir, data);
		case "mkdir":
			return new Mkdir(workingDir, data);
		case "rmdir":
			return new Rmdir(workingDir, data);
		
		default :
			System.out.println("Not a valid command");
			break;
		}
		return new Command(workingDir);
	}

	protected File addFileStringToWorkingDir(String fileToBeAdded) {
		return new File(workingDir.getAbsolutePath() + "/" + fileToBeAdded);
	}
	
	public File execute() {
		return workingDir;
	}
}
