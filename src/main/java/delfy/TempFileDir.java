package delfy;

import java.io.File;
import java.io.IOException;

public class TempFileDir {


	//Skapar ett temporärt mappsystem
	public TempFileDir() {

	}
	public static String testFileDir = System.getProperty("user.dir")+"/tempTest";
	public static void createTempDir() {
		File f = new File(System.getProperty("user.dir")+"/tempTest");
		try {
			createTempFile(3, f);
				createTempFile (2, new File(f.getAbsolutePath()+"/folder1"));
				f.deleteOnExit();
				createTempFile (1, new File(f.getAbsolutePath()+"/folder1/folder2"));
				f.deleteOnExit();
				createTempFile (3, new File(f.getAbsolutePath()+"/folder3"));
				f.deleteOnExit();
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
				f.deleteOnExit();
				createTempFile (1, new File(f.getAbsolutePath()+"/folder1/folder2"));
				f.deleteOnExit();
				createTempFile (3, new File(f.getAbsolutePath()+"/folder3"));
				f.deleteOnExit();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}



	private static void createTempFile(int numberOfFiles, File path) throws IOException
	{
		if (!path.exists()) {
			path.mkdir();
		}
		for (int i = 1; i <= numberOfFiles; i++) {
			File.createTempFile("testFile"+i, ".test", path);
		}
	}


}
