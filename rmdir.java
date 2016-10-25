import java.io.File;

public class rmdir {
	
	public String userInput;
	
	public static Boolean removeDirectory(File directory) {

		//File folder = new File(System.getProperty("user.dir"));
		
		
		/*
		 * error ifall katalogen inte är tom
		 * error ifall filen inte hittas
		 */
		
		try {
			if(directory.exists()){
				if(directory.isDirectory()){
					File[] files = directory.listFiles();
					for(File file : files){
						file.delete();
					}
					
					//folder.delete();
					
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return (directory.delete());

	}
	
	
//	
//	public static Boolean removeDirectoryOne(File directory) {
//	    if(directory.exists()){
//	    	File[] files = directory.listFiles();
//	    	if(files!=null){
//	    		for(int i=0; i<files.length; i++) {
//	    			if(files[i].isDirectory()) {
//	    				removeDirectory(files[i]);
//	    			}
//	    			else {
//	    				files[i].delete();
//	    			}
//	    		}
//	    	}
//	    }
//		return(directory.delete());	
//	}
//	
	
	
	public static void main(String[] args){
		File folder = new File("D:\\Workspace\\InteProject\\tempTest");
		removeDirectory(folder);
	}
	
	public String setUserInput(String ui) {
		userInput = ui;
		return userInput;
	}
	
	public String getUserInput() {
		return userInput;
	}
}
