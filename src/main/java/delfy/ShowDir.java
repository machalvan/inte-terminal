package delfy;

import java.io.File;

public class ShowDir {

	private String currentDir = "";

	public ShowDir(){

	}

	public String getCurrentDir(File path){
		currentDir = path.toString();
		return currentDir;
	}


}
