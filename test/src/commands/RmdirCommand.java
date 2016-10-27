package commands;

import java.io.File;

public class RmdirCommand extends Command {
	
	public String data;
	
	public RmdirCommand(File workingDir, String data) {
		super(workingDir);
		this.data = data;
		
	}
	
	public File execute() {
		
		File dirToBeRemoved = addStringToFilename(workingDir, data);
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
	
	
//	public static void main(String[] args) {
//		File folder = new File("D:\\Workspace\\InteProject\\tempTest");
//		removeDirectory(folder);
//	}
	

}
