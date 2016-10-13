import java.io.File;
import java.io.IOException;

public class TestDirectory {

	public TestDirectory() {
			 
	}
	public static void createTempDir() {
		File f = new File(System.getProperty("user.dir")+"/tempTest");
		try {
			createTempFile(3, f);
				createTempFile (2, new File(f.getAbsolutePath()+"/folder1"));
					createTempFile (1, new File(f.getAbsolutePath()+"/folder1/folder2"));
				createTempFile (3, new File(f.getAbsolutePath()+"/folder3"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void createTempDir(File path) {
		File f = new File(path+"/tempTest");
		try {
			createTempFile(3, f);
				createTempFile (2, new File(f.getAbsolutePath()+"/folder1"));
					createTempFile (1, new File(f.getAbsolutePath()+"/folder1/folder2"));
				createTempFile (3, new File(f.getAbsolutePath()+"/folder3"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	private static void createTempFile(int numberOfFiles, File path) throws IOException 
	{
		if (!path.exists()) {
			System.out.println(path.mkdir());
		}
		for (int i = 1; i <= numberOfFiles; i++) {
			File.createTempFile("testFile"+i, ".test", path);
		}
	}

}
