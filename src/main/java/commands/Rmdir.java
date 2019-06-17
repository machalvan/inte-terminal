package commands;

import java.io.File;

public class Rmdir extends Command {
	private String data;
	
	public Rmdir(File workingDir, String data) {
		super(workingDir);
		this.data = data;
	}
	
	public File execute() {
		File dirToBeRemoved = addFileStringToWorkingDir(data);
		removeDirectory(dirToBeRemoved);
		return workingDir;
	}
	
	public static Boolean removeDirectory(File directory) {
		try {
			if(directory.exists()) {
				if(directory.isDirectory()) {
					File[] files = directory.listFiles();
					for(File file : files) {
						if(directory.isDirectory()) {
							removeDirectory(file);
						}
						else {
							file.delete();
						}
					}	
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (directory.delete());
	}
}
