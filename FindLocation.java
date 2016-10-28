import java.io.File;

public class FindLocation {
	
	private String currentDirectory = System.getProperty("user.dir");
	private TestDirectory td = new TestDirectory();
	//private File f = new File(System.getProperty("user.dir") + "/tempTest");
	
	FindLocation() {
		td.createTempDir();
	}
	
	public String getString() {
		return currentDirectory;
	}
	
	public File getHomeDir() {
		return td.getFileLocation();
	}
	
	public String getCurrentDirPath() {
		return getHomeDir().getAbsolutePath();
	}
	
}
