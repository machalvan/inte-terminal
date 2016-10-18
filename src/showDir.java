import java.io.File;

public class showDir {
	
	private String currentDir = "";
	
	public showDir(){
		
	}

	public String getCurrentDir(File path){
		currentDir = path.toString();
		return currentDir;
	}
	
	
}
