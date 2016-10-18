import java.io.File;

public class rmdir {
	
	public static boolean removeDirectory(File directory) {
	    if(directory.exists()){
	        File[] files = directory.listFiles();
	        if(files!=null){
	            for(int i=0; i<files.length; i++) {
	                if(files[i].isDirectory()) {
	                    removeDirectory(files[i]);
	                }
	                else {
	                    files[i].delete();
	                }
	            }
	        }
	    }
	    return(directory.delete());
	}

}
