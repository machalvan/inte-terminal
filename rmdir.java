import java.io.File;

public class rmdir {
	
	public String userInput;
	
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
	
	public String setUserInput(String ui) {
		userInput = ui;
		return userInput;
	}
	
	public String getUserInput() {
		return userInput;
	}
	
	public boolean checkUi(String ui) {
		if(ui == null) {
			return false;
		} 
		else {
			return true;
		}
	}
	
}
